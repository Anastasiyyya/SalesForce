package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage{

    public static final String WEBSITE_FAX_XPATH = "//*[(contains(text(),'%s'))]/ancestor::div[contains(@class,'slds-form-element')]//a";
    public static final String TYPE_INDUSTRY_DESCRIPTION_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'slds-form-element')]//lightning-formatted-text";

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public AccountPage() {
        super();
    }

    public String getExistWebsiteName(String name){
        return driver.findElement(By.xpath(String.format(WEBSITE_FAX_XPATH, name))).getText();
    }

    public String getExistTypeIndustryDescription(String name){
        return driver.findElement(By.xpath(String.format(TYPE_INDUSTRY_DESCRIPTION_XPATH, name))).getText();
    }

}
