import java.nio.file.Paths

import gentools.RepositoryWrapperGenerator
import org.apache.log4j.{Level, Logger}

/**
  * Created by Sergei_Dianov on 6/6/2017.
  */
object Test2 extends App {

  import atg.nucleus.NucleusTestUtils
  import atg.repository.MutableRepository

  val mLogger = Logger.getLogger(classOf[Nothing])

  val exportPath = Paths.get("c:\\ATG\\ATG11.2\\CommerceAccelerator\\Base\\CommonRepositories\\src\\main\\java");
  val paths = List("/ru/letu/repository/DiscountCardRepository");

  mLogger.log(Level.INFO, "Start Nucleus.")

  System.setProperty("derby.locks.deadlockTrace", "true")

  val mNucleus = NucleusTestUtils.startNucleusWithModules(Array[String]("DPS", "CommerceAccelerator.Base.CommonRepositories"), classOf[Nothing], classOf[Nothing].getName, "/ru/letu/repository/DiscountCardRepository")

  val pairs = paths.map(x => x -> mNucleus.resolveName(x));

  val filtered = pairs.collect {
    case (a, b: MutableRepository) => (a, b);
  }

  val gen = new RepositoryWrapperGenerator(filtered.toMap);


  gen.writeFiles(exportPath)

  Thread.sleep(500)

  mLogger.log(Level.INFO, "Stop Nucleus")

  if (mNucleus != null)
    NucleusTestUtils.shutdownNucleus(mNucleus)


}
