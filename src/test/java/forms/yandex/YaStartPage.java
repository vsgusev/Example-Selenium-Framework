package forms.yandex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.BasePage;

public class YaStartPage extends BasePage {

    @FindBy(xpath = "//input[@class='input__control input__input mini-suggest__input']")
    private WebElement searchFieldTb;

    public YaStartPage() {
        super();
    }

    public void fillSearchField(String text) {
        searchFieldTb.click();
        searchFieldTb.sendKeys(text);
    }

}
