package gentools

import java.io.{File, PrintWriter}
import java.nio.file.Path
import java.util

import atg.adapter.gsa.GSARepository
import atg.nucleus.GenericService

import scala.beans.BeanProperty
import scala.collection.JavaConverters._

/**
  * @author Sergei Dianov
  */
class RepositoryWrapperGeneratorService extends GenericService {

  def resolveComponent(name: String): Option[AnyRef] = Option(getNucleus.resolveName(name));


  @BeanProperty
  var repositoriesToGenerate: java.util.List[String] = _

  @BeanProperty
  var exportPath: String = _

  def generate(): Unit = {

    logInfo("starting...")

    val repositoryStrings = Option(repositoriesToGenerate).getOrElse(
      sys.error(" repositoriesToGenerate must be set")).asScala

    val components = repositoryStrings.flatMap(resolveComponent).collect {
      case a: GSARepository => a;
    }



  }

}
