package myprojects.automation.assignment4.tests;

import myprojects.automation.assignment4.BaseTest;
import myprojects.automation.assignment4.MyBaseTest;
import myprojects.automation.assignment4.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URISyntaxException;
import java.nio.file.Paths;

public class MyTest extends MyBaseTest {
    public static void main(String[] args) {
        try {
            MyBaseTest.getDriver("firefox");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        WebDriver driver = new FirefoxDriver();

        driver.get(Properties.getBaseUrl());
    }

}
