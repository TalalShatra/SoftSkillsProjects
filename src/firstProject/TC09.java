package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TC09 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Talal\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://campus.techno.study/");

        WebElement acceptCookies = driver.findElement(By.cssSelector("button[class='consent-give']"));
        acceptCookies.click();

        WebElement userNameInput = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        userNameInput.sendKeys("talalshatra@yahoo.com");

        WebElement passwordInput = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        passwordInput.sendKeys("laniashatra2010");

        WebElement loginButton = driver.findElement(By.cssSelector("span[class='mat-button-wrapper']"));
        loginButton.submit();

        WebElement hamburgerIcon =driver.findElement(By.cssSelector("button[class='mat-focus-indicator mat-menu-trigger mat-button-wrapper mat-button mat-button-base']"));
        hamburgerIcon.click();

        WebElement videoConference = driver.findElement(By.xpath("//span[text()='Video Conference']"));
        Actions action = new Actions(driver);
        action.moveToElement(videoConference).perform();

        WebElement recordedVideos =driver.findElement(By.xpath("//span[text()='Video Meetings']"));
        recordedVideos.click();


    }
}
