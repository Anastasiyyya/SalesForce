package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class DropDown extends BasePage {

    WebDriver driver;
    String label;

    private static final String ACCOUNT_DROPDOWN_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInputSelect')]//a";
    private static final String ACCOUNT_SELECT_OPTION_XPATH = "//*[contains(@class,'select-options')]/descendant::a[contains(text(),'%s')]";
    private static final String CONTACT_DROPDOWN_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'slds-form-element')]//input";
    private static final String CONTACT_SELECT_OPTION_XPATH = "//*[contains(@class,'slds-media__body')]/descendant::span[contains(@title,'%s')]";
    private static final String ACCOUNT_NAME_DROPDOWN_XPATH = "//label[contains(text(),'%s')]/ancestor::lightning-lookup[contains(@class,'slds-form-element')]//input";
    private static final String ACCOUNT_SELECT_ACCOUNT_XPATH = "//label[contains(text(),'Account Name')]/ancestor::lightning-grouped-combobox[contains(@class,'slds-form-element')]//*[@title='%s']";


    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void accountSelectOption(String option) {
        driver.findElement(By.xpath(String.format(ACCOUNT_DROPDOWN_XPATH,label))).click();
        driver.findElement(By.xpath(String.format(ACCOUNT_SELECT_OPTION_XPATH,option))).click();
    }

    public void contactSelectOption(String option) {
        driver.findElement(By.xpath(String.format(CONTACT_DROPDOWN_XPATH,label))).click();
        driver.findElement(By.xpath(String.format(CONTACT_SELECT_OPTION_XPATH,option))).click();
    }

    public void contactSelectAccount(String option) {
        driver.findElement(By.xpath(String.format(ACCOUNT_NAME_DROPDOWN_XPATH,label))).click();
        new Input(driver, "Account Name").writeTextInDropdownField("account 1");
        driver.findElement(By.xpath(String.format(ACCOUNT_SELECT_ACCOUNT_XPATH,option))).click();
    }
}
