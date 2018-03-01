import checkmethod.checkMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class LoginTest extends SetUp implements checkMethods {

    //    @Override
//    public void setUp() {
//        super.setUp();
//    }

//    public void IsEmptyFields() {
//        LoginPage loginPage = mainPage.clickSignIn();
//        loginPage.signInIsEmpty("", "");
//        String erMessage = loginPage.getErrorMessage();
//        Assert.assertEquals("Incorrect username or password.", erMessage);
//        System.out.println(erMessage);
//    }

    public void signIn() {
        LoginPage loginPage = mainPage.clickSignIn();
        String heandling = loginPage.getHeader();
        Assert.assertEquals("Sign in to GitHub", heandling);
        loginPage.signIn("dmberezovskyi@gmail.com", "oxanadimaVG1929");
    }




    public void isEmptyFields() {
        LoginPage loginPage = mainPage.clickSignIn();
        loginPage.signInIsEmpty("", "");
        String erMessage = loginPage.getErrorMessage();
        Assert.assertEquals("Incorrect username or password.", erMessage);
        System.out.println(erMessage);
    }

//    @Override
//    public void close() {
//        super.close();
//    }
}
