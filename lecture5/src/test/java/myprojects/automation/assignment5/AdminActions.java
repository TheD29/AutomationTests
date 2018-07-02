package myprojects.automation.assignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminActions {
    WebDriver driver;
    WebDriverWait wait;

    public AdminActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }
}
