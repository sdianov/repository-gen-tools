package gentools

import java.io.{File, PrintWriter}
import java.nio.file.{Path, Paths}

import atg.adapter.gsa.GSARepository
import atg.nucleus.GenericService
import atg.repository.{MutableRepository, RepositoryItemDescriptor}

import scala.collection.JavaConverters._

/**
  * Created by Sergei_Dianov on 6/6/2017.
  */

class RepositoryWrapperGenerator(repositories: Map[String, MutableRepository]) {

  def writeFiles(exportPath: Path): Unit = {

    val result = repositories.map { repo =>

      val outFile = new java.io.File(Paths.get(exportPath.toString, repo._1 + "Wrapper.java").toString);
      outFile.getParentFile.mkdirs();

      val component = repo._2.asInstanceOf[GenericService];

      val packageName = repo._1.split("/").drop(1).dropRight(1).mkString(".");
      val className = component.getName + "Wrapper";

      val pw = new PrintWriter(outFile)

      val descriptorNames = repo._2.getItemDescriptorNames.toList;
      val descriptors = descriptorNames.map(x => repo._2.getItemDescriptor(x))


      val content = fileContent(packageName, className, descriptors)
      pw.println(content);
      pw.close();
    }

  }


  def fileContent(packageName: String, className: String, itemDescriptors: List[RepositoryItemDescriptor]) = {

    def propToConstName(propName: String) = s"""${propName.toUpperCase}_PROP"""

    def propConsts(descriptor: RepositoryItemDescriptor) = descriptor.getPropertyNames.map { prop =>
      s"""        public static final String ${propToConstName(prop)}="$prop";"""
    }.mkString("\n")

    def properties(descriptor: RepositoryItemDescriptor) = descriptor.getPropertyNames.map { prop =>
      val getterName = "get" + prop.capitalize;
      val setterName = "set" + prop.capitalize;

      s"""        // ${prop}
          |        public Object ${getterName}() {
          |            return wrapped.getPropertyValue(${propToConstName(prop)});
          |        }
          |
          |        public void ${setterName}(Object value){
          |            wrapped.setPropertyValue(${propToConstName(prop)}, value);
          |        }
        """.stripMargin
    }.mkString("\n")

    val itemClasses = itemDescriptors.map { desc =>
      val name = desc.getItemDescriptorName;
      val className = name.capitalize + "Item";

      val propLines = properties(desc);

      s"""    // $name
          |    public static class $className {
          |
          |${propConsts(desc)}
          |
          |        private MutableRepositoryItem wrapped;
          |
          |        public MutableRepositoryItem getWrapped() {
          |            return wrapped;
          |        }
          |
          |        public $className(final MutableRepositoryItem pRepositoryItem) {
          |            wrapped = pRepositoryItem;
          |        }
          |
          |$propLines
          |
          |    }
      """.stripMargin
    }.mkString("\n")

    s"""package $packageName;
       |
       |import atg.adapter.gsa.GSARepository;
       |import atg.repository.MutableRepositoryItem;
       |
       |public class $className {
       |
       |    private GSARepository wrapped;
       |
       |    private $className(final GSARepository pWrapped) {
       |        this.wrapped = pWrapped;
       |    }
       |
       |    public static $className wrap(final GSARepository pRepository) {
       |        return new $className(pRepository);
       |    }
       |
       |$itemClasses
       |
       |}
      """.stripMargin
  }
}
