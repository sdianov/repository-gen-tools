package atg.userprofiling;

import atg.adapter.gsa.GSARepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryItem;

public class ProfileAdapterRepositoryWrapper {

    private GSARepository wrapped;

    private ProfileAdapterRepositoryWrapper(final GSARepository pWrapped) {
        this.wrapped = pWrapped;
    }

    public static ProfileAdapterRepositoryWrapper wrap(final GSARepository pRepository) {
        return new ProfileAdapterRepositoryWrapper(pRepository);
    }

    // user
    public static class UserItem {

        public static final String SECURITYSTATUS_PROP="securityStatus";
        public static final String DESCRIPTION_PROP="description";
        public static final String EMAIL_PROP="email";
        public static final String PASSWORD_PROP="password";
        public static final String REALMID_PROP="realmId";
        public static final String LASTNAME_PROP="lastName";
        public static final String GENDER_PROP="gender";
        public static final String PARENTORGANIZATION_PROP="parentOrganization";
        public static final String LASTPASSWORDUPDATE_PROP="lastPasswordUpdate";
        public static final String PASSWORDKEYDERIVATIONFUNCTION_PROP="passwordKeyDerivationFunction";
        public static final String ANCESTORS_PROP="ancestors";
        public static final String RECEIVEEMAIL_PROP="receiveEmail";
        public static final String REGISTRATIONDATE_PROP="registrationDate";
        public static final String PASSWORDSALT_PROP="passwordSalt";
        public static final String DATEOFBIRTH_PROP="dateOfBirth";
        public static final String MEMBER_PROP="member";
        public static final String FIRSTNAME_PROP="firstName";
        public static final String ROLES_PROP="roles";
        public static final String LOGIN_PROP="login";
        public static final String HOMEADDRESS_PROP="homeAddress";
        public static final String MAILINGS_PROP="mailings";
        public static final String EMAILSTATUS_PROP="emailStatus";
        public static final String ID_PROP="id";
        public static final String LASTEMAILED_PROP="lastEmailed";
        public static final String AUTOLOGIN_PROP="autoLogin";
        public static final String LOCALE_PROP="locale";
        public static final String USERTYPE_PROP="userType";
        public static final String LASTACTIVITY_PROP="lastActivity";
        public static final String PREVIOUSPASSWORDS_PROP="previousPasswords";
        public static final String SECONDARYORGANIZATIONS_PROP="secondaryOrganizations";
        public static final String MIDDLENAME_PROP="middleName";
        public static final String GENERATEDPASSWORD_PROP="generatedPassword";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public UserItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // securityStatus : java.lang.Integer
        // writable: true
        public java.lang.Integer getSecurityStatus() {
            return (java.lang.Integer) wrapped.getPropertyValue(SECURITYSTATUS_PROP);
        }

        public void setSecurityStatus(java.lang.Integer value){
            wrapped.setPropertyValue(SECURITYSTATUS_PROP, value);
        }
        
