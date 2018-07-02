package myprojects.automation.assignment5;


import myprojects.automation.assignment5.utils.logging.CustomReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

/**
 * Contains main script actions that may be used in scripts.
 */
public class GeneralActions {
    private WebDriver driver;
    private WebDriverWait wait;

    private String openNewTab = Keys.chord(Keys.CONTROL, "t");






    public GeneralActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }


    public void waitForClickElementLoad(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }

    public static String generateRandomLogin() {
        Random random = new Random();
        return ("webinar" + random.nextInt(1000) + 1) + ".test@gmail.comm ";
    }

    public int checkCountOnStock(String textDigits) {
        String str = textDigits.replaceAll("[^0-9]+", " ");
        str = str.replace(" ", "");
        return Integer.parseInt(str);
    }
}
