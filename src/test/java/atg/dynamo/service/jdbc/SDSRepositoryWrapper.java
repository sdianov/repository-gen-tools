package atg.dynamo.service.jdbc;

import atg.adapter.gsa.GSARepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.Query;
import atg.repository.QueryBuilder;
import atg.repository.QueryOptions;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryItemDescriptor;
import atg.repository.RepositoryView;
import atg.repository.SortDirectives;

import java.util.Collection;

abstract class RepositoryItemImpl implements MutableRepositoryItem {

    protected MutableRepositoryItem wrapped;

    public MutableRepositoryItem getWrapped() {
        return wrapped;
    }

    @Override
    public void setPropertyValue(String pS, Object pO) {
        wrapped.setPropertyValue(pS, pO);
    }

    @Override
    public String getRepositoryId() {
        return wrapped.getRepositoryId();
    }

    @Override
    public Object getPropertyValue(String pS) {
        return wrapped.getPropertyValue(pS);
    }

    @Override
    public Repository getRepository() {
        return wrapped.getRepository();
    }

    @Override
    public RepositoryItemDescriptor getItemDescriptor() throws RepositoryException {
        return wrapped.getItemDescriptor();
    }

    @Override
    public boolean isTransient() {
        return wrapped.isTransient();
    }

    @Override
    public Collection<String> getContextMemberships() throws RepositoryException {
        return wrapped.getContextMemberships();
    }

    @Override
    public String getItemDisplayName() {
        return wrapped.getItemDisplayName();
    }

}

abstract class RepositoryViewImpl implements RepositoryView {

    protected RepositoryView wrapped;

    @Override
    public String getViewName() {
        return wrapped.getViewName();
    }

    @Override
    public RepositoryItemDescriptor getItemDescriptor() throws RepositoryException {
        return wrapped.getItemDescriptor();
    }

    @Override
    public QueryBuilder getQueryBuilder() {
        return wrapped.getQueryBuilder();
    }

    @Override
    public RepositoryItem[] executeQuery(Query pQuery) throws RepositoryException {
        return wrapped.executeQuery(pQuery);
    }

    @Override
    public RepositoryItem[] executeQuery(Query pQuery, SortDirectives pSortDirectives) throws RepositoryException {
        return wrapped.executeQuery(pQuery, pSortDirectives);
    }

    @Override
    public RepositoryItem[] executeQuery(Query pQuery, int pI) throws RepositoryException {
        return wrapped.executeQuery(pQuery, pI);
    }

    @Override
    public RepositoryItem[] executeQuery(Query pQuery, int pI, SortDirectives pSortDirectives) throws RepositoryException {
        return wrapped.executeQuery(pQuery, pI, pSortDirectives);
    }

    @Override
    public RepositoryItem[] executeQuery(Query pQuery, int pI, int pI1) throws RepositoryException {
        return wrapped.executeQuery(pQuery, pI, pI1);
    }

    @Override
    public RepositoryItem[] executeQuery(Query pQuery, int pI, int pI1, SortDirectives pSortDirectives)
            throws RepositoryException {
        return wrapped.executeQuery(pQuery, pI, pI1, pSortDirectives);
    }

    @Override
    public RepositoryItem[] executeQuery(Query pQuery, QueryOptions pQueryOptions) throws RepositoryException {
        return wrapped.executeQuery(pQuery, pQueryOptions);
    }

    @Override
    public int executeCountQuery(Query pQuery) throws RepositoryException {
        return wrapped.executeCountQuery(pQuery);
    }
}


public class SDSRepositoryWrapper {

    private GSARepository wrapped;

    private SDSRepositoryWrapper(final GSARepository pWrapped) {
        this.wrapped = pWrapped;
    }

    public static SDSRepositoryWrapper wrap(final GSARepository pRepository) {
        return new SDSRepositoryWrapper(pRepository);
    }

    // Utilily methods
    private void validateNonBlank(final String pString, final String pMessage) {
        if (pString == null || pString.length() == 0 || pString.trim().length() == 0) {
            throw new IllegalArgumentException(pMessage);
        }
    }

    public static final String SDS_DESC = "sds";

    // sds
    public static class SdsItem extends RepositoryItemImpl {

        public static final String CURRENTDATASOURCENAME_PROP = "currentDataSourceName";
        public static final String LASTMODIFIED_PROP = "lastModified";
        public static final String DYNAMOSERVER_PROP = "dynamoServer";
        public static final String NAME_PROP = "name";

        public SdsItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // currentDataSourceName : java.lang.String
        // writable: true
        public java.lang.String getCurrentDataSourceName() {
            return (java.lang.String) wrapped.getPropertyValue(CURRENTDATASOURCENAME_PROP);
        }

        public void setCurrentDataSourceName(java.lang.String value){
            wrapped.setPropertyValue(CURRENTDATASOURCENAME_PROP, value);
        }
        
        // lastModified : java.sql.Timestamp
        // writable: true
        public java.sql.Timestamp getLastModified() {
            return (java.sql.Timestamp) wrapped.getPropertyValue(LASTMODIFIED_PROP);
        }

        public void setLastModified(java.sql.Timestamp value){
            wrapped.setPropertyValue(LASTMODIFIED_PROP, value);
        }
        
        // dynamoServer : java.lang.String
        // writable: true
        public java.lang.String getDynamoServer() {
            return (java.lang.String) wrapped.getPropertyValue(DYNAMOSERVER_PROP);
        }

        public void setDynamoServer(java.lang.String value){
            wrapped.setPropertyValue(DYNAMOSERVER_PROP, value);
        }
        
        // name : java.lang.String
        // writable: true
        public java.lang.String getName() {
            return (java.lang.String) wrapped.getPropertyValue(NAME_PROP);
        }

        public void setName(java.lang.String value){
            wrapped.setPropertyValue(NAME_PROP, value);
        }
        

    }

    public SdsItem getSdsItem(final String itemId) throws RepositoryException {
        validateNonBlank(itemId, "getSdsItem: Item ID cannot be empty");
        final MutableRepositoryItem item = (MutableRepositoryItem)wrapped.getItem(itemId, SDS_DESC);
        return new SdsItem(item);
    }
      


    // VIEW : sds
    public static final String SDS_VIEW = "sds";

    public static class SdsView extends RepositoryViewImpl {

        public SdsView(RepositoryView pRepositoryView) {
            wrapped = pRepositoryView;
        }
    }

    public SdsView getSdsView() throws RepositoryException {
        final RepositoryView view = wrapped.getView(SDS_VIEW);
        return new SdsView(view);
    }

       
}
      
