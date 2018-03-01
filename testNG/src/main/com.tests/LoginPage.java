import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dima on 26.01.2018.
 */
public class LoginPage {
    WebDriver webDriver;
    private By loginField = By.xpath("//*[@id=\"login_field\"]");
    private By passwordField = By.xpath("//*[@id=\"password\"]");
    private By singInLink = By.xpath("/html/body/div[1]/header/div/div[2]/div/span/div/a[1]");
    private By signInButton = By.xpath("//*[@id=\"login\"]/form/div[4]/input[3]");
    private By checkHeader = By.xpath("/html/body/div[3]/div[1]/div/form/div[2]/h1");
    private By checkError = By.xpath("/html/body/div[3]/div[1]/div/form/div[3]/div/div/button");
    private By createAnnAccount = By.xpath("/html/body/div[3]/div[1]/div/p/a");
    private By signOut = By.xpath("//*[@id=\"user-links\"]/li[3]/details/ul/li[9]/form/button");
    private By dropList = By.xpath("//*[@id=\"user-links\"]/li[3]/details/summary/img");
    private By headerText = By.xpath("//*[@id=\"login\"]/form/div[2]/h1");
    private By errorMessage = By.xpath("//*[@id=\"js-flash-container\"]/div/div");

    public String getErrorMessage() {
        return webDriver.findElement(errorMessage).getText();
    }

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPage userName(String username) {
        webDriver.findElement(loginField).sendKeys(username);
        return this;
    }

    public LoginPage getDropList() {
        webDriver.findElement(dropList).click();
        return this;
    }


    public LoginPage passField(String userpassword) {
        webDriver.findElement(passwordField).sendKeys(userpassword);
        return this;
    }

    public LoginPage signOut() {
        webDriver.findElement(signOut).click();
        return this;
    }

    public LoginPage signIn(String username, String password) {
        this.userName(username);
        this.passField(password);
        webDriver.findElement(signInButton).click();
        this.getDropList();
        this.signOut();
        return new LoginPage(webDriver);
    }

    public LoginPage signInIsEmpty(String username, String password) {
        this.userName(username);
        this.passField(password);
        webDriver.findElement(signInButton).click();
        return new LoginPage(webDriver);
    }

    public String getHeader() {
        return webDriver.findElement(checkHeader).getText();
    }

    public String getError() {
        return webDriver.findElement(checkError).getText();
    }


}
