
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    public AccountListPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public String getExistAccountName(String name){
        return driver.findElement(By.xpath(String.format(NAME_AND_ACCOUNT_NAME_FIELD_XPATH, name))).getText();
    }

    public String getExistPhoneNumber(String phoneNumber){
        return driver.findElement(By.xpath(String.format(PHONE_FIELDS_XPATH, phoneNumber))).getText();
    }

    public AccountPage clickOnAccountName(String accountName) {
        driver.findElement(By.xpath(String.format(NAME_AND_ACCOUNT_NAME_FIELD_XPATH,accountName))).click();
        return new AccountPage();
    }
}
