import org.testng.annotations.Test;

import java.io.IOException;

public class DemoTests extends BaseTest {

    public DemoTests() throws IOException {
    }

    @Test(testName = "loginTest")
    public void logInTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.clickLogInButton();
        loginPage.clickAddNote();

    }
}
