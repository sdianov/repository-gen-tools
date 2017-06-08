package gentools

import java.io.{File, PrintWriter}
import java.nio.file.{Path, Paths}

import atg.adapter.gsa.{GSAPropertyDescriptor, GSARepository}
import atg.beans.DynamicPropertyDescriptor
import atg.nucleus.GenericService
import atg.repository.{MutableRepository, RepositoryItem, RepositoryItemDescriptor, RepositoryView}

import scala.collection.JavaConverters._

/**
  * Created by Sergei_Dianov on 6/6/2017.
  */

class RepositoryWrapperGenerator(repositories: Map[String, MutableRepository]) {

  def validIdent(s : String) = s.replace("-", "_").replace(" ", "_")

  def writeFiles(exportPath: Path): Unit = {

    val result = repositories.map { repo =>
      println(s"Writting component: ${repo._1}");
      val component = repo._2.asInstanceOf[GenericService];

      val packageName = repo._1.split("/").drop(1).dropRight(1).mkString(".");
      val className = repo._1.split("/").last + "Wrapper";
      val packagePath = repo._1.split("/").drop(1).dropRight(1).mkString("/");

      val outFile = new java.io.File(Paths.get(exportPath.toString, packagePath, className + ".java").toString);
      outFile.getParentFile.mkdirs();



      val pw = new PrintWriter(outFile)

      val descriptorNames = repo._2.getItemDescriptorNames.toList;
      val descriptors = descriptorNames.map(x => repo._2.getItemDescriptor(x))

      val viewNames = repo._2.getViewNames.toList
      val views = viewNames.map(x => repo._2.getView(x))

      val content = fileContent(packageName, className, descriptors, views)
      pw.println(content);
      pw.close();
    }

  }


