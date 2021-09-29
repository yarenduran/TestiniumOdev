import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    SearchBox searchBox;
    By cartCountLocator = By.className("gekhq4-7 MOSbm");
    By cartContainerLocator = By.className("gekhq4-4 egoSnI");
    By acceptCookiesLocator = By.className("tyj39b-5");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){

        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount()>0;
    }

    public void goToCart() {
        click(cartContainerLocator);

    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
