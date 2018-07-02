package myprojects.automation.assignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminActions {
    WebDriverWait wait;
    WebDriver driver;

    public AdminActions(WebDriver driver) {
        wait = new WebDriverWait(driver, 30);
        this.driver = driver;
    }
}
