import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AddProducttoCartTest extends BaseTest {

    //LoginPage loginPage;
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    /*
    @Order(1)
    public void login_page(){
        loginPage= new LoginPage(driver);
        try {
            Assertions.assertTrue(loginPage.isOnloginPage(),
                    "Not the product detail page!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }*/

    @Order(2)
    public void search_product(){
           homePage = new HomePage(driver);
           productsPage = new ProductsPage(driver);
           homePage.searchBox().search("Bilgisayar");
           Assertions.assertTrue(productsPage.isOnProductPage(),
                   "Not the product page!");
    }

    @Test
    @Order(3)
    public void click_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not the product detail page!");

    }

    @Test
    @Order(4)
    public void add_product_to_cart(){
        productDetailPage.AddToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),
                "Product count didn't increase! ");

    }

    @Test
    @Order(5)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkProductAdd(),
                "Product wasn't added to cart!");


    }
}
