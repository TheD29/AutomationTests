package myprojects.automation.assignment5.tests;

import myprojects.automation.assignment5.BaseTest;
import myprojects.automation.assignment5.utils.Properties;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdminPages extends BaseTest {
    @DataProvider(name = "testParams")
    public static Object[][] params() {
        return new Object[][]{{"dmberezovskyi@gmail.com", "Admin179"}};
    }

    @Test(enabled = true)
    public void checkSiteVersion() {
        driver.get(Properties.getBaseAdminUrl());

    }


    @Test(dataProvider = "testParams", dependsOnMethods = "checkSiteVersion")
    public void createNewOrder(String login, String password) {


    }
}

