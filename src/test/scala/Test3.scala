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

  val paths = List("/atg/commerce/catalog/ProductCatalog", "/atg/commerce/order/OrderRepository");

  System.setProperty("derby.locks.deadlockTrace", "true")

  val mNucleus = NucleusTestUtils.startNucleusWithModules(Array[String]("DPS", "DCS"), classOf[Nothing], classOf[Nothing].getName, "/atg/commerce/order/OrderRepository")

  val pairs = paths.map(x => x -> mNucleus.resolveName(x));

  val filtered = pairs.collect {
    case (a, b: MutableRepository) => (a, b);
  }

  val info = GenerationInfo(
     repositories = filtered.toMap
  );

  val generator = new EntitiesGenerator(info);

  generator.writeFiles(exportPath);

}
