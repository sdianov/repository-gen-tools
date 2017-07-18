package gentools

import java.io.PrintWriter
import java.nio.file.{Path, Paths}

import atg.nucleus.GenericService
import atg.repository.RepositoryItemDescriptor
import gentools.data.GenerationInfo
import Utils._
import atg.adapter.gsa.{GSAItemDescriptor, GSAPropertyDescriptor}
import atg.beans.DynamicPropertyDescriptor

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

      val gsaDesc = descriptor.asInstanceOf[GSAItemDescriptor];

      val tableName = gsaDesc.getPrimaryTable.getName

      val outFile = new java.io.File(Paths.get(exportPath.toString, packagePath, className + ".java").toString);
      outFile.getParentFile.mkdirs();

      val pw = new PrintWriter(outFile)

      val fields = descriptor.getPropertyNames().map { name =>

        val desc = descriptor.getPropertyDescriptor(name);
        val vtype = EntityUtils.typeMap(desc);

        val column = desc match {
          case gsa : GSAPropertyDescriptor => gsa.getColumnNames.mkString("|")
          case _ => "???" + desc.getClass
        }

        s"""  @Column(name = "$column")
           |    private $vtype $name;""".stripMargin
      }.mkString("\n");

      val accessors = descriptor.getPropertyNames.map{ name =>

        val propertyDescriptor: DynamicPropertyDescriptor = descriptor.getPropertyDescriptor(name);

        val ptype = EntityUtils.typeMap(propertyDescriptor)

        val getterName = validIdent("get" + name.capitalize);
        val setterName = validIdent("set" + name.capitalize);

        s"""
           |    public $ptype $getterName() {
           |        return $name;
           |    }
           |
           |    public void $setterName($ptype $name) {
           |      this.$name = $name;
           |    }
         """.stripMargin
      }.mkString("\n")


      val content =
        s"""package $packageName;
           |
           |import javax.persistence.Column;
           |import javax.persistence.Entity;
           |import javax.persistence.Table;
           |import java.io.Serializable;
           |
           |@Entity
           |@Table(name = "$tableName")
           |public class $className implements Serializable {
           |
           |$fields
           |
           |$accessors
           |}
         """.stripMargin


      pw.println(content);
      pw.close();

    }

  }

}
