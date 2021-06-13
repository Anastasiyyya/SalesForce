package constants;

public interface IConstants {

    String LOGIN_URL = "https://tut2.my.salesforce.com";
    String BASE_URL = "https://tut2.lightning.force.com/lightning";
    String ACCOUNTS_LIST_URL = BASE_URL + "/o/Account/list";
    String NEW_ACCOUNT_MODAL_URL = BASE_URL + "/o/Account/new";
    String CONTACTS_LIST_URL = BASE_URL + "/o/Contact/list?filterName=Recent";
    String NEW_CONTACT_MODAL_URL = BASE_URL + "/o/Contact/new";
    String SAVE_BUTTON_XPATH_ON_NEW_ACCOUNT_MODAL = "//button[@title = 'Save']";
    String SAVE_BUTTON_XPATH_ON_NEW_CONTACT_MODAL = "//button[@name ='SaveEdit']";
    String TABLE_XPATH_ON_NEW_MODALS = "//table";
    String NAME_AND_ACCOUNT_NAME_FIELD_XPATH = TABLE_XPATH_ON_NEW_MODALS + "//*[contains(@title,'%s')]";
    String PHONE_FIELDS_XPATH = TABLE_XPATH_ON_NEW_MODALS + "//*[contains(@class,'uiOutputPhone') and contains(text(),'%s')]";


}
