package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Buttons extends BasePage {

    WebDriver driver;

    public Buttons(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSaveButton(String button) {
        driver.findElement(By.xpath(String.format(button))).click();
    }
}
