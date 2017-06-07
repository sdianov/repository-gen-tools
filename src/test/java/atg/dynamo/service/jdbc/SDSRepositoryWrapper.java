package atg.dynamo.service.jdbc;

import atg.adapter.gsa.GSARepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryItem;

public class SDSRepositoryWrapper {

    private GSARepository wrapped;

    private SDSRepositoryWrapper(final GSARepository pWrapped) {
        this.wrapped = pWrapped;
    }

    public static SDSRepositoryWrapper wrap(final GSARepository pRepository) {
        return new SDSRepositoryWrapper(pRepository);
    }

    // sds
    public static class SdsItem {

        public static final String CURRENTDATASOURCENAME_PROP="currentDataSourceName";
        public static final String LASTMODIFIED_PROP="lastModified";
        public static final String DYNAMOSERVER_PROP="dynamoServer";
        public static final String NAME_PROP="name";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

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
      

}
      
