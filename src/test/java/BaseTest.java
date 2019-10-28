import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown(){
        if(driver != null){
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return  driver;
    }

}
