package gentools

import java.io.{File, PrintWriter}
import java.nio.file.Path

import atg.adapter.gsa.GSARepository
import atg.nucleus.GenericService
import atg.repository.MutableRepository
import scala.collection.JavaConverters._

/**
  * Created by Sergei_Dianov on 6/6/2017.
  */
class RepositoryWrapperGenerator(repositories: Map[String, MutableRepository]) {

  case class WrapperFile(name: String, path: List[String])

  def writeFiles(exportPath: Path): Unit = {

    val result = repositories.map { repo =>

      val component = repo._2.asInstanceOf[GenericService];

      val file = WrapperFile(
        name = repo._1 + "Wrapper",
        path = component.getNameContext.listElementNames().asScala.map(_.asInstanceOf[String]).toList)

      file
    }


    result.foreach { file =>
      val dir = exportPath + "/" + file.path.mkString("/");
      new File(dir).mkdirs()
      val pw = new PrintWriter(new File(dir + "/" + file.name))

      val content = fileContent(file = file)
      pw.println(content);
      pw.close();
    }

  }


  def fileContent(file: WrapperFile) =
    s"""
       |package ${file.path.mkString(".")};
       |
       |public class ${file.name} {
       |
       |  private GSARepository wrapped;
       |  public static ${file.name} wrap(GSARepository repository) {
       |    wrapped = repository;
       |  }
       |}
      """.stripMargin


}
