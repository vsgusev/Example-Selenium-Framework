package tests.gui.yandex;

import forms.yandex.YaResultPage;
import forms.yandex.YaStartPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webdriver.BaseTest;

import static org.testng.Assert.assertTrue;

public class YaSearchTest extends BaseTest {

    private String searchText;

    @BeforeTest
    @Parameters({"searchText"})
    public void readParams(String searchText) {
        this.searchText = searchText;
    }

    @Test(description = "YA-1 Проверка поиска")
    public void SearchTest() {

        YaStartPage yaStartPage = new YaStartPage();
        yaStartPage.fillSearchField(searchText);
        yaStartPage.searchBtnClick();
        YaResultPage yaResultPage = new YaResultPage();
        assertTrue(yaResultPage.searchBtnIsPresent());

    }


}
