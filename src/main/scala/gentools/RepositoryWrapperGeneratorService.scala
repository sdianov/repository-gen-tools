package gentools

import java.io.{File, PrintWriter}
import java.nio.file.{Path, Paths}
import java.util

import atg.adapter.gsa.GSARepository
import atg.nucleus.GenericService
import atg.repository.MutableRepository
import gentools.data.GenerationInfo

import scala.beans.BeanProperty
import scala.collection.JavaConverters._

/**
  * @author Sergei Dianov
  */
class RepositoryWrapperGeneratorService extends GenericService {

  @BeanProperty
  var repositoriesToGenerate: java.util.List[String] = _

  @BeanProperty
  var exportPath: String = _

  def generate(): Unit = {

    logInfo("starting...")

    val repositoryStrings: List[String] = Option(repositoriesToGenerate).getOrElse(
      sys.error(" repositoriesToGenerate must be set")).asScala.toList

    val pairs = repositoryStrings.map(x => x -> getNucleus.resolveName(x));

    val filtered = pairs.collect{
      case (a, b: MutableRepository) => (a,b);
    }

    val gen = new RepositoryWrapperGenerator(GenerationInfo(filtered.toMap));

    gen.writeFiles(Paths.get(exportPath));


  }

}