  def fileContent(packageName: String, wrapperClassName: String, itemDescriptors: List[RepositoryItemDescriptor], views: List[RepositoryView]) = {

    def propToConstName(propName: String) = s"""${validIdent(propName.toUpperCase)}_PROP"""

    def propConsts(descriptor: RepositoryItemDescriptor) = descriptor.getPropertyNames.map { prop =>
      s"""        public static final String ${propToConstName(prop)} = "$prop";"""
    }.mkString("\n")

    def typeMap(propertyDescriptor: DynamicPropertyDescriptor): String = {
      val ptype = propertyDescriptor.getPropertyType

      if (ptype.isArray) {
        val compType = ptype.getComponentType;
        return s"${compType.getName}[]"; // TODO
      }

      if (ptype.equals(classOf[RepositoryItem])) {

        val ctype = propertyDescriptor match {
          case gsa : GSAPropertyDescriptor => gsa.getPropertyItemDescriptor.getItemDescriptorName
          case x => x.getName
        }
        return s" /* $ctype */ RepositoryItem"
      }

      if (ptype.isAssignableFrom(classOf[java.util.List[_]])) {
        val compType = propertyDescriptor.getComponentPropertyType;
        return s"java.util.List<${compType.getName}>"
      }

      if (ptype.isAssignableFrom(classOf[java.util.Set[_]])) {
        val compType = propertyDescriptor.getComponentPropertyType;
        return s"java.util.Set<${compType.getName}>"
      }

      if (ptype.isAssignableFrom(classOf[java.util.Map[_,_]])) {
        return s"java.util.Map<?,?>"
      }

      val packaje = ptype.getPackage

      if (packaje.getName == "java.lang") {
        return ptype.getSimpleName
      }

      return ptype.getName
    }


    def properties(descriptor: RepositoryItemDescriptor): String = descriptor.getPropertyNames.map { prop =>

      val propertyDescriptor: DynamicPropertyDescriptor = descriptor.getPropertyDescriptor(prop);

      val ptype = typeMap(propertyDescriptor)

      val getterName = "get" + prop.capitalize;
      val setterName = "set" + prop.capitalize;

      val getter: String =
        s"""        // ${prop} : ${propertyDescriptor.getPropertyType.getName}
           |        public ${ptype} ${getterName}() {
           |            return (${ptype}) wrapped.getPropertyValue(${propToConstName(prop)});
           |        }
           |""".stripMargin

      val setter: String = if (propertyDescriptor.isWritable) {
        s"""
           |        public void ${setterName}(${ptype} value){
           |            wrapped.setPropertyValue(${propToConstName(prop)}, value);
           |        }
        """.stripMargin
      }
      else "";

      getter + setter
    }.mkString("\n")

    def descToConstName(descriptor: RepositoryItemDescriptor) = validIdent(s"""${descriptor.getItemDescriptorName.toUpperCase}_DESC""")

    def itemConsts(): String = itemDescriptors.map { desc =>
      s"""    public static final String ${descToConstName(desc)} = "${desc.getItemDescriptorName}";"""
    }.mkString("\n")

    val itemClasses = itemDescriptors.map { desc =>
      val name = desc.getItemDescriptorName;
      val className = validIdent(name.capitalize) + "Item";

      val propLines = properties(desc);

      s"""    // $name
         |    public static class $className extends RepositoryItemImpl {
         |
         |${propConsts(desc)}
         |
         |        public $className(final MutableRepositoryItem pRepositoryItem) {
         |            wrapped = pRepositoryItem;
         |        }
         |
         |$propLines
         |
         |    }
         |
         |    public $className get${className}(final String itemId) throws RepositoryException {
         |        validateNonBlank(itemId, "get${className}: Item ID cannot be empty");
         |        final MutableRepositoryItem item = (MutableRepositoryItem)wrapped.getItem(itemId, ${descToConstName(desc)});
         |        return new $className(item);
         |    }
      """.stripMargin
    }.mkString("\n")

    def viewToConst(view: RepositoryView) = validIdent(s"""${view.getViewName.toUpperCase}_VIEW""")

    val viewClasses = views.map { view =>

      val className = s"""${validIdent(view.getViewName.capitalize)}View""";

      val desc = view.getItemDescriptor;
      val descClassName = validIdent(desc.getItemDescriptorName.capitalize) + "Item";

      s"""
         |    // VIEW : ${view.getViewName}
         |    public static final String ${viewToConst(view)} = "${view.getViewName}";
         |
         |    public static class $className extends RepositoryViewImpl {
         |
         |        public $className(RepositoryView pRepositoryView) {
         |            wrapped = pRepositoryView;
         |        }
         |
         |        public List<${descClassName}> executeTypedQuery(Query pQuery) throws RepositoryException {
         |            RepositoryItem[] result = wrapped.executeQuery(pQuery);
         |            if (result == null)
         |                return Collections.emptyList();
         |            return Arrays.stream(result).map(x -> new ${descClassName}((MutableRepositoryItem) x)).collect(Collectors.toList());
         |        }
         |
         |    }
         |
         |    public $className get${className}() throws RepositoryException {
         |        final RepositoryView view = wrapped.getView(${viewToConst(view)});
         |        return new $className(view);
         |    }
         |
       """.stripMargin
    }.mkString("\n")

    s"""package $packageName;
       |
       |import atg.adapter.gsa.GSARepository;
       |import atg.repository.MutableRepositoryItem;
       |import atg.repository.Query;
       |import atg.repository.QueryBuilder;
       |import atg.repository.QueryOptions;
       |import atg.repository.Repository;
       |import atg.repository.RepositoryException;
       |import atg.repository.RepositoryItem;
       |import atg.repository.RepositoryItemDescriptor;
       |import atg.repository.RepositoryView;
       |import atg.repository.SortDirectives;
       |
       |import java.util.Arrays;
       |import java.util.Collection;
       |import java.util.Collections;
       |import java.util.List;
       |import java.util.stream.Collectors;
       |
       |abstract class RepositoryItemImpl implements MutableRepositoryItem {
       |
       |    protected MutableRepositoryItem wrapped;
       |
       |    public MutableRepositoryItem getWrapped() {
       |        return wrapped;
       |    }
       |
       |    @Override
       |    public void setPropertyValue(String pS, Object pO) {
       |        wrapped.setPropertyValue(pS, pO);
       |    }
       |
       |    @Override
       |    public String getRepositoryId() {
       |        return wrapped.getRepositoryId();
       |    }
       |
       |    @Override
       |    public Object getPropertyValue(String pS) {
       |        return wrapped.getPropertyValue(pS);
       |    }
       |
       |    @Override
       |    public Repository getRepository() {
       |        return wrapped.getRepository();
       |    }
       |
       |    @Override
       |    public RepositoryItemDescriptor getItemDescriptor() throws RepositoryException {
       |        return wrapped.getItemDescriptor();
       |    }
       |
       |    @Override
       |    public boolean isTransient() {
       |        return wrapped.isTransient();
       |    }
       |
       |    @Override
       |    public Collection<String> getContextMemberships() throws RepositoryException {
       |        return wrapped.getContextMemberships();
       |    }
       |
       |    @Override
       |    public String getItemDisplayName() {
       |        return wrapped.getItemDisplayName();
       |    }
       |
       |}
       |
       |abstract class RepositoryViewImpl implements RepositoryView {
       |
       |    protected RepositoryView wrapped;
       |
       |    @Override
       |    public String getViewName() {
       |        return wrapped.getViewName();
       |    }
       |
       |    @Override
       |    public RepositoryItemDescriptor getItemDescriptor() throws RepositoryException {
       |        return wrapped.getItemDescriptor();
       |    }
       |
       |    @Override
       |    public QueryBuilder getQueryBuilder() {
       |        return wrapped.getQueryBuilder();
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, SortDirectives pSortDirectives) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pSortDirectives);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, int pI) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pI);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, int pI, SortDirectives pSortDirectives) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pI, pSortDirectives);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, int pI, int pI1) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pI, pI1);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, int pI, int pI1, SortDirectives pSortDirectives)
       |            throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pI, pI1, pSortDirectives);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, QueryOptions pQueryOptions) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pQueryOptions);
       |    }
       |
       |    @Override
       |    public int executeCountQuery(Query pQuery) throws RepositoryException {
       |        return wrapped.executeCountQuery(pQuery);
       |    }
       |}
       |
       |
       |public class $wrapperClassName {
       |
       |    private GSARepository wrapped;
       |
       |    private $wrapperClassName(final GSARepository pWrapped) {
       |        this.wrapped = pWrapped;
       |    }
       |
       |    public static $wrapperClassName wrap(final GSARepository pRepository) {
       |        return new $wrapperClassName(pRepository);
       |    }
       |
       |    // Utilily methods
       |    private void validateNonBlank(final String pString, final String pMessage) {
       |        if (pString == null || pString.length() == 0 || pString.trim().length() == 0) {
       |            throw new IllegalArgumentException(pMessage);
       |        }
       |    }
       |
       |${itemConsts()}
       |
       |$itemClasses
       |
       |$viewClasses
       |}
      """.stripMargin
  }
}
