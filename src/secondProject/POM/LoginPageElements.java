package secondProject.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

    public LoginPageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[class='consent-give']")
    public WebElement acceptCookies;

    @FindBy(css = "input[placeholder='Username']")
    public WebElement userNameInputBox;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement userPasswordInputBox;

    @FindBy(css = "span[class='mat-button-wrapper']")
    public WebElement LoginButton;

    @FindBy(xpath = "//*[text()='Invalid username or password']")
    public WebElement invalidMessage;



}

