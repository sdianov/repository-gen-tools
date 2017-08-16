import java.nio.file.Paths

import atg.nucleus.NucleusTestUtils
import atg.repository.MutableRepository
import gentools.EntitiesGenerator
import gentools.data.GenerationInfo
import org.apache.log4j.Level

/**
  * Created by Sergei_Dianov on 6/21/2017.
  */
object Test3 extends App {

  val exportPath = Paths.get("build/generated-sources");

  val paths = List("/atg/dynamo/security/AdminSqlRepository", "/atg/multisite/SiteRepository");

  System.setProperty("derby.locks.deadlockTrace", "true")

  val mNucleus = NucleusTestUtils.startNucleusWithModules(Array[String]("DPS"), classOf[Nothing], classOf[Nothing].getName)

  val pairs = paths.map(x => x -> mNucleus.resolveName(x));

  val filtered = pairs.collect {
    case (a, b: MutableRepository) => (a, b);
  }

  val info = GenerationInfo(
     repositories = filtered.toMap
  );

  val generator = new EntitiesGenerator(info);

  generator.writeFiles(exportPath);

  import javax.persistence.EntityManagerFactory
  import javax.persistence.Persistence


 // val emf = Persistence.createEntityManagerFactory("ru.letu_hiberproject")


}
