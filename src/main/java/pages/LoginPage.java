package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameInput;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//*[@id='Login']")
    public WebElement loginButton;

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    /**
     * This method performs authorization on the site
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
