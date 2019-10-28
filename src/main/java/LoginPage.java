import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {


   public LoginPage(){
       getDriver().navigate().to("https://gbhqatest.firebaseapp.com");
   }

    public void clickLogInButton(){
        WebElement root = getDriver().findElement(By.cssSelector("note-app"));
        WebElement shadowRoot = expandRootElement(root);
        WebElement root2 = shadowRoot.findElement(By.cssSelector("na-login"));
        WebElement shadowRoot2 = expandRootElement(root2);
        click(shadowRoot2.findElement(By.cssSelector("paper-button[role=\"button\"]")));
    }
}
