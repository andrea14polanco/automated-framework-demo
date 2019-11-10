import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class BasePage {

    private static WebDriver driver;
    public static Properties prop;


    public BasePage() throws IOException {
        //FileInputStream fis = new FileInputStream("config.properties");
        //prop = new Properties();
        //prop.load(fis);
    }


    public void starDriver(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+ "\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }




    public WebElement expandRootElement(WebElement element) {
        WebElement webElement = (WebElement) ((JavascriptExecutor)driver)
                .executeScript("return arguments[0].shadowRoot", element);
        return webElement;
    }

    public WebDriver getDriver(){
        return  driver;
    }


    public void click(WebElement webElement){
        webElement.click();
    }


}