        // description : java.lang.String
        // writable: true
        public java.lang.String getDescription() {
            return (java.lang.String) wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(java.lang.String value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // email : java.lang.String
        // writable: true
        public java.lang.String getEmail() {
            return (java.lang.String) wrapped.getPropertyValue(EMAIL_PROP);
        }

        public void setEmail(java.lang.String value){
            wrapped.setPropertyValue(EMAIL_PROP, value);
        }
        
        // password : java.lang.String
        // writable: true
        public java.lang.String getPassword() {
            return (java.lang.String) wrapped.getPropertyValue(PASSWORD_PROP);
        }

        public void setPassword(java.lang.String value){
            wrapped.setPropertyValue(PASSWORD_PROP, value);
        }
        
        // realmId : java.lang.String
        // writable: true
        public java.lang.String getRealmId() {
            return (java.lang.String) wrapped.getPropertyValue(REALMID_PROP);
        }

        public void setRealmId(java.lang.String value){
            wrapped.setPropertyValue(REALMID_PROP, value);
        }
        
        // lastName : java.lang.String
        // writable: true
        public java.lang.String getLastName() {
            return (java.lang.String) wrapped.getPropertyValue(LASTNAME_PROP);
        }

        public void setLastName(java.lang.String value){
            wrapped.setPropertyValue(LASTNAME_PROP, value);
        }
        
        // gender : java.lang.String
        // writable: true
        public java.lang.String getGender() {
            return (java.lang.String) wrapped.getPropertyValue(GENDER_PROP);
        }

        public void setGender(java.lang.String value){
            wrapped.setPropertyValue(GENDER_PROP, value);
        }
        
        // parentOrganization : atg.repository.RepositoryItem
        // writable: true
        public  /* [ItemDesc: organization] */ RepositoryItem getParentOrganization() {
            return ( /* [ItemDesc: organization] */ RepositoryItem) wrapped.getPropertyValue(PARENTORGANIZATION_PROP);
        }

        public void setParentOrganization( /* [ItemDesc: organization] */ RepositoryItem value){
            wrapped.setPropertyValue(PARENTORGANIZATION_PROP, value);
        }
        
        // lastPasswordUpdate : java.sql.Timestamp
        // writable: true
        public java.sql.Timestamp getLastPasswordUpdate() {
            return (java.sql.Timestamp) wrapped.getPropertyValue(LASTPASSWORDUPDATE_PROP);
        }

        public void setLastPasswordUpdate(java.sql.Timestamp value){
            wrapped.setPropertyValue(LASTPASSWORDUPDATE_PROP, value);
        }
        
        // passwordKeyDerivationFunction : java.lang.String
        // writable: true
        public java.lang.String getPasswordKeyDerivationFunction() {
            return (java.lang.String) wrapped.getPropertyValue(PASSWORDKEYDERIVATIONFUNCTION_PROP);
        }

        public void setPasswordKeyDerivationFunction(java.lang.String value){
            wrapped.setPropertyValue(PASSWORDKEYDERIVATIONFUNCTION_PROP, value);
        }
        
        // ancestors : java.util.List
        // writable: true
        public java.util.List getAncestors() {
            return (java.util.List) wrapped.getPropertyValue(ANCESTORS_PROP);
        }

        public void setAncestors(java.util.List value){
            wrapped.setPropertyValue(ANCESTORS_PROP, value);
        }
        
        // receiveEmail : java.lang.String
        // writable: true
        public java.lang.String getReceiveEmail() {
            return (java.lang.String) wrapped.getPropertyValue(RECEIVEEMAIL_PROP);
        }

        public void setReceiveEmail(java.lang.String value){
            wrapped.setPropertyValue(RECEIVEEMAIL_PROP, value);
        }
        
        // registrationDate : java.sql.Timestamp
        // writable: true
        public java.sql.Timestamp getRegistrationDate() {
            return (java.sql.Timestamp) wrapped.getPropertyValue(REGISTRATIONDATE_PROP);
        }

        public void setRegistrationDate(java.sql.Timestamp value){
            wrapped.setPropertyValue(REGISTRATIONDATE_PROP, value);
        }
        
        // passwordSalt : java.lang.String
        // writable: true
        public java.lang.String getPasswordSalt() {
            return (java.lang.String) wrapped.getPropertyValue(PASSWORDSALT_PROP);
        }

        public void setPasswordSalt(java.lang.String value){
            wrapped.setPropertyValue(PASSWORDSALT_PROP, value);
        }
        
        // dateOfBirth : java.util.Date
        // writable: true
        public java.util.Date getDateOfBirth() {
            return (java.util.Date) wrapped.getPropertyValue(DATEOFBIRTH_PROP);
        }

        public void setDateOfBirth(java.util.Date value){
            wrapped.setPropertyValue(DATEOFBIRTH_PROP, value);
        }
        
        // member : java.lang.Boolean
        // writable: true
        public java.lang.Boolean getMember() {
            return (java.lang.Boolean) wrapped.getPropertyValue(MEMBER_PROP);
        }

        public void setMember(java.lang.Boolean value){
            wrapped.setPropertyValue(MEMBER_PROP, value);
        }
        
        // firstName : java.lang.String
        // writable: true
        public java.lang.String getFirstName() {
            return (java.lang.String) wrapped.getPropertyValue(FIRSTNAME_PROP);
        }

        public void setFirstName(java.lang.String value){
            wrapped.setPropertyValue(FIRSTNAME_PROP, value);
        }
        
        // roles : java.util.Set
        // writable: true
        public java.util.Set getRoles() {
            return (java.util.Set) wrapped.getPropertyValue(ROLES_PROP);
        }

        public void setRoles(java.util.Set value){
            wrapped.setPropertyValue(ROLES_PROP, value);
        }
        
        // login : java.lang.String
        // writable: true
        public java.lang.String getLogin() {
            return (java.lang.String) wrapped.getPropertyValue(LOGIN_PROP);
        }

        public void setLogin(java.lang.String value){
            wrapped.setPropertyValue(LOGIN_PROP, value);
        }
        
        // homeAddress : atg.repository.RepositoryItem
        // writable: true
        public  /* [ItemDesc: contactInfo] */ RepositoryItem getHomeAddress() {
            return ( /* [ItemDesc: contactInfo] */ RepositoryItem) wrapped.getPropertyValue(HOMEADDRESS_PROP);
        }

        public void setHomeAddress( /* [ItemDesc: contactInfo] */ RepositoryItem value){
            wrapped.setPropertyValue(HOMEADDRESS_PROP, value);
        }
        
        // mailings : java.util.Set
        // writable: false
        public java.util.Set getMailings() {
            return (java.util.Set) wrapped.getPropertyValue(MAILINGS_PROP);
        }

        // emailStatus : java.lang.String
        // writable: true
        public java.lang.String getEmailStatus() {
            return (java.lang.String) wrapped.getPropertyValue(EMAILSTATUS_PROP);
        }

        public void setEmailStatus(java.lang.String value){
            wrapped.setPropertyValue(EMAILSTATUS_PROP, value);
        }
        
        // id : java.lang.String
        // writable: true
        public java.lang.String getId() {
            return (java.lang.String) wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(java.lang.String value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // lastEmailed : java.sql.Timestamp
        // writable: true
        public java.sql.Timestamp getLastEmailed() {
            return (java.sql.Timestamp) wrapped.getPropertyValue(LASTEMAILED_PROP);
        }

        public void setLastEmailed(java.sql.Timestamp value){
            wrapped.setPropertyValue(LASTEMAILED_PROP, value);
        }
        
        // autoLogin : java.lang.Boolean
        // writable: true
        public java.lang.Boolean getAutoLogin() {
            return (java.lang.Boolean) wrapped.getPropertyValue(AUTOLOGIN_PROP);
        }

        public void setAutoLogin(java.lang.Boolean value){
            wrapped.setPropertyValue(AUTOLOGIN_PROP, value);
        }
        
        // locale : java.lang.String
        // writable: true
        public java.lang.String getLocale() {
            return (java.lang.String) wrapped.getPropertyValue(LOCALE_PROP);
        }

        public void setLocale(java.lang.String value){
            wrapped.setPropertyValue(LOCALE_PROP, value);
        }
        
        // userType : java.lang.Integer
        // writable: true
        public java.lang.Integer getUserType() {
            return (java.lang.Integer) wrapped.getPropertyValue(USERTYPE_PROP);
        }

        public void setUserType(java.lang.Integer value){
            wrapped.setPropertyValue(USERTYPE_PROP, value);
        }
        
        // lastActivity : java.sql.Timestamp
        // writable: true
        public java.sql.Timestamp getLastActivity() {
            return (java.sql.Timestamp) wrapped.getPropertyValue(LASTACTIVITY_PROP);
        }

        public void setLastActivity(java.sql.Timestamp value){
            wrapped.setPropertyValue(LASTACTIVITY_PROP, value);
        }
        
        // previousPasswords : [Ljava.lang.String;
        // writable: true
        public Object[] getPreviousPasswords() {
            return (Object[]) wrapped.getPropertyValue(PREVIOUSPASSWORDS_PROP);
        }

        public void setPreviousPasswords(Object[] value){
            wrapped.setPropertyValue(PREVIOUSPASSWORDS_PROP, value);
        }
        
        // secondaryOrganizations : java.util.Set
        // writable: true
        public java.util.Set getSecondaryOrganizations() {
            return (java.util.Set) wrapped.getPropertyValue(SECONDARYORGANIZATIONS_PROP);
        }

        public void setSecondaryOrganizations(java.util.Set value){
            wrapped.setPropertyValue(SECONDARYORGANIZATIONS_PROP, value);
        }
        
        // middleName : java.lang.String
        // writable: true
        public java.lang.String getMiddleName() {
            return (java.lang.String) wrapped.getPropertyValue(MIDDLENAME_PROP);
        }

        public void setMiddleName(java.lang.String value){
            wrapped.setPropertyValue(MIDDLENAME_PROP, value);
        }
        
        // generatedPassword : java.lang.Boolean
        // writable: true
        public java.lang.Boolean getGeneratedPassword() {
            return (java.lang.Boolean) wrapped.getPropertyValue(GENERATEDPASSWORD_PROP);
        }

        public void setGeneratedPassword(java.lang.Boolean value){
            wrapped.setPropertyValue(GENERATEDPASSWORD_PROP, value);
        }
        

    }
      
    // contactInfo
    public static class ContactInfoItem {

        public static final String POSTALCODE_PROP="postalCode";
        public static final String PREFIX_PROP="prefix";
        public static final String CITY_PROP="city";
        public static final String COUNTRY_PROP="country";
        public static final String PHONENUMBER_PROP="phoneNumber";
        public static final String LASTNAME_PROP="lastName";
        public static final String STATE_PROP="state";
        public static final String ADDRESS3_PROP="address3";
        public static final String ADDRESS2_PROP="address2";
        public static final String ADDRESS1_PROP="address1";
        public static final String JOBTITLE_PROP="jobTitle";
        public static final String OWNERID_PROP="ownerId";
        public static final String FIRSTNAME_PROP="firstName";
        public static final String FAXNUMBER_PROP="faxNumber";
        public static final String COMPANYNAME_PROP="companyName";
        public static final String COUNTY_PROP="county";
        public static final String ID_PROP="id";
        public static final String SUFFIX_PROP="suffix";
        public static final String MIDDLENAME_PROP="middleName";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public ContactInfoItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // postalCode : java.lang.String
        // writable: true
        public java.lang.String getPostalCode() {
            return (java.lang.String) wrapped.getPropertyValue(POSTALCODE_PROP);
        }

        public void setPostalCode(java.lang.String value){
            wrapped.setPropertyValue(POSTALCODE_PROP, value);
        }
        
        // prefix : java.lang.String
        // writable: true
        public java.lang.String getPrefix() {
            return (java.lang.String) wrapped.getPropertyValue(PREFIX_PROP);
        }

        public void setPrefix(java.lang.String value){
            wrapped.setPropertyValue(PREFIX_PROP, value);
        }
        
        // city : java.lang.String
        // writable: true
        public java.lang.String getCity() {
            return (java.lang.String) wrapped.getPropertyValue(CITY_PROP);
        }

        public void setCity(java.lang.String value){
            wrapped.setPropertyValue(CITY_PROP, value);
        }
        
        // country : java.lang.String
        // writable: true
        public java.lang.String getCountry() {
            return (java.lang.String) wrapped.getPropertyValue(COUNTRY_PROP);
        }

        public void setCountry(java.lang.String value){
            wrapped.setPropertyValue(COUNTRY_PROP, value);
        }
        
        // phoneNumber : java.lang.String
        // writable: true
        public java.lang.String getPhoneNumber() {
            return (java.lang.String) wrapped.getPropertyValue(PHONENUMBER_PROP);
        }

        public void setPhoneNumber(java.lang.String value){
            wrapped.setPropertyValue(PHONENUMBER_PROP, value);
        }
        
        // lastName : java.lang.String
        // writable: true
        public java.lang.String getLastName() {
            return (java.lang.String) wrapped.getPropertyValue(LASTNAME_PROP);
        }

        public void setLastName(java.lang.String value){
            wrapped.setPropertyValue(LASTNAME_PROP, value);
        }
        
        // state : java.lang.String
        // writable: true
        public java.lang.String getState() {
            return (java.lang.String) wrapped.getPropertyValue(STATE_PROP);
        }

        public void setState(java.lang.String value){
            wrapped.setPropertyValue(STATE_PROP, value);
        }
        
        // address3 : java.lang.String
        // writable: true
        public java.lang.String getAddress3() {
            return (java.lang.String) wrapped.getPropertyValue(ADDRESS3_PROP);
        }

        public void setAddress3(java.lang.String value){
            wrapped.setPropertyValue(ADDRESS3_PROP, value);
        }
        
        // address2 : java.lang.String
        // writable: true
        public java.lang.String getAddress2() {
            return (java.lang.String) wrapped.getPropertyValue(ADDRESS2_PROP);
        }

        public void setAddress2(java.lang.String value){
            wrapped.setPropertyValue(ADDRESS2_PROP, value);
        }
        
        // address1 : java.lang.String
        // writable: true
        public java.lang.String getAddress1() {
            return (java.lang.String) wrapped.getPropertyValue(ADDRESS1_PROP);
        }

        public void setAddress1(java.lang.String value){
            wrapped.setPropertyValue(ADDRESS1_PROP, value);
        }
        
        // jobTitle : java.lang.String
        // writable: true
        public java.lang.String getJobTitle() {
            return (java.lang.String) wrapped.getPropertyValue(JOBTITLE_PROP);
        }

        public void setJobTitle(java.lang.String value){
            wrapped.setPropertyValue(JOBTITLE_PROP, value);
        }
        
        // ownerId : java.lang.String
        // writable: true
        public java.lang.String getOwnerId() {
            return (java.lang.String) wrapped.getPropertyValue(OWNERID_PROP);
        }

        public void setOwnerId(java.lang.String value){
            wrapped.setPropertyValue(OWNERID_PROP, value);
        }
        
        // firstName : java.lang.String
        // writable: true
        public java.lang.String getFirstName() {
            return (java.lang.String) wrapped.getPropertyValue(FIRSTNAME_PROP);
        }

        public void setFirstName(java.lang.String value){
            wrapped.setPropertyValue(FIRSTNAME_PROP, value);
        }
        
        // faxNumber : java.lang.String
        // writable: true
        public java.lang.String getFaxNumber() {
            return (java.lang.String) wrapped.getPropertyValue(FAXNUMBER_PROP);
        }

        public void setFaxNumber(java.lang.String value){
            wrapped.setPropertyValue(FAXNUMBER_PROP, value);
        }
        
        // companyName : java.lang.String
        // writable: true
        public java.lang.String getCompanyName() {
            return (java.lang.String) wrapped.getPropertyValue(COMPANYNAME_PROP);
        }

        public void setCompanyName(java.lang.String value){
            wrapped.setPropertyValue(COMPANYNAME_PROP, value);
        }
        
        // county : java.lang.String
        // writable: true
        public java.lang.String getCounty() {
            return (java.lang.String) wrapped.getPropertyValue(COUNTY_PROP);
        }

        public void setCounty(java.lang.String value){
            wrapped.setPropertyValue(COUNTY_PROP, value);
        }
        
        // id : java.lang.String
        // writable: true
        public java.lang.String getId() {
            return (java.lang.String) wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(java.lang.String value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // suffix : java.lang.String
        // writable: true
        public java.lang.String getSuffix() {
            return (java.lang.String) wrapped.getPropertyValue(SUFFIX_PROP);
        }

        public void setSuffix(java.lang.String value){
            wrapped.setPropertyValue(SUFFIX_PROP, value);
        }
        
        // middleName : java.lang.String
        // writable: true
        public java.lang.String getMiddleName() {
            return (java.lang.String) wrapped.getPropertyValue(MIDDLENAME_PROP);
        }

        public void setMiddleName(java.lang.String value){
            wrapped.setPropertyValue(MIDDLENAME_PROP, value);
        }
        

    }
      
    // mailing
    public static class MailingItem {

        public static final String PARAMS_PROP="params";
        public static final String BATCHEXECID_PROP="batchExecId";
        public static final String BCC_PROP="bcc";
        public static final String FROM_PROP="from";
        public static final String SUBJECT_PROP="subject";
        public static final String UNIQSERVERID_PROP="uniqServerId";
        public static final String NUMBOUNCES_PROP="numBounces";
        public static final String STARTTIME_PROP="startTime";
        public static final String IGNORECONTACTFATIGUE_PROP="ignoreContactFatigue";
        public static final String EMAILADDRESSES_PROP="emailAddresses";
        public static final String SITEID_PROP="siteId";
        public static final String RECIPIENTS_PROP="recipients";
        public static final String NUMSKIPPED_PROP="numSkipped";
        public static final String FILLFROMTEMPLATE_PROP="fillFromTemplate";
        public static final String CC_PROP="cc";
        public static final String BATCHSIZE_PROP="batchSize";
        public static final String STATUS_PROP="status";
        public static final String TRACKINGDATA_PROP="trackingData";
        public static final String ALTTEMPLATE_PROP="altTemplate";
        public static final String SENDASTEXT_PROP="sendAsText";
        public static final String TEMPLATE_PROP="template";
        public static final String ID_PROP="id";
        public static final String NUMSENT_PROP="numSent";
        public static final String NUMERRORS_PROP="numErrors";
        public static final String BATCHED_PROP="batched";
        public static final String ENDTIME_PROP="endTime";
        public static final String REPLYTO_PROP="replyto";
        public static final String NUMSOFTBOUNCES_PROP="numSoftBounces";
        public static final String NUMTOSEND_PROP="numToSend";
        public static final String NAME_PROP="name";
        public static final String SENDASHTML_PROP="sendAsHtml";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public MailingItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // params : [B
        // writable: true
        public Object[] getParams() {
            return (Object[]) wrapped.getPropertyValue(PARAMS_PROP);
        }

        public void setParams(Object[] value){
            wrapped.setPropertyValue(PARAMS_PROP, value);
        }
        
        // batchExecId : java.lang.String
        // writable: true
        public java.lang.String getBatchExecId() {
            return (java.lang.String) wrapped.getPropertyValue(BATCHEXECID_PROP);
        }

        public void setBatchExecId(java.lang.String value){
            wrapped.setPropertyValue(BATCHEXECID_PROP, value);
        }
        
        // bcc : java.lang.String
        // writable: true
        public java.lang.String getBcc() {
            return (java.lang.String) wrapped.getPropertyValue(BCC_PROP);
        }

        public void setBcc(java.lang.String value){
            wrapped.setPropertyValue(BCC_PROP, value);
        }
        
        // from : java.lang.String
        // writable: true
        public java.lang.String getFrom() {
            return (java.lang.String) wrapped.getPropertyValue(FROM_PROP);
        }

        public void setFrom(java.lang.String value){
            wrapped.setPropertyValue(FROM_PROP, value);
        }
        
        // subject : java.lang.String
        // writable: true
        public java.lang.String getSubject() {
            return (java.lang.String) wrapped.getPropertyValue(SUBJECT_PROP);
        }

        public void setSubject(java.lang.String value){
            wrapped.setPropertyValue(SUBJECT_PROP, value);
        }
        
        // uniqServerId : java.lang.String
        // writable: true
        public java.lang.String getUniqServerId() {
            return (java.lang.String) wrapped.getPropertyValue(UNIQSERVERID_PROP);
        }

        public void setUniqServerId(java.lang.String value){
            wrapped.setPropertyValue(UNIQSERVERID_PROP, value);
        }
        
        // numBounces : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumBounces() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMBOUNCES_PROP);
        }

        public void setNumBounces(java.lang.Integer value){
            wrapped.setPropertyValue(NUMBOUNCES_PROP, value);
        }
        
        // startTime : java.sql.Timestamp
        // writable: true
        public java.sql.Timestamp getStartTime() {
            return (java.sql.Timestamp) wrapped.getPropertyValue(STARTTIME_PROP);
        }

        public void setStartTime(java.sql.Timestamp value){
            wrapped.setPropertyValue(STARTTIME_PROP, value);
        }
        
        // ignoreContactFatigue : java.lang.Boolean
        // writable: true
        public java.lang.Boolean getIgnoreContactFatigue() {
            return (java.lang.Boolean) wrapped.getPropertyValue(IGNORECONTACTFATIGUE_PROP);
        }

        public void setIgnoreContactFatigue(java.lang.Boolean value){
            wrapped.setPropertyValue(IGNORECONTACTFATIGUE_PROP, value);
        }
        
        // emailAddresses : java.util.List
        // writable: true
        public java.util.List getEmailAddresses() {
            return (java.util.List) wrapped.getPropertyValue(EMAILADDRESSES_PROP);
        }

        public void setEmailAddresses(java.util.List value){
            wrapped.setPropertyValue(EMAILADDRESSES_PROP, value);
        }
        
        // siteId : java.lang.String
        // writable: true
        public java.lang.String getSiteId() {
            return (java.lang.String) wrapped.getPropertyValue(SITEID_PROP);
        }

        public void setSiteId(java.lang.String value){
            wrapped.setPropertyValue(SITEID_PROP, value);
        }
        
        // recipients : java.util.List
        // writable: true
        public java.util.List getRecipients() {
            return (java.util.List) wrapped.getPropertyValue(RECIPIENTS_PROP);
        }

        public void setRecipients(java.util.List value){
            wrapped.setPropertyValue(RECIPIENTS_PROP, value);
        }
        
        // numSkipped : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumSkipped() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMSKIPPED_PROP);
        }

        public void setNumSkipped(java.lang.Integer value){
            wrapped.setPropertyValue(NUMSKIPPED_PROP, value);
        }
        
        // fillFromTemplate : java.lang.Boolean
        // writable: true
        public java.lang.Boolean getFillFromTemplate() {
            return (java.lang.Boolean) wrapped.getPropertyValue(FILLFROMTEMPLATE_PROP);
        }

        public void setFillFromTemplate(java.lang.Boolean value){
            wrapped.setPropertyValue(FILLFROMTEMPLATE_PROP, value);
        }
        
        // cc : java.lang.String
        // writable: true
        public java.lang.String getCc() {
            return (java.lang.String) wrapped.getPropertyValue(CC_PROP);
        }

        public void setCc(java.lang.String value){
            wrapped.setPropertyValue(CC_PROP, value);
        }
        
        // batchSize : java.lang.Integer
        // writable: true
        public java.lang.Integer getBatchSize() {
            return (java.lang.Integer) wrapped.getPropertyValue(BATCHSIZE_PROP);
        }

        public void setBatchSize(java.lang.Integer value){
            wrapped.setPropertyValue(BATCHSIZE_PROP, value);
        }
        
        // status : java.lang.String
        // writable: true
        public java.lang.String getStatus() {
            return (java.lang.String) wrapped.getPropertyValue(STATUS_PROP);
        }

        public void setStatus(java.lang.String value){
            wrapped.setPropertyValue(STATUS_PROP, value);
        }
        
        // trackingData : java.util.Map
        // writable: true
        public java.util.Map getTrackingData() {
            return (java.util.Map) wrapped.getPropertyValue(TRACKINGDATA_PROP);
        }

        public void setTrackingData(java.util.Map value){
            wrapped.setPropertyValue(TRACKINGDATA_PROP, value);
        }
        
        // altTemplate : java.lang.String
        // writable: true
        public java.lang.String getAltTemplate() {
            return (java.lang.String) wrapped.getPropertyValue(ALTTEMPLATE_PROP);
        }

        public void setAltTemplate(java.lang.String value){
            wrapped.setPropertyValue(ALTTEMPLATE_PROP, value);
        }
        
        // sendAsText : java.lang.String
        // writable: true
        public java.lang.String getSendAsText() {
            return (java.lang.String) wrapped.getPropertyValue(SENDASTEXT_PROP);
        }

        public void setSendAsText(java.lang.String value){
            wrapped.setPropertyValue(SENDASTEXT_PROP, value);
        }
        
        // template : java.lang.String
        // writable: true
        public java.lang.String getTemplate() {
            return (java.lang.String) wrapped.getPropertyValue(TEMPLATE_PROP);
        }

        public void setTemplate(java.lang.String value){
            wrapped.setPropertyValue(TEMPLATE_PROP, value);
        }
        
        // id : java.lang.String
        // writable: true
        public java.lang.String getId() {
            return (java.lang.String) wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(java.lang.String value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // numSent : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumSent() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMSENT_PROP);
        }

        public void setNumSent(java.lang.Integer value){
            wrapped.setPropertyValue(NUMSENT_PROP, value);
        }
        
        // numErrors : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumErrors() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMERRORS_PROP);
        }

        public void setNumErrors(java.lang.Integer value){
            wrapped.setPropertyValue(NUMERRORS_PROP, value);
        }
        
        // batched : java.lang.Boolean
        // writable: true
        public java.lang.Boolean getBatched() {
            return (java.lang.Boolean) wrapped.getPropertyValue(BATCHED_PROP);
        }

        public void setBatched(java.lang.Boolean value){
            wrapped.setPropertyValue(BATCHED_PROP, value);
        }
        
        // endTime : java.sql.Timestamp
        // writable: true
        public java.sql.Timestamp getEndTime() {
            return (java.sql.Timestamp) wrapped.getPropertyValue(ENDTIME_PROP);
        }

        public void setEndTime(java.sql.Timestamp value){
            wrapped.setPropertyValue(ENDTIME_PROP, value);
        }
        
        // replyto : java.lang.String
        // writable: true
        public java.lang.String getReplyto() {
            return (java.lang.String) wrapped.getPropertyValue(REPLYTO_PROP);
        }

        public void setReplyto(java.lang.String value){
            wrapped.setPropertyValue(REPLYTO_PROP, value);
        }
        
        // numSoftBounces : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumSoftBounces() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMSOFTBOUNCES_PROP);
        }

        public void setNumSoftBounces(java.lang.Integer value){
            wrapped.setPropertyValue(NUMSOFTBOUNCES_PROP, value);
        }
        
        // numToSend : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumToSend() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMTOSEND_PROP);
        }

        public void setNumToSend(java.lang.Integer value){
            wrapped.setPropertyValue(NUMTOSEND_PROP, value);
        }
        
        // name : java.lang.String
        // writable: true
        public java.lang.String getName() {
            return (java.lang.String) wrapped.getPropertyValue(NAME_PROP);
        }

        public void setName(java.lang.String value){
            wrapped.setPropertyValue(NAME_PROP, value);
        }
        
        // sendAsHtml : java.lang.String
        // writable: true
        public java.lang.String getSendAsHtml() {
            return (java.lang.String) wrapped.getPropertyValue(SENDASHTML_PROP);
        }

        public void setSendAsHtml(java.lang.String value){
            wrapped.setPropertyValue(SENDASHTML_PROP, value);
        }
        

    }
      
    // mailBatch
    public static class MailBatchItem {

        public static final String UNIQSERVERID_PROP="uniqServerId";
        public static final String NUMBOUNCES_PROP="numBounces";
        public static final String STARTTIME_PROP="startTime";
        public static final String NUMSKIPPED_PROP="numSkipped";
        public static final String STARTIDX_PROP="startIdx";
        public static final String STATUS_PROP="status";
        public static final String MAILINGID_PROP="mailingId";
        public static final String NUMSENT_PROP="numSent";
        public static final String NUMERRORS_PROP="numErrors";
        public static final String ENDTIME_PROP="endTime";
        public static final String SUMMARIZED_PROP="summarized";
        public static final String NUMTOSEND_PROP="numToSend";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public MailBatchItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // uniqServerId : java.lang.String
        // writable: true
        public java.lang.String getUniqServerId() {
            return (java.lang.String) wrapped.getPropertyValue(UNIQSERVERID_PROP);
        }

        public void setUniqServerId(java.lang.String value){
            wrapped.setPropertyValue(UNIQSERVERID_PROP, value);
        }
        
        // numBounces : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumBounces() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMBOUNCES_PROP);
        }

        public void setNumBounces(java.lang.Integer value){
            wrapped.setPropertyValue(NUMBOUNCES_PROP, value);
        }
        
        // startTime : java.sql.Timestamp
        // writable: true
        public java.sql.Timestamp getStartTime() {
            return (java.sql.Timestamp) wrapped.getPropertyValue(STARTTIME_PROP);
        }

        public void setStartTime(java.sql.Timestamp value){
            wrapped.setPropertyValue(STARTTIME_PROP, value);
        }
        
        // numSkipped : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumSkipped() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMSKIPPED_PROP);
        }

