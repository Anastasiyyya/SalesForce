package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {

    public static final String TABLE_XPATH_ON_NEW_MODALS = "//table";
    public static final String NAME_AND_ACCOUNT_NAME_FIELD_XPATH = TABLE_XPATH_ON_NEW_MODALS + "//*[contains(@title,'%s')]";
    public static final String PHONE_FIELDS_XPATH = TABLE_XPATH_ON_NEW_MODALS + "//*[contains(@class,'uiOutputPhone') and contains(text(),'%s')]";

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    /**
     * opens the page by url
     * @param url
     * @return the account list page
     */
    public AccountListPage openPage(String url) {
        driver.get(url);
        return this;
    }

    /**
     * this method gets account name.
     * @param name
     * @return the account name
     */
    public String getExistAccountName(String name){
        return driver.findElement(By.xpath(String.format(NAME_AND_ACCOUNT_NAME_FIELD_XPATH, name))).getText();
    }

    /**
     * this method gets phone number.
     * @param phoneNumber
     * @return phone number
     */
    public String getExistPhoneNumber(String phoneNumber){
        return driver.findElement(By.xpath(String.format(PHONE_FIELDS_XPATH, phoneNumber))).getText();
    }

    /**
     * Clicks on the account name
     * @param accountName
     * @return account page
     */
    public AccountPage clickOnAccountName(String accountName) {
        driver.findElement(By.xpath(String.format(NAME_AND_ACCOUNT_NAME_FIELD_XPATH,accountName))).click();
        return new AccountPage();
    }
}
