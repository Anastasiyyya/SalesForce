package pages;

import elements.Buttons;
import elements.Input;
import objects.Contact;
import org.openqa.selenium.WebDriver;
import elements.DropDown;


public class NewContactModalPage extends BasePage {

    public static final String SAVE_BUTTON_XPATH_ON_NEW_CONTACT_MODAL = "//button[@name ='SaveEdit']";

    public NewContactModalPage(WebDriver driver) {
        super(driver);
    }

    public NewContactModalPage openPage(String url) {
        driver.get(url);
        return this;
    }

    /**
     * This method waits for the page to load.
     * @param driver
     */
    public void waitForPageLoading(WebDriver driver) {
        waitForPageLoad(driver);
    }

    /**
     * This method creates new Contact.We use "Thread.sleep" because the browser close window appears
     * and interrupts the test execution
     * @param contact
     */
    public void createNewContact(Contact contact) {
        new Input(driver, "First Name").writeTextInContactsField(contact.getFirstName());
        new Input(driver, "Last Name").writeTextInContactsField(contact.getLastName());
        new Input(driver, "Phone").writeTextInContactsField(contact.getPhone());
        new Input(driver, "Mobile").writeTextInContactsField(contact.getMobile());
        new Input(driver, "Email").writeTextInContactsField(contact.getEmail());
        new DropDown(driver, "Salutation").contactSelectOption(contact.getSalutation());
        new DropDown(driver, "Account Name").contactSelectAccount("account 1");
        new Buttons(driver).clickSaveButton(SAVE_BUTTON_XPATH_ON_NEW_CONTACT_MODAL);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForPageLoading(driver);
    }
}
