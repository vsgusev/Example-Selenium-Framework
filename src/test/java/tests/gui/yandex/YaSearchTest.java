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

    @Test(description = "YA-1 The search button display on the result page")
    public void SearchTest() {

        logStep(1, "Check the search button display on the start page");
        YaStartPage yaStartPage = new YaStartPage();
        assertTrue(yaStartPage.searchBtnIsPresent());

        logStep(2, "Enter a query and click the search button");
        yaStartPage.fillSearchField(searchText);
        yaStartPage.searchBtnClick();

        logStep(3, "Check the search button display on the results page");
        YaResultPage yaResultPage = new YaResultPage();
        assertTrue(yaResultPage.searchBtnIsPresent());

    }


}
