import org.testng.annotations.Test;

public class DemoTests extends BaseTest {

    @Test(testName = "loginTest")
    public void logInTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.clickLogInButton();

    }
}
