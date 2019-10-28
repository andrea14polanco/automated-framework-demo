import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    private WebDriver driver;

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
