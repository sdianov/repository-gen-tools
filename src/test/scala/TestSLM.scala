import java.nio.file.Paths

import atg.service.lockmanager.{ClientLockManager, ServerLockManager}
import gentools.RepositoryWrapperGenerator
import gentools.data.GenerationInfo
import org.apache.log4j.{Level, Logger}

/**
  * Created by Sergei_Dianov on 6/6/2017.
  */
object TestSLM extends App {

  import atg.nucleus.NucleusTestUtils
  import atg.repository.MutableRepository

  val mLogger = Logger.getLogger(classOf[Nothing])

  mLogger.log(Level.INFO, "Start Nucleus.")

  System.setProperty("derby.locks.deadlockTrace", "true")

  val mNucleus = NucleusTestUtils.startNucleusWithModules(Array[String]("DPS"), classOf[Nothing], classOf[Nothing].getName, "/atg/dynamo/service/ServerLockManager")

  val lm = mNucleus.resolveName("/atg/dynamo/service/ServerLockManager").asInstanceOf[ServerLockManager]

  val clm = mNucleus.resolveName("/atg/dynamo/service/ClientLockManager").asInstanceOf[ClientLockManager]
  clm.setUseLockServer(true);

  println("SLM:" + lm.getLockEntryTableSize);

  println(clm.getLockServerNames + ": " + clm.getLockServerPort)

  clm.acquireWriteLock("TEST_LOCK", clm);

  println("SLM:" + lm.getLockEntryTableSize);

  Thread.sleep(5000)

  mLogger.log(Level.INFO, "Stop Nucleus")

  if (mNucleus != null)
    NucleusTestUtils.shutdownNucleus(mNucleus)
}
