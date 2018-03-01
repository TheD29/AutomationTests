import com.sun.istack.internal.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Dima on 21.02.2018.
 */
public class Main {
    @NotNull
    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "c:\\automation\\QADriver\\chromedriver.exe");
        return new ChromeDriver();
    }

    public static void main(String[] args) {
        WebDriver webDriver = getChromeDriver();

    }

}
