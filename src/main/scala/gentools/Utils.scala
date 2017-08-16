package gentools

import atg.adapter.gsa.GSAPropertyDescriptor
import atg.beans.DynamicPropertyDescriptor
import atg.repository.{RepositoryItem, RepositoryItemDescriptor, RepositoryView}
import com.google.common.base.CaseFormat

/**
  * Created by Sergei_Dianov on 6/21/2017.
  */
object Utils {

  def validIdent(s: String) = s.replace("-", "_").replace(" ", "_")

  def propToConstName(propName: String) = s"""${validIdent(CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, propName))}_PROPERTY_NAME"""

  def descToConstName(descriptor: RepositoryItemDescriptor) = validIdent(s"""${CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, descriptor.getItemDescriptorName)}_DESCRIPTOR_NAME""")

  def viewToConstName(view: RepositoryView) = validIdent(s"""${CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, view.getViewName)}_VIEW_NAME""")


}
