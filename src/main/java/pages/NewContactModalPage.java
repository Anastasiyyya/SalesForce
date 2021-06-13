package pages;

import elements.Buttons;
import elements.Input;
import objects.Contact;
import org.openqa.selenium.WebDriver;
import elements.DropDown;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContactModalPage extends BasePage {

    public NewContactModalPage(WebDriver driver) {
        super(driver);
    }

    public NewContactModalPage openPage(String url) {
        driver.get(url);
        return this;
    }

    @FindBy(xpath = "//button[@name ='SaveEdit']")
    WebElement accountNameFilledUp;

    public NewContactModalPage waitForPageLoaded() {
        waitForElementLocated(accountNameFilledUp, 30);
        return this;
    }

    public void createNewContact(Contact contact){
        new Input(driver, "First Name").writeTextInContactsField(contact.getFirstName());
        new Input(driver, "Last Name").writeTextInContactsField(contact.getLastName());
        new Input(driver, "Phone").writeTextInContactsField(contact.getPhone());
        new Input(driver, "Mobile").writeTextInContactsField(contact.getMobile());
        new Input(driver, "Email").writeTextInContactsField(contact.getEmail());
        new DropDown(driver, "Salutation").contactSelectOption(contact.getSalutation());
        new DropDown(driver, "Account Name").contactSelectAccount("account 1");
        new Buttons(driver).clickSaveButton(SAVE_BUTTON_XPATH_ON_NEW_CONTACT_MODAL);
        //waitForPageLoaded();
    }
}