        public void setNumSkipped(java.lang.Integer value){
            wrapped.setPropertyValue(NUMSKIPPED_PROP, value);
        }
        
        // startIdx : java.lang.Integer
        // writable: true
        public java.lang.Integer getStartIdx() {
            return (java.lang.Integer) wrapped.getPropertyValue(STARTIDX_PROP);
        }

        public void setStartIdx(java.lang.Integer value){
            wrapped.setPropertyValue(STARTIDX_PROP, value);
        }
        
        // status : java.lang.String
        // writable: true
        public java.lang.String getStatus() {
            return (java.lang.String) wrapped.getPropertyValue(STATUS_PROP);
        }

        public void setStatus(java.lang.String value){
            wrapped.setPropertyValue(STATUS_PROP, value);
        }
        
        // mailingId : java.lang.String
        // writable: true
        public java.lang.String getMailingId() {
            return (java.lang.String) wrapped.getPropertyValue(MAILINGID_PROP);
        }

        public void setMailingId(java.lang.String value){
            wrapped.setPropertyValue(MAILINGID_PROP, value);
        }
        
        // numSent : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumSent() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMSENT_PROP);
        }

        public void setNumSent(java.lang.Integer value){
            wrapped.setPropertyValue(NUMSENT_PROP, value);
        }
        
