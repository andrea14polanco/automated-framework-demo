import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginPage extends BasePage {

    private WebElement newRoot;
    private By LoginButton = By.cssSelector("paper-button[role=\"button\"]");
    private By AddButton = By.id("icon");




   public LoginPage() throws IOException {
       super();
       //URL for navigating to firebaseapp web page.
       getDriver().navigate().to("https://gbhqatest.firebaseapp.com");
       //Due to our element is nested, I need to access to the first child
       WebElement root = getDriver().findElement(By.cssSelector("note-app"));

       //Pointing to the Root in order to access to the new root
       WebElement shadowRoot = expandRootElement(root);
       //Finding the  na-login element
       WebElement root2 = shadowRoot.findElement(By.cssSelector("na-login"));
      newRoot = expandRootElement(root2);
   }



    public void clickLogInButton(){
        //Clicking the login button.
        click(newRoot.findElement(LoginButton));
    }
    public void clickAddNote(){
            click(newRoot.findElement(AddButton));
    }

}
