package tests.gui.yandex;

import forms.yandex.YaStartPage;
import org.testng.annotations.Test;
import webdriver.BaseTest;

public class YaSearchTest extends BaseTest {

    @Test
    public void SearchTest() {

        YaStartPage yaStartPage = new YaStartPage();
        yaStartPage.fillSearchField("someText");

    }


}
