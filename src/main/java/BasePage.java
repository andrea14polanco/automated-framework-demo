import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait  wait;

    public BasePage(WebDriver webDriver){
        driver = webDriver;

        wait = new WebDriverWait(driver, 15);

    }
}
