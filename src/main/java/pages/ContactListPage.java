package pages;

import objects.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage{
    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    public ContactListPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public String getExistContactName(String firstName, String lastName){
        return driver.findElement(By.xpath(String.format(NAME_AND_ACCOUNT_NAME_FIELD_XPATH, firstName + " " + lastName))).getText();
    }

    public String getExistPhoneNumber(String phoneNumber){
        return driver.findElement(By.xpath(String.format(PHONE_FIELDS_XPATH, phoneNumber))).getText();
    }
}
