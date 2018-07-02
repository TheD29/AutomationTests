package myprojects.automation.assignment4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URISyntaxException;
import java.nio.file.Paths;

public class MyBaseTest {
    static String resourceName = "/geckodriver.exe";


    public static WebDriver getDriver(String browser) throws URISyntaxException {
        switch (browser) {
            case "chrome":
            case "firefox":
            default:
                System.setProperty("webdriver.gecko.driver",
                        Paths.get(BaseTest.class.getResource(resourceName).toURI()).toFile().getPath());
                return new FirefoxDriver();

        }
    }


}

