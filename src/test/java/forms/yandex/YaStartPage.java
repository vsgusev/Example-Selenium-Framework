package forms.yandex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.BasePage;

public class YaStartPage extends BasePage {

    public YaStartPage() {
        super();
    }

    @FindBy(xpath = "//input[@class='input__control input__input mini-suggest__input']")
    private WebElement searchTb;

    @FindBy(xpath = "//button[text()='Найти']")
    private WebElement searchBtn;

    public void fillSearchField(String text) {
        searchTb.click();
        searchTb.sendKeys(text);
    }

    public void searchBtnClick() {
        searchBtn.click();
    }

}
