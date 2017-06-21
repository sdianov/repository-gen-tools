import java.nio.file.{Path, Paths}

import gentools.RepositoryWrapperGenerator
import gentools.data.GenerationInfo
import org.apache.log4j.{Level, Logger}

/**
  * Created by Sergei_Dianov on 6/6/2017.
  */
object Test1 extends App {

  import atg.nucleus.Nucleus
  import atg.nucleus.NucleusTestUtils
  import atg.repository.MutableRepository
  import javax.servlet.ServletException
  import java.io.IOException

  val mLogger = Logger.getLogger(classOf[Nothing])

  val exportPath = Paths.get("build/generated-sources");
  val paths = List("/atg/commerce/catalog/ProductCatalog", "/atg/commerce/order/OrderRepository");

  mLogger.log(Level.INFO, "Start Nucleus.")

  System.setProperty("derby.locks.deadlockTrace", "true")

  val mNucleus = NucleusTestUtils.startNucleusWithModules(Array[String]("DPS", "DCS"), classOf[Nothing], classOf[Nothing].getName, "/atg/commerce/order/OrderRepository")

  val pairs = paths.map(x => x -> mNucleus.resolveName(x));

  val filtered = pairs.collect {
    case (a, b: MutableRepository) => (a, b);
  }

  val gen = new RepositoryWrapperGenerator(GenerationInfo(filtered.toMap));


  gen.writeFiles(exportPath)

  Thread.sleep(500)

  mLogger.log(Level.INFO, "Stop Nucleus")

  if (mNucleus != null)
    NucleusTestUtils.shutdownNucleus(mNucleus)


}
