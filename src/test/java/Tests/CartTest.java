package Tests;

import Pages.CartPage;
import Pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CartTest extends TestBase{
    HomePage homeObject ;
    CartPage cartObject ;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Test
    public void addOneQuantity (){
        homeObject = new HomePage(driver);
        cartObject = new CartPage(driver);
        wait.until(ExpectedConditions.visibilityOf(cartObject.upQuantityBtn));
        cartObject.addQuantity();
    }

    @Test
    public void removeOneQuantity () {
        homeObject = new HomePage(driver);
        cartObject = new CartPage(driver);
        wait.until(ExpectedConditions.visibilityOf(cartObject.downQuantityBtn));
        cartObject.removeQuantity();
    }

    @Test
    public void addDiscountCode () {
        homeObject = new HomePage(driver);
        cartObject = new CartPage(driver);
        cartObject.discountCode("discount123");
        cartObject.applyDiscountCode();
    }

    @Test
    public void addGiftCardCode () {
        homeObject = new HomePage(driver);
        cartObject = new CartPage(driver);
        cartObject.giftCardCode("gift123");
        cartObject.applyGiftCardCode();
    }

    @Test
    public void removeItem () {
        homeObject = new HomePage(driver);
        cartObject = new CartPage(driver);
        wait.until(ExpectedConditions.visibilityOf(cartObject.removeItemBtn));
        cartObject.removeItem();
    }

    @Test
    public void agreeTerms () {
        homeObject = new HomePage(driver);
        cartObject = new CartPage(driver);
        cartObject.agreeTermOfService();
    }

    @Test
    public void checkout () {
        homeObject = new HomePage(driver);
        cartObject = new CartPage(driver);
        cartObject.checkOut();
    }








}
