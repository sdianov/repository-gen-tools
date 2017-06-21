package gentools

import java.io.PrintWriter
import java.nio.file.{Path, Paths}

import atg.nucleus.GenericService
import atg.repository.RepositoryItemDescriptor
import gentools.data.GenerationInfo
import Utils._

/**
  * Created by Sergei_Dianov on 6/21/2017.
  */
class EntitiesGenerator(info: GenerationInfo) {

  val repositories = info.repositories;


  def writeFiles(exportPath: Path): Unit = {
    repositories.foreach { repo =>
      println(s"Writing component: ${repo._1}");
      val component = repo._2.asInstanceOf[GenericService];

      val packageName = repo._1.split("/").drop(1).mkString(".").toLowerCase;
      val packagePath = repo._1.split("/").drop(1).mkString("/").toLowerCase;


      val descriptorNames = repo._2.getItemDescriptorNames.toList;
      val descriptors = descriptorNames.map(x => repo._2.getItemDescriptor(x))

      descriptors.foreach(desc => writeItemEntity(exportPath, desc, packagePath, packageName));

      //   val content = fileContent(packageName, className, descriptors, views)
    }

    def writeItemEntity(
                         exportPath: Path,
                         descriptor: RepositoryItemDescriptor,
                         packagePath: String,
                         packageName: String
                       ): Unit = {

      val className = validIdent( descriptor.getItemDescriptorName + "Entity").capitalize;

      val outFile = new java.io.File(Paths.get(exportPath.toString, packagePath, className + ".java").toString);
      outFile.getParentFile.mkdirs();

      val pw = new PrintWriter(outFile)

      val content =
        s"""
           |package $packageName;
           |
           |public class $className {
           |
           |}
         """.stripMargin


      pw.println(content);
      pw.close();

    }

  }

}
