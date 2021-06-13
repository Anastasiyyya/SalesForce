import constants.IConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest implements ITestConstants, IConstants {
    WebDriver driver;
    HomePage homePage;
    AccountListPage accountListPage;
    NewAccountModalPage newAccountModalPage;
    NewContactModalPage newContactModalPage;
    LoginPage loginPage;
    Account account;
    AccountPage accountPage;
    ContactListPage contactListPage;

    public void initPages() {
        homePage =  new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        newAccountModalPage = new NewAccountModalPage(driver);
        loginPage =  new LoginPage(driver);
        account = new Account();
        accountPage =  new AccountPage(driver);
        newContactModalPage = new NewContactModalPage(driver);
        contactListPage =  new ContactListPage(driver);
    }

    @BeforeMethod
    public void initTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        PageFactory.initElements(driver,this);
        initPages();
    }

    /*@AfterMethod
    public void endTest() {
        driver.quit();
    }*/
}

