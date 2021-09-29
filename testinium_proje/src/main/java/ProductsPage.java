import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class ProductsPage extends BasePage{
    By shippingOptionLocator = By.className("sc-8dqqqj-4");
    By productNameLocator = new By.ByCssSelector("header.sc-1n49x8z-2 .sc-1ku3a4v-0");


    public ProductsPage(WebDriver driver) {

        super(driver);
    }

    public boolean isOnProductPage() {

        return isDisplayed(shippingOptionLocator);
    }

    public void selectProduct(int i) {

        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){

        return findAll(productNameLocator);
    }
}
