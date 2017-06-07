package atg.userprofiling;

import atg.adapter.gsa.GSARepository;
import atg.repository.MutableRepositoryItem;

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

        // securityStatus
        public Object getSecurityStatus() {
            return wrapped.getPropertyValue(SECURITYSTATUS_PROP);
        }

        public void setSecurityStatus(Object value){
            wrapped.setPropertyValue(SECURITYSTATUS_PROP, value);
        }
        
        // description
        public Object getDescription() {
            return wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(Object value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // email
        public Object getEmail() {
            return wrapped.getPropertyValue(EMAIL_PROP);
        }

        public void setEmail(Object value){
            wrapped.setPropertyValue(EMAIL_PROP, value);
        }
        
        // password
        public Object getPassword() {
            return wrapped.getPropertyValue(PASSWORD_PROP);
        }

        public void setPassword(Object value){
            wrapped.setPropertyValue(PASSWORD_PROP, value);
        }
        
        // realmId
        public Object getRealmId() {
            return wrapped.getPropertyValue(REALMID_PROP);
        }

        public void setRealmId(Object value){
            wrapped.setPropertyValue(REALMID_PROP, value);
        }
        
        // lastName
        public Object getLastName() {
            return wrapped.getPropertyValue(LASTNAME_PROP);
        }

        public void setLastName(Object value){
            wrapped.setPropertyValue(LASTNAME_PROP, value);
        }
        
        // gender
        public Object getGender() {
            return wrapped.getPropertyValue(GENDER_PROP);
        }

        public void setGender(Object value){
            wrapped.setPropertyValue(GENDER_PROP, value);
        }
        
        // parentOrganization
        public Object getParentOrganization() {
            return wrapped.getPropertyValue(PARENTORGANIZATION_PROP);
        }

        public void setParentOrganization(Object value){
            wrapped.setPropertyValue(PARENTORGANIZATION_PROP, value);
        }
        
        // lastPasswordUpdate
        public Object getLastPasswordUpdate() {
            return wrapped.getPropertyValue(LASTPASSWORDUPDATE_PROP);
        }

        public void setLastPasswordUpdate(Object value){
            wrapped.setPropertyValue(LASTPASSWORDUPDATE_PROP, value);
        }
        
        // passwordKeyDerivationFunction
        public Object getPasswordKeyDerivationFunction() {
            return wrapped.getPropertyValue(PASSWORDKEYDERIVATIONFUNCTION_PROP);
        }

        public void setPasswordKeyDerivationFunction(Object value){
            wrapped.setPropertyValue(PASSWORDKEYDERIVATIONFUNCTION_PROP, value);
        }
        
        // ancestors
        public Object getAncestors() {
            return wrapped.getPropertyValue(ANCESTORS_PROP);
        }

        public void setAncestors(Object value){
            wrapped.setPropertyValue(ANCESTORS_PROP, value);
        }
        
        // receiveEmail
        public Object getReceiveEmail() {
            return wrapped.getPropertyValue(RECEIVEEMAIL_PROP);
        }

        public void setReceiveEmail(Object value){
            wrapped.setPropertyValue(RECEIVEEMAIL_PROP, value);
        }
        
        // registrationDate
        public Object getRegistrationDate() {
            return wrapped.getPropertyValue(REGISTRATIONDATE_PROP);
        }

        public void setRegistrationDate(Object value){
            wrapped.setPropertyValue(REGISTRATIONDATE_PROP, value);
        }
        
        // passwordSalt
        public Object getPasswordSalt() {
            return wrapped.getPropertyValue(PASSWORDSALT_PROP);
        }

        public void setPasswordSalt(Object value){
            wrapped.setPropertyValue(PASSWORDSALT_PROP, value);
        }
        
        // dateOfBirth
        public Object getDateOfBirth() {
            return wrapped.getPropertyValue(DATEOFBIRTH_PROP);
        }

        public void setDateOfBirth(Object value){
            wrapped.setPropertyValue(DATEOFBIRTH_PROP, value);
        }
        
        // member
        public Object getMember() {
            return wrapped.getPropertyValue(MEMBER_PROP);
        }

        public void setMember(Object value){
            wrapped.setPropertyValue(MEMBER_PROP, value);
        }
        
        // firstName
        public Object getFirstName() {
            return wrapped.getPropertyValue(FIRSTNAME_PROP);
        }

        public void setFirstName(Object value){
            wrapped.setPropertyValue(FIRSTNAME_PROP, value);
        }
        
        // roles
        public Object getRoles() {
            return wrapped.getPropertyValue(ROLES_PROP);
        }

        public void setRoles(Object value){
            wrapped.setPropertyValue(ROLES_PROP, value);
        }
        
        // login
        public Object getLogin() {
            return wrapped.getPropertyValue(LOGIN_PROP);
        }

        public void setLogin(Object value){
            wrapped.setPropertyValue(LOGIN_PROP, value);
        }
        
        // homeAddress
        public Object getHomeAddress() {
            return wrapped.getPropertyValue(HOMEADDRESS_PROP);
        }

        public void setHomeAddress(Object value){
            wrapped.setPropertyValue(HOMEADDRESS_PROP, value);
        }
        
        // mailings
        public Object getMailings() {
            return wrapped.getPropertyValue(MAILINGS_PROP);
        }

        public void setMailings(Object value){
            wrapped.setPropertyValue(MAILINGS_PROP, value);
        }
        
        // emailStatus
        public Object getEmailStatus() {
            return wrapped.getPropertyValue(EMAILSTATUS_PROP);
        }

        public void setEmailStatus(Object value){
            wrapped.setPropertyValue(EMAILSTATUS_PROP, value);
        }
        
        // id
        public Object getId() {
            return wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(Object value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // lastEmailed
        public Object getLastEmailed() {
            return wrapped.getPropertyValue(LASTEMAILED_PROP);
        }

        public void setLastEmailed(Object value){
            wrapped.setPropertyValue(LASTEMAILED_PROP, value);
        }
        
        // autoLogin
        public Object getAutoLogin() {
            return wrapped.getPropertyValue(AUTOLOGIN_PROP);
        }

        public void setAutoLogin(Object value){
            wrapped.setPropertyValue(AUTOLOGIN_PROP, value);
        }
        
        // locale
        public Object getLocale() {
            return wrapped.getPropertyValue(LOCALE_PROP);
        }

        public void setLocale(Object value){
            wrapped.setPropertyValue(LOCALE_PROP, value);
        }
        
        // userType
        public Object getUserType() {
            return wrapped.getPropertyValue(USERTYPE_PROP);
        }

        public void setUserType(Object value){
            wrapped.setPropertyValue(USERTYPE_PROP, value);
        }
        
        // lastActivity
        public Object getLastActivity() {
            return wrapped.getPropertyValue(LASTACTIVITY_PROP);
        }

        public void setLastActivity(Object value){
            wrapped.setPropertyValue(LASTACTIVITY_PROP, value);
        }
        
        // previousPasswords
        public Object getPreviousPasswords() {
            return wrapped.getPropertyValue(PREVIOUSPASSWORDS_PROP);
        }

        public void setPreviousPasswords(Object value){
            wrapped.setPropertyValue(PREVIOUSPASSWORDS_PROP, value);
        }
        
        // secondaryOrganizations
        public Object getSecondaryOrganizations() {
            return wrapped.getPropertyValue(SECONDARYORGANIZATIONS_PROP);
        }

        public void setSecondaryOrganizations(Object value){
            wrapped.setPropertyValue(SECONDARYORGANIZATIONS_PROP, value);
        }
        
        // middleName
        public Object getMiddleName() {
            return wrapped.getPropertyValue(MIDDLENAME_PROP);
        }

        public void setMiddleName(Object value){
            wrapped.setPropertyValue(MIDDLENAME_PROP, value);
        }
        
        // generatedPassword
        public Object getGeneratedPassword() {
            return wrapped.getPropertyValue(GENERATEDPASSWORD_PROP);
        }

        public void setGeneratedPassword(Object value){
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

        // postalCode
        public Object getPostalCode() {
            return wrapped.getPropertyValue(POSTALCODE_PROP);
        }

        public void setPostalCode(Object value){
            wrapped.setPropertyValue(POSTALCODE_PROP, value);
        }
        
        // prefix
        public Object getPrefix() {
            return wrapped.getPropertyValue(PREFIX_PROP);
        }

        public void setPrefix(Object value){
            wrapped.setPropertyValue(PREFIX_PROP, value);
        }
        
        // city
        public Object getCity() {
            return wrapped.getPropertyValue(CITY_PROP);
        }

        public void setCity(Object value){
            wrapped.setPropertyValue(CITY_PROP, value);
        }
        
        // country
        public Object getCountry() {
            return wrapped.getPropertyValue(COUNTRY_PROP);
        }

        public void setCountry(Object value){
            wrapped.setPropertyValue(COUNTRY_PROP, value);
        }
        
        // phoneNumber
        public Object getPhoneNumber() {
            return wrapped.getPropertyValue(PHONENUMBER_PROP);
        }

        public void setPhoneNumber(Object value){
            wrapped.setPropertyValue(PHONENUMBER_PROP, value);
        }
        
        // lastName
        public Object getLastName() {
            return wrapped.getPropertyValue(LASTNAME_PROP);
        }

        public void setLastName(Object value){
            wrapped.setPropertyValue(LASTNAME_PROP, value);
        }
        
        // state
        public Object getState() {
            return wrapped.getPropertyValue(STATE_PROP);
        }

        public void setState(Object value){
            wrapped.setPropertyValue(STATE_PROP, value);
        }
        
        // address3
        public Object getAddress3() {
            return wrapped.getPropertyValue(ADDRESS3_PROP);
        }

        public void setAddress3(Object value){
            wrapped.setPropertyValue(ADDRESS3_PROP, value);
        }
        
        // address2
        public Object getAddress2() {
            return wrapped.getPropertyValue(ADDRESS2_PROP);
        }

        public void setAddress2(Object value){
            wrapped.setPropertyValue(ADDRESS2_PROP, value);
        }
        
        // address1
        public Object getAddress1() {
            return wrapped.getPropertyValue(ADDRESS1_PROP);
        }

        public void setAddress1(Object value){
            wrapped.setPropertyValue(ADDRESS1_PROP, value);
        }
        
        // jobTitle
        public Object getJobTitle() {
            return wrapped.getPropertyValue(JOBTITLE_PROP);
        }

        public void setJobTitle(Object value){
            wrapped.setPropertyValue(JOBTITLE_PROP, value);
        }
        
        // ownerId
        public Object getOwnerId() {
            return wrapped.getPropertyValue(OWNERID_PROP);
        }

        public void setOwnerId(Object value){
            wrapped.setPropertyValue(OWNERID_PROP, value);
        }
        
        // firstName
        public Object getFirstName() {
            return wrapped.getPropertyValue(FIRSTNAME_PROP);
        }

        public void setFirstName(Object value){
            wrapped.setPropertyValue(FIRSTNAME_PROP, value);
        }
        
        // faxNumber
        public Object getFaxNumber() {
            return wrapped.getPropertyValue(FAXNUMBER_PROP);
        }

        public void setFaxNumber(Object value){
            wrapped.setPropertyValue(FAXNUMBER_PROP, value);
        }
        
        // companyName
        public Object getCompanyName() {
            return wrapped.getPropertyValue(COMPANYNAME_PROP);
        }

        public void setCompanyName(Object value){
            wrapped.setPropertyValue(COMPANYNAME_PROP, value);
        }
        
        // county
        public Object getCounty() {
            return wrapped.getPropertyValue(COUNTY_PROP);
        }

        public void setCounty(Object value){
            wrapped.setPropertyValue(COUNTY_PROP, value);
        }
        
        // id
        public Object getId() {
            return wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(Object value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // suffix
        public Object getSuffix() {
            return wrapped.getPropertyValue(SUFFIX_PROP);
        }

        public void setSuffix(Object value){
            wrapped.setPropertyValue(SUFFIX_PROP, value);
        }
        
        // middleName
        public Object getMiddleName() {
            return wrapped.getPropertyValue(MIDDLENAME_PROP);
        }

        public void setMiddleName(Object value){
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

        // params
        public Object getParams() {
            return wrapped.getPropertyValue(PARAMS_PROP);
        }

        public void setParams(Object value){
            wrapped.setPropertyValue(PARAMS_PROP, value);
        }
        
        // batchExecId
        public Object getBatchExecId() {
            return wrapped.getPropertyValue(BATCHEXECID_PROP);
        }

        public void setBatchExecId(Object value){
            wrapped.setPropertyValue(BATCHEXECID_PROP, value);
        }
        
        // bcc
        public Object getBcc() {
            return wrapped.getPropertyValue(BCC_PROP);
        }

        public void setBcc(Object value){
            wrapped.setPropertyValue(BCC_PROP, value);
        }
        
        // from
        public Object getFrom() {
            return wrapped.getPropertyValue(FROM_PROP);
        }

        public void setFrom(Object value){
            wrapped.setPropertyValue(FROM_PROP, value);
        }
        
        // subject
        public Object getSubject() {
            return wrapped.getPropertyValue(SUBJECT_PROP);
        }

        public void setSubject(Object value){
            wrapped.setPropertyValue(SUBJECT_PROP, value);
        }
        
        // uniqServerId
        public Object getUniqServerId() {
            return wrapped.getPropertyValue(UNIQSERVERID_PROP);
        }

        public void setUniqServerId(Object value){
            wrapped.setPropertyValue(UNIQSERVERID_PROP, value);
        }
        
        // numBounces
        public Object getNumBounces() {
            return wrapped.getPropertyValue(NUMBOUNCES_PROP);
        }

        public void setNumBounces(Object value){
            wrapped.setPropertyValue(NUMBOUNCES_PROP, value);
        }
        
        // startTime
        public Object getStartTime() {
            return wrapped.getPropertyValue(STARTTIME_PROP);
        }

        public void setStartTime(Object value){
            wrapped.setPropertyValue(STARTTIME_PROP, value);
        }
        
        // ignoreContactFatigue
        public Object getIgnoreContactFatigue() {
            return wrapped.getPropertyValue(IGNORECONTACTFATIGUE_PROP);
        }

        public void setIgnoreContactFatigue(Object value){
            wrapped.setPropertyValue(IGNORECONTACTFATIGUE_PROP, value);
        }
        
        // emailAddresses
        public Object getEmailAddresses() {
            return wrapped.getPropertyValue(EMAILADDRESSES_PROP);
        }

        public void setEmailAddresses(Object value){
            wrapped.setPropertyValue(EMAILADDRESSES_PROP, value);
        }
        
        // siteId
        public Object getSiteId() {
            return wrapped.getPropertyValue(SITEID_PROP);
        }

        public void setSiteId(Object value){
            wrapped.setPropertyValue(SITEID_PROP, value);
        }
        
        // recipients
        public Object getRecipients() {
            return wrapped.getPropertyValue(RECIPIENTS_PROP);
        }

        public void setRecipients(Object value){
            wrapped.setPropertyValue(RECIPIENTS_PROP, value);
        }
        
        // numSkipped
        public Object getNumSkipped() {
            return wrapped.getPropertyValue(NUMSKIPPED_PROP);
        }

        public void setNumSkipped(Object value){
            wrapped.setPropertyValue(NUMSKIPPED_PROP, value);
        }
        
        // fillFromTemplate
        public Object getFillFromTemplate() {
            return wrapped.getPropertyValue(FILLFROMTEMPLATE_PROP);
        }

        public void setFillFromTemplate(Object value){
            wrapped.setPropertyValue(FILLFROMTEMPLATE_PROP, value);
        }
        
        // cc
        public Object getCc() {
            return wrapped.getPropertyValue(CC_PROP);
        }

        public void setCc(Object value){
            wrapped.setPropertyValue(CC_PROP, value);
        }
        
        // batchSize
        public Object getBatchSize() {
            return wrapped.getPropertyValue(BATCHSIZE_PROP);
        }

        public void setBatchSize(Object value){
            wrapped.setPropertyValue(BATCHSIZE_PROP, value);
        }
        
        // status
        public Object getStatus() {
            return wrapped.getPropertyValue(STATUS_PROP);
        }

        public void setStatus(Object value){
            wrapped.setPropertyValue(STATUS_PROP, value);
        }
        
        // trackingData
        public Object getTrackingData() {
            return wrapped.getPropertyValue(TRACKINGDATA_PROP);
        }

        public void setTrackingData(Object value){
            wrapped.setPropertyValue(TRACKINGDATA_PROP, value);
        }
        
        // altTemplate
        public Object getAltTemplate() {
            return wrapped.getPropertyValue(ALTTEMPLATE_PROP);
        }

        public void setAltTemplate(Object value){
            wrapped.setPropertyValue(ALTTEMPLATE_PROP, value);
        }
        
        // sendAsText
        public Object getSendAsText() {
            return wrapped.getPropertyValue(SENDASTEXT_PROP);
        }

        public void setSendAsText(Object value){
            wrapped.setPropertyValue(SENDASTEXT_PROP, value);
        }
        
        // template
        public Object getTemplate() {
            return wrapped.getPropertyValue(TEMPLATE_PROP);
        }

        public void setTemplate(Object value){
            wrapped.setPropertyValue(TEMPLATE_PROP, value);
        }
        
        // id
        public Object getId() {
            return wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(Object value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // numSent
        public Object getNumSent() {
            return wrapped.getPropertyValue(NUMSENT_PROP);
        }

        public void setNumSent(Object value){
            wrapped.setPropertyValue(NUMSENT_PROP, value);
        }
        
        // numErrors
        public Object getNumErrors() {
            return wrapped.getPropertyValue(NUMERRORS_PROP);
        }

        public void setNumErrors(Object value){
            wrapped.setPropertyValue(NUMERRORS_PROP, value);
        }
        
        // batched
        public Object getBatched() {
            return wrapped.getPropertyValue(BATCHED_PROP);
        }

        public void setBatched(Object value){
            wrapped.setPropertyValue(BATCHED_PROP, value);
        }
        
        // endTime
        public Object getEndTime() {
            return wrapped.getPropertyValue(ENDTIME_PROP);
        }

        public void setEndTime(Object value){
            wrapped.setPropertyValue(ENDTIME_PROP, value);
        }
        
        // replyto
        public Object getReplyto() {
            return wrapped.getPropertyValue(REPLYTO_PROP);
        }

        public void setReplyto(Object value){
            wrapped.setPropertyValue(REPLYTO_PROP, value);
        }
        
        // numSoftBounces
        public Object getNumSoftBounces() {
            return wrapped.getPropertyValue(NUMSOFTBOUNCES_PROP);
        }

        public void setNumSoftBounces(Object value){
            wrapped.setPropertyValue(NUMSOFTBOUNCES_PROP, value);
        }
        
        // numToSend
        public Object getNumToSend() {
            return wrapped.getPropertyValue(NUMTOSEND_PROP);
        }

        public void setNumToSend(Object value){
            wrapped.setPropertyValue(NUMTOSEND_PROP, value);
        }
        
        // name
        public Object getName() {
            return wrapped.getPropertyValue(NAME_PROP);
        }

        public void setName(Object value){
            wrapped.setPropertyValue(NAME_PROP, value);
        }
        
        // sendAsHtml
        public Object getSendAsHtml() {
            return wrapped.getPropertyValue(SENDASHTML_PROP);
        }

        public void setSendAsHtml(Object value){
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

        // uniqServerId
        public Object getUniqServerId() {
            return wrapped.getPropertyValue(UNIQSERVERID_PROP);
        }

        public void setUniqServerId(Object value){
            wrapped.setPropertyValue(UNIQSERVERID_PROP, value);
        }
        
        // numBounces
        public Object getNumBounces() {
            return wrapped.getPropertyValue(NUMBOUNCES_PROP);
        }

        public void setNumBounces(Object value){
            wrapped.setPropertyValue(NUMBOUNCES_PROP, value);
        }
        
        // startTime
        public Object getStartTime() {
            return wrapped.getPropertyValue(STARTTIME_PROP);
        }

        public void setStartTime(Object value){
            wrapped.setPropertyValue(STARTTIME_PROP, value);
        }
        
        // numSkipped
        public Object getNumSkipped() {
            return wrapped.getPropertyValue(NUMSKIPPED_PROP);
        }

        public void setNumSkipped(Object value){
            wrapped.setPropertyValue(NUMSKIPPED_PROP, value);
        }
        
        // startIdx
        public Object getStartIdx() {
            return wrapped.getPropertyValue(STARTIDX_PROP);
        }

        public void setStartIdx(Object value){
            wrapped.setPropertyValue(STARTIDX_PROP, value);
        }
        
        // status
        public Object getStatus() {
            return wrapped.getPropertyValue(STATUS_PROP);
        }

        public void setStatus(Object value){
            wrapped.setPropertyValue(STATUS_PROP, value);
        }
        
        // mailingId
        public Object getMailingId() {
            return wrapped.getPropertyValue(MAILINGID_PROP);
        }

        public void setMailingId(Object value){
            wrapped.setPropertyValue(MAILINGID_PROP, value);
        }
        
        // numSent
        public Object getNumSent() {
            return wrapped.getPropertyValue(NUMSENT_PROP);
        }

        public void setNumSent(Object value){
            wrapped.setPropertyValue(NUMSENT_PROP, value);
        }
        
        // numErrors
        public Object getNumErrors() {
            return wrapped.getPropertyValue(NUMERRORS_PROP);
        }

        public void setNumErrors(Object value){
            wrapped.setPropertyValue(NUMERRORS_PROP, value);
        }
        
        // endTime
        public Object getEndTime() {
            return wrapped.getPropertyValue(ENDTIME_PROP);
        }

        public void setEndTime(Object value){
            wrapped.setPropertyValue(ENDTIME_PROP, value);
        }
        
        // summarized
        public Object getSummarized() {
            return wrapped.getPropertyValue(SUMMARIZED_PROP);
        }

        public void setSummarized(Object value){
            wrapped.setPropertyValue(SUMMARIZED_PROP, value);
        }
        
        // numToSend
        public Object getNumToSend() {
            return wrapped.getPropertyValue(NUMTOSEND_PROP);
        }

        public void setNumToSend(Object value){
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

        // uniqServerId
        public Object getUniqServerId() {
            return wrapped.getPropertyValue(UNIQSERVERID_PROP);
        }

        public void setUniqServerId(Object value){
            wrapped.setPropertyValue(UNIQSERVERID_PROP, value);
        }
        
        // lastUpdated
        public Object getLastUpdated() {
            return wrapped.getPropertyValue(LASTUPDATED_PROP);
        }

        public void setLastUpdated(Object value){
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

        // description
        public Object getDescription() {
            return wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(Object value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // version
        public Object getVersion() {
            return wrapped.getPropertyValue(VERSION_PROP);
        }

        public void setVersion(Object value){
            wrapped.setPropertyValue(VERSION_PROP, value);
        }
        
        // id
        public Object getId() {
            return wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(Object value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // relativeTo
        public Object getRelativeTo() {
            return wrapped.getPropertyValue(RELATIVETO_PROP);
        }

        public void setRelativeTo(Object value){
            wrapped.setPropertyValue(RELATIVETO_PROP, value);
        }
        
        // type
        public Object getType() {
            return wrapped.getPropertyValue(TYPE_PROP);
        }

        public void setType(Object value){
            wrapped.setPropertyValue(TYPE_PROP, value);
        }
        
        // name
        public Object getName() {
            return wrapped.getPropertyValue(NAME_PROP);
        }

        public void setName(Object value){
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

        // description
        public Object getDescription() {
            return wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(Object value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // version
        public Object getVersion() {
            return wrapped.getPropertyValue(VERSION_PROP);
        }

        public void setVersion(Object value){
            wrapped.setPropertyValue(VERSION_PROP, value);
        }
        
        // function
        public Object getFunction() {
            return wrapped.getPropertyValue(FUNCTION_PROP);
        }

        public void setFunction(Object value){
            wrapped.setPropertyValue(FUNCTION_PROP, value);
        }
        
        // id
        public Object getId() {
            return wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(Object value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // relativeTo
        public Object getRelativeTo() {
            return wrapped.getPropertyValue(RELATIVETO_PROP);
        }

        public void setRelativeTo(Object value){
            wrapped.setPropertyValue(RELATIVETO_PROP, value);
        }
        
        // type
        public Object getType() {
            return wrapped.getPropertyValue(TYPE_PROP);
        }

        public void setType(Object value){
            wrapped.setPropertyValue(TYPE_PROP, value);
        }
        
        // name
        public Object getName() {
            return wrapped.getPropertyValue(NAME_PROP);
        }

        public void setName(Object value){
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

        // relativeRoles
        public Object getRelativeRoles() {
            return wrapped.getPropertyValue(RELATIVEROLES_PROP);
        }

        public void setRelativeRoles(Object value){
            wrapped.setPropertyValue(RELATIVEROLES_PROP, value);
        }
        
        // description
        public Object getDescription() {
            return wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(Object value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // ancestorOrganizations
        public Object getAncestorOrganizations() {
            return wrapped.getPropertyValue(ANCESTORORGANIZATIONS_PROP);
        }

        public void setAncestorOrganizations(Object value){
            wrapped.setPropertyValue(ANCESTORORGANIZATIONS_PROP, value);
        }
        
        // parentOrganization
        public Object getParentOrganization() {
            return wrapped.getPropertyValue(PARENTORGANIZATION_PROP);
        }

        public void setParentOrganization(Object value){
            wrapped.setPropertyValue(PARENTORGANIZATION_PROP, value);
        }
        
        // roles
        public Object getRoles() {
            return wrapped.getPropertyValue(ROLES_PROP);
        }

        public void setRoles(Object value){
            wrapped.setPropertyValue(ROLES_PROP, value);
        }
        
        // childOrganizations
        public Object getChildOrganizations() {
            return wrapped.getPropertyValue(CHILDORGANIZATIONS_PROP);
        }

        public void setChildOrganizations(Object value){
            wrapped.setPropertyValue(CHILDORGANIZATIONS_PROP, value);
        }
        
        // secondaryMembers
        public Object getSecondaryMembers() {
            return wrapped.getPropertyValue(SECONDARYMEMBERS_PROP);
        }

        public void setSecondaryMembers(Object value){
            wrapped.setPropertyValue(SECONDARYMEMBERS_PROP, value);
        }
        
        // allMembers
        public Object getAllMembers() {
            return wrapped.getPropertyValue(ALLMEMBERS_PROP);
        }

        public void setAllMembers(Object value){
            wrapped.setPropertyValue(ALLMEMBERS_PROP, value);
        }
        
        // id
        public Object getId() {
            return wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(Object value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // members
        public Object getMembers() {
            return wrapped.getPropertyValue(MEMBERS_PROP);
        }

        public void setMembers(Object value){
            wrapped.setPropertyValue(MEMBERS_PROP, value);
        }
        
        // name
        public Object getName() {
            return wrapped.getPropertyValue(NAME_PROP);
        }

        public void setName(Object value){
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

        // description
        public Object getDescription() {
            return wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(Object value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // childFolders
        public Object getChildFolders() {
            return wrapped.getPropertyValue(CHILDFOLDERS_PROP);
        }

        public void setChildFolders(Object value){
            wrapped.setPropertyValue(CHILDFOLDERS_PROP, value);
        }
        
        // childItems
        public Object getChildItems() {
            return wrapped.getPropertyValue(CHILDITEMS_PROP);
        }

        public void setChildItems(Object value){
            wrapped.setPropertyValue(CHILDITEMS_PROP, value);
        }
        
        // parent
        public Object getParent() {
            return wrapped.getPropertyValue(PARENT_PROP);
        }

        public void setParent(Object value){
            wrapped.setPropertyValue(PARENT_PROP, value);
        }
        
        // id
        public Object getId() {
            return wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(Object value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // type
        public Object getType() {
            return wrapped.getPropertyValue(TYPE_PROP);
        }

        public void setType(Object value){
            wrapped.setPropertyValue(TYPE_PROP, value);
        }
        
        // name
        public Object getName() {
            return wrapped.getPropertyValue(NAME_PROP);
        }

        public void setName(Object value){
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

        // description
        public Object getDescription() {
            return wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(Object value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // childFolders
        public Object getChildFolders() {
            return wrapped.getPropertyValue(CHILDFOLDERS_PROP);
        }

        public void setChildFolders(Object value){
            wrapped.setPropertyValue(CHILDFOLDERS_PROP, value);
        }
        
        // childItems
        public Object getChildItems() {
            return wrapped.getPropertyValue(CHILDITEMS_PROP);
        }

        public void setChildItems(Object value){
            wrapped.setPropertyValue(CHILDITEMS_PROP, value);
        }
        
        // parent
        public Object getParent() {
            return wrapped.getPropertyValue(PARENT_PROP);
        }

        public void setParent(Object value){
            wrapped.setPropertyValue(PARENT_PROP, value);
        }
        
        // id
        public Object getId() {
            return wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(Object value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // type
        public Object getType() {
            return wrapped.getPropertyValue(TYPE_PROP);
        }

        public void setType(Object value){
            wrapped.setPropertyValue(TYPE_PROP, value);
        }
        
        // name
        public Object getName() {
            return wrapped.getPropertyValue(NAME_PROP);
        }

        public void setName(Object value){
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

        // description
        public Object getDescription() {
            return wrapped.getPropertyValue(DESCRIPTION_PROP);
        }

        public void setDescription(Object value){
            wrapped.setPropertyValue(DESCRIPTION_PROP, value);
        }
        
        // id
        public Object getId() {
            return wrapped.getPropertyValue(ID_PROP);
        }

        public void setId(Object value){
            wrapped.setPropertyValue(ID_PROP, value);
        }
        
        // name
        public Object getName() {
            return wrapped.getPropertyValue(NAME_PROP);
        }

        public void setName(Object value){
            wrapped.setPropertyValue(NAME_PROP, value);
        }
        

    }
      

}
      
