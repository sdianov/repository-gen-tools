package gentools.templates

/**
  * Created by Sergei_Dianov on 6/21/2017.
  */
class RepositoryWrapperFile
(
  packageName: String,
  wrapperClassName: String,
  itemConsts: String,
  itemClasses: String,
  viewClasses: String
) {

  def generate(): String = {

    s"""package $packageName;
       |
       |import atg.adapter.gsa.GSARepository;
       |import atg.repository.MutableRepository;
       |import atg.repository.MutableRepositoryItem;
       |import atg.repository.Query;
       |import atg.repository.QueryBuilder;
       |import atg.repository.QueryOptions;
       |import atg.repository.Repository;
       |import atg.repository.RepositoryException;
       |import atg.repository.RepositoryItem;
       |import atg.repository.RepositoryItemDescriptor;
       |import atg.repository.RepositoryView;
       |import atg.repository.SortDirectives;
       |
       |import java.util.Arrays;
       |import java.util.Collection;
       |import java.util.Collections;
       |import java.util.List;
       |import java.util.stream.Collectors;
       |
       |abstract class RepositoryItemImpl implements MutableRepositoryItem {
       |
       |    protected MutableRepositoryItem wrapped;
       |
       |    public MutableRepositoryItem getWrapped() {
       |        return wrapped;
       |    }
       |
       |    @Override
       |    public void setPropertyValue(String pS, Object pO) {
       |        wrapped.setPropertyValue(pS, pO);
       |    }
       |
       |    @Override
       |    public String getRepositoryId() {
       |        return wrapped.getRepositoryId();
       |    }
       |
       |    @Override
       |    public Object getPropertyValue(String pS) {
       |        return wrapped.getPropertyValue(pS);
       |    }
       |
       |    @Override
       |    public Repository getRepository() {
       |        return wrapped.getRepository();
       |    }
       |
       |    @Override
       |    public RepositoryItemDescriptor getItemDescriptor() throws RepositoryException {
       |        return wrapped.getItemDescriptor();
       |    }
       |
       |    @Override
       |    public boolean isTransient() {
       |        return wrapped.isTransient();
       |    }
       |
       |    @Override
       |    public Collection<String> getContextMemberships() throws RepositoryException {
       |        return wrapped.getContextMemberships();
       |    }
       |
       |    @Override
       |    public String getItemDisplayName() {
       |        return wrapped.getItemDisplayName();
       |    }
       |
       |}
       |
       |abstract class RepositoryViewImpl implements RepositoryView {
       |
       |    protected RepositoryView wrapped;
       |
       |    @Override
       |    public String getViewName() {
       |        return wrapped.getViewName();
       |    }
       |
       |    @Override
       |    public RepositoryItemDescriptor getItemDescriptor() throws RepositoryException {
       |        return wrapped.getItemDescriptor();
       |    }
       |
       |    @Override
       |    public QueryBuilder getQueryBuilder() {
       |        return wrapped.getQueryBuilder();
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, SortDirectives pSortDirectives) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pSortDirectives);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, int pI) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pI);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, int pI, SortDirectives pSortDirectives) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pI, pSortDirectives);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, int pI, int pI1) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pI, pI1);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, int pI, int pI1, SortDirectives pSortDirectives)
       |            throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pI, pI1, pSortDirectives);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] executeQuery(Query pQuery, QueryOptions pQueryOptions) throws RepositoryException {
       |        return wrapped.executeQuery(pQuery, pQueryOptions);
       |    }
       |
       |    @Override
       |    public int executeCountQuery(Query pQuery) throws RepositoryException {
       |        return wrapped.executeCountQuery(pQuery);
       |    }
       |}
       |
       |
       |public class $wrapperClassName implements MutableRepository {
       |
       |    private GSARepository wrapped;
       |
       |    private $wrapperClassName(final GSARepository pWrapped) {
       |        this.wrapped = pWrapped;
       |    }
       |
       |    public static $wrapperClassName wrap(final GSARepository pRepository) {
       |        return new $wrapperClassName(pRepository);
       |    }
       |
       |    // Utilily methods
       |    private void validateNonBlank(final String pString, final String pMessage) {
       |        if (pString == null || pString.length() == 0 || pString.trim().length() == 0) {
       |            throw new IllegalArgumentException(pMessage);
       |        }
       |    }
       |
       |$itemConsts
       |
       |    @Override @Deprecated
       |    public MutableRepositoryItem getItemForUpdate(String pS) throws RepositoryException {
       |        return wrapped.getItemForUpdate(pS);
       |    }
       |
       |    @Override
       |    public MutableRepositoryItem getItemForUpdate(String pS, String pS1) throws RepositoryException {
       |        return wrapped.getItemForUpdate(pS, pS1);
       |    }
       |
       |    @Override
       |    public MutableRepositoryItem[] getItemsForUpdate(String[] pStrings) throws RepositoryException {
       |        return wrapped.getItemsForUpdate(pStrings);
       |    }
       |
       |    @Override
       |    public MutableRepositoryItem[] getItemsForUpdate(String[] pStrings, String pS) throws RepositoryException {
       |        return wrapped.getItemsForUpdate(pStrings, pS);
       |    }
       |
       |    @Override
       |    public MutableRepositoryItem createItem(String pS) throws RepositoryException {
       |        return wrapped.createItem(pS);
       |    }
       |
       |    @Override
       |    public MutableRepositoryItem createItem(String pS, String pS1) throws RepositoryException {
       |        return wrapped.createItem(pS, pS1);
       |    }
       |
       |    @Override @Deprecated
       |    public RepositoryItem addItem(RepositoryItem pRepositoryItem, String pS) throws RepositoryException {
       |        return wrapped.addItem(pRepositoryItem, pS);
       |    }
       |
       |    @Override
       |    public RepositoryItem addItem(MutableRepositoryItem pMutableRepositoryItem) throws RepositoryException {
       |        return wrapped.addItem(pMutableRepositoryItem);
       |    }
       |
       |    @Override
       |    public void updateItem(MutableRepositoryItem pMutableRepositoryItem) throws RepositoryException {
       |        wrapped.updateItem(pMutableRepositoryItem);
       |    }
       |
       |    @Override @Deprecated
       |    public void removeItem(String pS) throws RepositoryException {
       |        wrapped.removeItem(pS);
       |    }
       |
       |    @Override
       |    public void removeItem(String pS, String pS1) throws RepositoryException {
       |        wrapped.removeItem(pS, pS1);
       |    }
       |
       |    @Override
       |    public String getRepositoryName() {
       |        return wrapped.getRepositoryName();
       |    }
       |
       |    @Override @Deprecated
       |    public RepositoryItem getItem(String pS) throws RepositoryException {
       |        return wrapped.getItem(pS);
       |    }
       |
       |    @Override
       |    public RepositoryItem getItem(String pS, String pS1) throws RepositoryException {
       |        return wrapped.getItem(pS, pS1);
       |    }
       |
       |    @Override @Deprecated
       |    public RepositoryItem[] getItems(String[] pStrings) throws RepositoryException {
       |        return wrapped.getItems(pStrings);
       |    }
       |
       |    @Override
       |    public RepositoryItem[] getItems(String[] pStrings, String pS) throws RepositoryException {
       |        return wrapped.getItems(pStrings, pS);
       |    }
       |
       |    @Override
       |    public String getDefaultViewName() {
       |        return wrapped.getDefaultViewName();
       |    }
       |
       |    @Override
       |    public String[] getViewNames() {
       |        return wrapped.getViewNames();
       |    }
       |
       |    @Override
       |    public RepositoryView getView(String pS) throws RepositoryException {
       |        return wrapped.getView(pS);
       |    }
       |
       |    @Override
       |    public RepositoryView getView(RepositoryItemDescriptor pRepositoryItemDescriptor) throws RepositoryException {
       |        return wrapped.getView(pRepositoryItemDescriptor);
       |    }
       |
       |    @Override
       |    public String[] getItemDescriptorNames() {
       |        return wrapped.getItemDescriptorNames();
       |    }
       |
       |    @Override
       |    public RepositoryItemDescriptor getItemDescriptor(String pS) throws RepositoryException {
       |        return wrapped.getItemDescriptor(pS);
       |    }
       |
       |    @Override
       |    public RepositoryItemDescriptor getItemDescriptor(RepositoryItemDescriptor pRepositoryItemDescriptor)
       |            throws RepositoryException {
       |        return wrapped.getItemDescriptor(pRepositoryItemDescriptor);
       |    }
       |
       |$itemClasses
       |
       |$viewClasses
       |}
      """.stripMargin
  }

}
