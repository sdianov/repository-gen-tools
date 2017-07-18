package gentools

import atg.adapter.gsa.GSAPropertyDescriptor
import atg.beans.DynamicPropertyDescriptor
import atg.repository.{RepositoryItem, RepositoryItemDescriptor, RepositoryView}

/**
  * Created by Sergei_Dianov on 6/21/2017.
  */
object Utils {

  def validIdent(s: String) = s.replace("-", "_").replace(" ", "_")

  def propToConstName(propName: String) = s"""${validIdent(propName.toUpperCase)}_PROP"""

  def descToConstName(descriptor: RepositoryItemDescriptor) = validIdent(s"""${descriptor.getItemDescriptorName.toUpperCase}_DESC""")

  def viewToConstName(view: RepositoryView) = validIdent(s"""${view.getViewName.toUpperCase}_VIEW""")



}
