import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;


public class BaseTest extends BasePage{

    @BeforeSuite
    public void beforeTest()
    {
        starDriver();
    }

    @AfterSuite
    public void tearDown(){
        if(getDriver() != null){
            getDriver().close();
            getDriver().quit();
        }
    }



}
