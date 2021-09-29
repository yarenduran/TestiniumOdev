import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{
    By searchBoxLocator = By.className("sc-4995aq-0");
    By submitButtonLocator = new By.ByCssSelector("div.sc-1yew439-1 button.qjixn8-0");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator,text);
        click(submitButtonLocator);
    }
}
