import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dima on 19.02.2018.
 */
public class MainPage {
    WebDriver driver;
    private By loginName = By.xpath("//*[@id=\"user[login]\"]");
    private By emailField = By.xpath("//*[@id=\"user[email]\"]");
    private By passwordField = By.xpath("//*[@id=\"user[password]\"]");
    private By signIn = By.xpath("/html/body/div[1]/header/div/div[2]/div/span/div/a[1]");
    private By signUp = By.xpath("/html/body/div[1]/header/div/div[2]/div/span/div/a[2]");
    private By creAcc = By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/form/button");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPage clickSignIn() {
        driver.findElement(signIn).click();
        return new LoginPage(driver);
    }

    public SignUp clickSignUp() {
        driver.findElement(signUp).click();
        return new SignUp(driver);
    }

    public SignUp clickCreateAcc() {
        driver.findElement(creAcc).click();
        return new SignUp(driver);
    }


    public MainPage userName(String username) {
        driver.findElement(loginName).sendKeys(username);
        return this;
    }

    public MainPage userPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public MainPage userEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public MainPage createAccount(String uName, String uPass, String uEmail) {
        this.userPassword(uPass);
        this.userEmail(uEmail);
        this.userName(uName);
        return new MainPage(driver);
    }
}
