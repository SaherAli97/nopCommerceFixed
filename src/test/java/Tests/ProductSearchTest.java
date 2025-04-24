package Tests;

import Pages.HomePage;
import Pages.ProductSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearchTest extends TestBase{
    HomePage homeObject;
    ProductSearchPage productSearchObject;


    @Test (priority = 1)
    public void searchForItem () {
        homeObject = new HomePage(driver);
        productSearchObject = new ProductSearchPage(driver);
        productSearchObject.searchInput("Iphone 16");
        Assert.assertTrue(productSearchObject.searchAssertion.isDisplayed());
        System.out.println("Assertion Passed: Search assertion is displayed.");
    }

    @Test (priority = 2)
    public void AddToWishList (){
        homeObject = new HomePage(driver);
        productSearchObject = new ProductSearchPage(driver);
        productSearchObject.addToWishList();
        Assert.assertNotEquals(homeObject.wishListQuantity,"0");
        System.out.println("Assertion Passed: The item is added to wishlist.");
    }

    @Test (priority = 3)
    public void AddToCart () throws InterruptedException {
        homeObject = new HomePage(driver);
        productSearchObject = new ProductSearchPage(driver);
        productSearchObject.addToCart();
        Assert.assertNotEquals(homeObject.cartQuantity,"0");
        System.out.println("Assertion Passed: The item is added to cart.");
        Thread.sleep(5000);
    }



}
