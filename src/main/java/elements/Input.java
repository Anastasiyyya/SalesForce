package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    WebDriver driver;
    String label;
    private static final String ACCOUNT_INPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";
    private static final String TEXT_AREA_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//textarea";
    private static final String CONTACT_INPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::lightning-input[contains(@class,'slds-form-element')]//input";
    private static final String CONTACT_DROPDOWN_INPUT_XPATH = "//label[contains(text(),'%s')]/ancestor::lightning-lookup[contains(@class,'slds-form-element')]//input";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeTextInput(String text) {
        driver.findElement(By.xpath(String.format(ACCOUNT_INPUT_XPATH,label))).sendKeys(text);
    }

    public void writeTextArea(String text) {
        driver.findElement(By.xpath(String.format(TEXT_AREA_XPATH,label))).sendKeys(text);
    }

    public void writeTextInContactsField(String text) {
        driver.findElement(By.xpath(String.format(CONTACT_INPUT_XPATH,label))).sendKeys(text);
    }

    public void writeTextInDropdownField(String text) {
        driver.findElement(By.xpath(String.format(CONTACT_DROPDOWN_INPUT_XPATH,label))).sendKeys(text);
    }
}

