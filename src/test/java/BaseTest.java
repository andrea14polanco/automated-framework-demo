import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

import java.io.IOException;


public class BaseTest extends BasePage{

    public BaseTest() throws IOException {
    }

    @BeforeSuite
    public void beforeTest()
    {
        starDriver();
    }

    @AfterSuite
    public void tearDown(){
        if(getDriver() != null){
            //getDriver().close();
            //getDriver().quit();
        }
    }



}
