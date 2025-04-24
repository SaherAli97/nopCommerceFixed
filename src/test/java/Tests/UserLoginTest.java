package Tests;

import Pages.HomePage;
import Pages.ProductSearchPage;
import Pages.UserLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLoginTest extends TestBase{
    HomePage homeObject;
    UserLoginPage loginObject;

    @Test
    public void userLoginSuccessfully () {
        homeObject = new HomePage(driver);
        homeObject.openLoginPage();


        loginObject = new UserLoginPage(driver);
        loginObject.UserLogin("test123@test.com","123123123");
        Assert.assertTrue(homeObject.logoutLink.isDisplayed());
        



    }

}
