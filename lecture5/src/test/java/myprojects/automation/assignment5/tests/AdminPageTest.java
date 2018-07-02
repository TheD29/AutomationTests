package myprojects.automation.assignment5.tests;

import myprojects.automation.assignment5.BaseTest;
import myprojects.automation.assignment5.utils.Properties;
import org.testng.annotations.Test;

public class AdminPageTest extends BaseTest {
    @Test(enabled = true)
    public void checkSiteVersion() {
        driver.get(Properties.getBaseUrl());

    }
}
