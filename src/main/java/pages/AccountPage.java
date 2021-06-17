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

    /**
     * Gets name of the website
     * @param name
     * @return website name
     */
    public String getExistWebsiteName(String name){
        return driver.findElement(By.xpath(String.format(WEBSITE_FAX_XPATH, name))).getText();
    }

    /**
     * Gets type, industry, description
     * @param name
     * @return names of the parameters
     */
    public String getExistTypeIndustryDescription(String name){
        return driver.findElement(By.xpath(String.format(TYPE_INDUSTRY_DESCRIPTION_XPATH, name))).getText();
    }

}
