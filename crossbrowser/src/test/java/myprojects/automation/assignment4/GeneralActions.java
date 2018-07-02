package myprojects.automation.assignment4;


import myprojects.automation.assignment4.model.ProductData;
import myprojects.automation.assignment4.utils.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

/**
 * Contains main script actions that may be used in scripts.
 */
public class GeneralActions {
    private WebDriver driver;
    private WebDriverWait wait;
    /*LogIn variables*/
    private By uLogin = By.name("email");
    private By uPassword = By.name("passwd");
    private By submitButton = By.name("submitLogin");
    /*Variebles and Parameters of create category*/
    private String successfulMessage = "Настройки обновлены.";
    private By categoryItem = By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a");
    private By addNewCategory = By.xpath("//*[@id=\"page-header-desc-configuration-add\"]/span");
    private By productNameItem = By.id("form_step1_name_1");
    private By saveButton = By.xpath("//*[@class='product-footer']/div[2]/div/button/span");
    private By fadeMessage = By.className("growl-message");
    private By produceCountTab = By.id("tab_step3");
    private By produceCount = By.id("form_step3_qty_0");
    private By producePricetab = By.id("tab_step2");
    private By producePrice = By.id("form_step2_price");
    private By swichButton = By.className("switch-input");
    boolean isGetName = false;
    private String produceName;
    private String price;
    private int count;
    /*Checking product creation*/
    private By allProduceLink = By.xpath("//*[@id=\"content\"]/section/a");
    private By produceList = By.xpath("//*[contains(text(),'Показано')]");
    private By produceInStoke = By.xpath("//*[@class='product-quantities']/span");
    private boolean isGetPrice;
    private boolean isGetCount;


    public GeneralActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void start(){
        driver.get(Properties.getBaseUrl());
    }
}