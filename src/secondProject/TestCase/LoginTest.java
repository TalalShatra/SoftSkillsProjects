package secondProject.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import secondProject.POM.HomePageElements;
import secondProject.POM.LoginPageElements;
import secondProject.Units.BaseDriver;

public class LoginTest extends BaseDriver {
    LoginPageElements loginpageElements;
    HomePageElements homePageElements;
    String welcomeMessage = "Welcome, Talal Shatra !";
    String invalidAccountMessage = "Invalid username or password";
    @Test
    public void positiveLoginTest(){

        loginpageElements = new LoginPageElements(driver);
        homePageElements = new HomePageElements(driver);

        loginpageElements.acceptCookies.click();

        loginpageElements.userNameInputBox.sendKeys("");

        loginpageElements.userPasswordInputBox.sendKeys("");

        loginpageElements.LoginButton.click();

        Assert.assertEquals(homePageElements.homePageWelcome.getText(), welcomeMessage);
    }
    @Test
    public void negativeLoginTest() throws InterruptedException {

        loginpageElements = new LoginPageElements(driver);

        loginpageElements.acceptCookies.click();

        loginpageElements.userNameInputBox.sendKeys("abc");

        loginpageElements.userPasswordInputBox.sendKeys("123");

        loginpageElements.LoginButton.click();

        Assert.assertEquals(loginpageElements.invalidMessage.getText(), invalidAccountMessage);



    }

}
