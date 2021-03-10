package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static webdriver.BaseTest.getDriver;

public abstract class BasePage {

    WebDriver driver;

    public BasePage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

}