        // numErrors : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumErrors() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMERRORS_PROP);
        }

        public void setNumErrors(java.lang.Integer value){
            wrapped.setPropertyValue(NUMERRORS_PROP, value);
        }
        
        // endTime : java.sql.Timestamp
        // writable: true
        public java.sql.Timestamp getEndTime() {
            return (java.sql.Timestamp) wrapped.getPropertyValue(ENDTIME_PROP);
        }

        public void setEndTime(java.sql.Timestamp value){
            wrapped.setPropertyValue(ENDTIME_PROP, value);
        }
        
        // summarized : java.lang.Boolean
        // writable: true
        public java.lang.Boolean getSummarized() {
            return (java.lang.Boolean) wrapped.getPropertyValue(SUMMARIZED_PROP);
        }

        public void setSummarized(java.lang.Boolean value){
            wrapped.setPropertyValue(SUMMARIZED_PROP, value);
        }
        
        // numToSend : java.lang.Integer
        // writable: true
        public java.lang.Integer getNumToSend() {
            return (java.lang.Integer) wrapped.getPropertyValue(NUMTOSEND_PROP);
        }

        public void setNumToSend(java.lang.Integer value){
            wrapped.setPropertyValue(NUMTOSEND_PROP, value);
        }
        

    }
      
    // mailServer
    public static class MailServerItem {

        public static final String UNIQSERVERID_PROP="uniqServerId";
        public static final String LASTUPDATED_PROP="lastUpdated";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public MailServerItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // uniqServerId : java.lang.String
        // writable: true
        public java.lang.String getUniqServerId() {
            return (java.lang.String) wrapped.getPropertyValue(UNIQSERVERID_PROP);
        }

        public void setUniqServerId(java.lang.String value){
            wrapped.setPropertyValue(UNIQSERVERID_PROP, value);
        }
        
        // lastUpdated : java.sql.Timestamp
        // writable: true
        public java.sql.Timestamp getLastUpdated() {
            return (java.sql.Timestamp) wrapped.getPropertyValue(LASTUPDATED_PROP);
        }

        public void setLastUpdated(java.sql.Timestamp value){
            wrapped.setPropertyValue(LASTUPDATED_PROP, value);
        }
        

    }
      
    // role
    public static class RoleItem {

        public static final String DESCRIPTION_PROP="description";
        public static final String VERSION_PROP="version";
        public static final String ID_PROP="id";
        public static final String RELATIVETO_PROP="relativeTo";
        public static final String TYPE_PROP="type";
        public static final String NAME_PROP="name";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public RoleItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // description : java.lang.String
        // writable: true
        public java.lang.String getDescription() {
            return (java.lang.String) wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(java.lang.String value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // version : java.lang.Integer
        // writable: false
        public java.lang.Integer getVersion() {
            return (java.lang.Integer) wrapped.getPropertyValue(VERSION_PROP);
        }

        // id : java.lang.String
        // writable: true
        public java.lang.String getId() {
            return (java.lang.String) wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(java.lang.String value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // relativeTo : java.lang.String
        // writable: true
        public java.lang.String getRelativeTo() {
            return (java.lang.String) wrapped.getPropertyValue(RELATIVETO_PROP);
        }

        public void setRelativeTo(java.lang.String value){
            wrapped.setPropertyValue(RELATIVETO_PROP, value);
        }
        
        // type : java.lang.String
        // writable: true
        public java.lang.String getType() {
            return (java.lang.String) wrapped.getPropertyValue(TYPE_PROP);
        }

        public void setType(java.lang.String value){
            wrapped.setPropertyValue(TYPE_PROP, value);
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
      
    // organizationalRole
    public static class OrganizationalRoleItem {

        public static final String DESCRIPTION_PROP="description";
        public static final String VERSION_PROP="version";
        public static final String FUNCTION_PROP="function";
        public static final String ID_PROP="id";
        public static final String RELATIVETO_PROP="relativeTo";
        public static final String TYPE_PROP="type";
        public static final String NAME_PROP="name";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public OrganizationalRoleItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // description : java.lang.String
        // writable: true
        public java.lang.String getDescription() {
            return (java.lang.String) wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(java.lang.String value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // version : java.lang.Integer
        // writable: false
        public java.lang.Integer getVersion() {
            return (java.lang.Integer) wrapped.getPropertyValue(VERSION_PROP);
        }

        // function : java.lang.String
        // writable: true
        public java.lang.String getFunction() {
            return (java.lang.String) wrapped.getPropertyValue(FUNCTION_PROP);
        }

        public void setFunction(java.lang.String value){
            wrapped.setPropertyValue(FUNCTION_PROP, value);
        }
        
        // id : java.lang.String
        // writable: true
        public java.lang.String getId() {
            return (java.lang.String) wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(java.lang.String value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // relativeTo : atg.repository.RepositoryItem
        // writable: true
        public  /* [ItemDesc: organization] */ RepositoryItem getRelativeTo() {
            return ( /* [ItemDesc: organization] */ RepositoryItem) wrapped.getPropertyValue(RELATIVETO_PROP);
        }

        public void setRelativeTo( /* [ItemDesc: organization] */ RepositoryItem value){
            wrapped.setPropertyValue(RELATIVETO_PROP, value);
        }
        
        // type : java.lang.String
        // writable: true
        public java.lang.String getType() {
            return (java.lang.String) wrapped.getPropertyValue(TYPE_PROP);
        }

        public void setType(java.lang.String value){
            wrapped.setPropertyValue(TYPE_PROP, value);
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
      
    // organization
    public static class OrganizationItem {

        public static final String RELATIVEROLES_PROP="relativeRoles";
        public static final String DESCRIPTION_PROP="description";
        public static final String ANCESTORORGANIZATIONS_PROP="ancestorOrganizations";
        public static final String PARENTORGANIZATION_PROP="parentOrganization";
        public static final String ROLES_PROP="roles";
        public static final String CHILDORGANIZATIONS_PROP="childOrganizations";
        public static final String SECONDARYMEMBERS_PROP="secondaryMembers";
        public static final String ALLMEMBERS_PROP="allMembers";
        public static final String ID_PROP="id";
        public static final String MEMBERS_PROP="members";
        public static final String NAME_PROP="name";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public OrganizationItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // relativeRoles : java.util.List
        // writable: true
        public java.util.List getRelativeRoles() {
            return (java.util.List) wrapped.getPropertyValue(RELATIVEROLES_PROP);
        }

        public void setRelativeRoles(java.util.List value){
            wrapped.setPropertyValue(RELATIVEROLES_PROP, value);
        }
        
        // description : java.lang.String
        // writable: true
        public java.lang.String getDescription() {
            return (java.lang.String) wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(java.lang.String value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // ancestorOrganizations : java.util.List
        // writable: true
        public java.util.List getAncestorOrganizations() {
            return (java.util.List) wrapped.getPropertyValue(ANCESTORORGANIZATIONS_PROP);
        }

        public void setAncestorOrganizations(java.util.List value){
            wrapped.setPropertyValue(ANCESTORORGANIZATIONS_PROP, value);
        }
        
        // parentOrganization : atg.repository.RepositoryItem
        // writable: true
        public  /* [ItemDesc: organization] */ RepositoryItem getParentOrganization() {
            return ( /* [ItemDesc: organization] */ RepositoryItem) wrapped.getPropertyValue(PARENTORGANIZATION_PROP);
        }

        public void setParentOrganization( /* [ItemDesc: organization] */ RepositoryItem value){
            wrapped.setPropertyValue(PARENTORGANIZATION_PROP, value);
        }
        
        // roles : java.util.Set
        // writable: true
        public java.util.Set getRoles() {
            return (java.util.Set) wrapped.getPropertyValue(ROLES_PROP);
        }

        public void setRoles(java.util.Set value){
            wrapped.setPropertyValue(ROLES_PROP, value);
        }
        
        // childOrganizations : java.util.Set
        // writable: true
        public java.util.Set getChildOrganizations() {
            return (java.util.Set) wrapped.getPropertyValue(CHILDORGANIZATIONS_PROP);
        }

        public void setChildOrganizations(java.util.Set value){
            wrapped.setPropertyValue(CHILDORGANIZATIONS_PROP, value);
        }
        
        // secondaryMembers : java.util.Set
        // writable: true
        public java.util.Set getSecondaryMembers() {
            return (java.util.Set) wrapped.getPropertyValue(SECONDARYMEMBERS_PROP);
        }

        public void setSecondaryMembers(java.util.Set value){
            wrapped.setPropertyValue(SECONDARYMEMBERS_PROP, value);
        }
        
        // allMembers : java.util.Set
        // writable: false
        public java.util.Set getAllMembers() {
            return (java.util.Set) wrapped.getPropertyValue(ALLMEMBERS_PROP);
        }

        // id : java.lang.String
        // writable: true
        public java.lang.String getId() {
            return (java.lang.String) wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(java.lang.String value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // members : java.util.Set
        // writable: true
        public java.util.Set getMembers() {
            return (java.util.Set) wrapped.getPropertyValue(MEMBERS_PROP);
        }

        public void setMembers(java.util.Set value){
            wrapped.setPropertyValue(MEMBERS_PROP, value);
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
      
    // genericFolder
    public static class GenericFolderItem {

        public static final String DESCRIPTION_PROP="description";
        public static final String CHILDFOLDERS_PROP="childFolders";
        public static final String CHILDITEMS_PROP="childItems";
        public static final String PARENT_PROP="parent";
        public static final String ID_PROP="id";
        public static final String TYPE_PROP="type";
        public static final String NAME_PROP="name";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public GenericFolderItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // description : java.lang.String
        // writable: true
        public java.lang.String getDescription() {
            return (java.lang.String) wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(java.lang.String value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // childFolders : java.util.Set
        // writable: true
        public java.util.Set getChildFolders() {
            return (java.util.Set) wrapped.getPropertyValue(CHILDFOLDERS_PROP);
        }

        public void setChildFolders(java.util.Set value){
            wrapped.setPropertyValue(CHILDFOLDERS_PROP, value);
        }
        
        // childItems : java.lang.String
        // writable: true
        public java.lang.String getChildItems() {
            return (java.lang.String) wrapped.getPropertyValue(CHILDITEMS_PROP);
        }

        public void setChildItems(java.lang.String value){
            wrapped.setPropertyValue(CHILDITEMS_PROP, value);
        }
        
        // parent : atg.repository.RepositoryItem
        // writable: true
        public  /* [ItemDesc: genericFolder] */ RepositoryItem getParent() {
            return ( /* [ItemDesc: genericFolder] */ RepositoryItem) wrapped.getPropertyValue(PARENT_PROP);
        }

        public void setParent( /* [ItemDesc: genericFolder] */ RepositoryItem value){
            wrapped.setPropertyValue(PARENT_PROP, value);
        }
        
        // id : java.lang.String
        // writable: true
        public java.lang.String getId() {
            return (java.lang.String) wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(java.lang.String value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // type : java.lang.String
        // writable: true
        public java.lang.String getType() {
            return (java.lang.String) wrapped.getPropertyValue(TYPE_PROP);
        }

        public void setType(java.lang.String value){
            wrapped.setPropertyValue(TYPE_PROP, value);
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
      
    // roleFolder
    public static class RoleFolderItem {

        public static final String DESCRIPTION_PROP="description";
        public static final String CHILDFOLDERS_PROP="childFolders";
        public static final String CHILDITEMS_PROP="childItems";
        public static final String PARENT_PROP="parent";
        public static final String ID_PROP="id";
        public static final String TYPE_PROP="type";
        public static final String NAME_PROP="name";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public RoleFolderItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // description : java.lang.String
        // writable: true
        public java.lang.String getDescription() {
            return (java.lang.String) wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(java.lang.String value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // childFolders : java.util.Set
        // writable: true
        public java.util.Set getChildFolders() {
            return (java.util.Set) wrapped.getPropertyValue(CHILDFOLDERS_PROP);
        }

        public void setChildFolders(java.util.Set value){
            wrapped.setPropertyValue(CHILDFOLDERS_PROP, value);
        }
        
        // childItems : java.util.Set
        // writable: true
        public java.util.Set getChildItems() {
            return (java.util.Set) wrapped.getPropertyValue(CHILDITEMS_PROP);
        }

        public void setChildItems(java.util.Set value){
            wrapped.setPropertyValue(CHILDITEMS_PROP, value);
        }
        
        // parent : atg.repository.RepositoryItem
        // writable: true
        public  /* [ItemDesc: genericFolder] */ RepositoryItem getParent() {
            return ( /* [ItemDesc: genericFolder] */ RepositoryItem) wrapped.getPropertyValue(PARENT_PROP);
        }

        public void setParent( /* [ItemDesc: genericFolder] */ RepositoryItem value){
            wrapped.setPropertyValue(PARENT_PROP, value);
        }
        
        // id : java.lang.String
        // writable: true
        public java.lang.String getId() {
            return (java.lang.String) wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(java.lang.String value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // type : java.lang.String
        // writable: true
        public java.lang.String getType() {
            return (java.lang.String) wrapped.getPropertyValue(TYPE_PROP);
        }

        public void setType(java.lang.String value){
            wrapped.setPropertyValue(TYPE_PROP, value);
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
      
    // profileRealm
    public static class ProfileRealmItem {

        public static final String DESCRIPTION_PROP="description";
        public static final String ID_PROP="id";
        public static final String NAME_PROP="name";

        private MutableRepositoryItem wrapped;

        public MutableRepositoryItem getWrapped() {
            return wrapped;
        }

        public ProfileRealmItem(final MutableRepositoryItem pRepositoryItem) {
            wrapped = pRepositoryItem;
        }

        // description : java.lang.String
        // writable: true
        public java.lang.String getDescription() {
            return (java.lang.String) wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(java.lang.String value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // id : java.lang.String
        // writable: true
        public java.lang.String getId() {
            return (java.lang.String) wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(java.lang.String value){
            wrapped.setPropertyValue(ID_PROP, value);
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
      
