import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {super (driver);}
    String loginUrl = "https://www.gittigidiyor.com/";


    public boolean isOnloginPage()throws InterruptedException {
        driver.get(loginUrl);
        driver.findElement(By.id("L-UserNameField")).sendKeys("yarenduran907964");
        driver.findElement(By.id("L-PasswordField")).sendKeys("123456t");
        driver.findElement(By.id("gg-login-enter")).click();
        return true;
    }
}
