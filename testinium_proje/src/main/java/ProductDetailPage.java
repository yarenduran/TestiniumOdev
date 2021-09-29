import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    By addtoCartButtonLocator = By.id("add-to-basket");

    public ProductDetailPage(WebDriver driver) {

        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addtoCartButtonLocator);
    }

    public void AddToCart() {
        click(addtoCartButtonLocator);
    }
}
