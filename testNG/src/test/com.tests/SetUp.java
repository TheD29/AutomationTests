import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dima on 19.02.2018.
 */
public class SetUp {
    WebDriver webDriver;
    MainPage mainPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\automation\\selenium\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("https://github.com/");
        mainPage = new MainPage(webDriver);
//        WebDriverWait wait = new WebDriverWait(driver,5);
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));

    }

    @AfterTest
    public void close() {
        webDriver.close();
    }

}
