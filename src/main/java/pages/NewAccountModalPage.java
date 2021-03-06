package pages;

import elements.Buttons;
import elements.DropDown;
import elements.Input;
import objects.Account;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage{

    public static final String SAVE_BUTTON_XPATH_ON_NEW_ACCOUNT_MODAL = "//button[@title = 'Save']";

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountModalPage openPage(String url) {
        driver.get(url);
        return this;
    }

    /**
     * This method  creates new account
     * @param account
     */
    public void createNewAccount(Account account) {
        new Input(driver, "Account Name").writeTextInput(account.getAccountName());
        new Input(driver, "Phone").writeTextInput(account.getPhone());
        new Input(driver, "Website").writeTextInput(account.getWebsite());
        new DropDown(driver, "Type").accountSelectOption(account.getType());
        new DropDown(driver, "Industry").accountSelectOption(account.getIndustry());
        new Input(driver, "Fax").writeTextInput(account.getFax());
        new Input(driver, "Description").writeTextArea(account.getDescription());
        new Buttons(driver).clickSaveButton(SAVE_BUTTON_XPATH_ON_NEW_ACCOUNT_MODAL);
    }
}
