package forms.yandex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.BasePage;

public class YaResultPage extends BasePage {

    public YaResultPage() {
        super();
    }

    @FindBy(xpath = "//button/div[text()='Найти']")
    private WebElement searchBtn;

    public boolean searchBtnIsPresent() {
        return searchBtn.isDisplayed();
    }


}
