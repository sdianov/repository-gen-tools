package gentools

import atg.adapter.gsa.GSAPropertyDescriptor
import atg.beans.DynamicPropertyDescriptor
import atg.repository.RepositoryItem

/**
  * Created by Sergei_Dianov on 7/18/2017.
  */
object EntityUtils {

  def typeMap(propertyDescriptor: DynamicPropertyDescriptor): String = {
    val ptype = propertyDescriptor.getPropertyType

    if (ptype.isArray) {
      val compType = ptype.getComponentType;
      return s"${compType.getName}[]"; // TODO
    }

    if (ptype.equals(classOf[RepositoryItem])) {

      val ctype = propertyDescriptor match {
        case gsa: GSAPropertyDescriptor => gsa.getPropertyItemDescriptor.getItemDescriptorName
        case x => x.getName
      }
      return s" /* $ctype */ RepositoryItem"
    }

    if (ptype.isAssignableFrom(classOf[java.util.List[_]])) {
      val compType = propertyDescriptor.getComponentPropertyType;
      return s"java.util.List<${compType.getName}>"
    }

    if (ptype.isAssignableFrom(classOf[java.util.Set[_]])) {
      val compType = propertyDescriptor.getComponentPropertyType;
      return s"java.util.Set<${compType.getName}>"
    }

    if (ptype.isAssignableFrom(classOf[java.util.Map[_, _]])) {
      return s"java.util.Map<?,?>"
    }

    val packaje = ptype.getPackage

    if (packaje.getName == "java.lang") {
      return ptype.getSimpleName
    }

    return ptype.getName
  }

}
