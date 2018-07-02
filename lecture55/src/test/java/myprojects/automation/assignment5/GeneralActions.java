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

       private WebElement random;

    public GeneralActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }
//    public void openRandomProduct() {
//        // TODO implement logic to open random product before purchase
//        driver.findElement(allProduceLink).click();
//        List<WebElement> links = driver.findElements(someProduce);
//        random = links.get(new Random().nextInt(links.size()));
//        random.click();
//        getOpenedProductInfo();
//        waitForClickElementLoad(cartBtn);
//        waitForClickElementLoad(goToCart);
//        //Check produce count in the cart
//        List<WebElement> cartProduceList = driver.findElements(this.cartProduceList);
//        driver.findElement(makeOrder).click();
//
//    }



}
