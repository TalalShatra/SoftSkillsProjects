package secondProject.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePageElements {
    public HomePageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(), 'Welcome, Talal Shatra')]")
    public WebElement homePageWelcome;


}
