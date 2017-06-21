package gentools

import java.io.{File, PrintWriter}
import java.nio.file.{Path, Paths}

import atg.adapter.gsa.{GSAPropertyDescriptor, GSARepository}
import atg.beans.DynamicPropertyDescriptor
import atg.nucleus.GenericService
import atg.repository.{MutableRepository, RepositoryItem, RepositoryItemDescriptor, RepositoryView}
import gentools.data.GenerationInfo
import Utils._
import gentools.templates.RepositoryWrapperFile

import scala.collection.JavaConverters._

/**
  * Created by Sergei_Dianov on 6/6/2017.
  */

class RepositoryWrapperGenerator(info : GenerationInfo) {

  val repositories = info.repositories;

  def writeFiles(exportPath: Path): Unit = {

    repositories.foreach { repo =>
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
          case gsa: GSAPropertyDescriptor => gsa.getPropertyItemDescriptor.getItemDescriptorName
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

      if (ptype.isAssignableFrom(classOf[java.util.Map[_, _]])) {
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

      val getterName = validIdent("get" + prop.capitalize);
      val setterName = validIdent("set" + prop.capitalize);

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


    val viewClasses = views.map { view =>

      val className = s"""${validIdent(view.getViewName.capitalize)}View""";

      val desc = view.getItemDescriptor;
      val descClassName = validIdent(desc.getItemDescriptorName.capitalize) + "Item";

      s"""
         |    // VIEW : ${view.getViewName}
         |    public static final String ${viewToConstName(view)} = "${view.getViewName}";
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
         |        final RepositoryView view = wrapped.getView(${viewToConstName(view)});
         |        return new $className(view);
         |    }
         |
       """.stripMargin
    }.mkString("\n")

    val file = new RepositoryWrapperFile (packageName, wrapperClassName, itemConsts(), itemClasses, viewClasses)
    file.generate()

  }
}
