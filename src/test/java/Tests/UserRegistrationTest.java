package Tests;

import Pages.HomePage;
import Pages.UserRegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase{
    HomePage homeObject;
    UserRegistrationPage registerObject;

    @Test (priority = 1)
    public void UserCanRegisterSuccessfully () {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();

        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration("Saherrr","Ali","test1212@gmail.com","12345678");
        Assert.assertTrue(registerObject.successMessage.getText().contains("completed"));
    }





}
