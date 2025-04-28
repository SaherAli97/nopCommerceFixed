package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".ico-register")
    WebElement registerLink ;
    public void openRegistrationPage () {
        clickBtn(registerLink);
    }

    @FindBy (className = "ico-login")
    WebElement loginLink;
    public void openLoginPage () {
        clickBtn(loginLink);
    }

    @FindBy (className = "ico-logout")
    public WebElement logoutLink;
    public void logout () {
        clickBtn(logoutLink);
    }
    @FindBy (id = "small-searchterms")
    public WebElement searchBox;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchBtn;
    public void search () {
        clickBtn(searchBtn);
    }

    @FindBy(xpath = "//span[@class='wishlist-label']")
    public WebElement wishlistBtn;
    public void openWishlist () { clickBtn(wishlistBtn);}

    @FindBy(xpath = "//span[@class='cart-label']")
    public WebElement cartBtn;
    public void openCart () {clickBtn(cartBtn);}

    @FindBy (css = ".wishlist-qty")
    public WebElement wishListQuantity;

    @FindBy (css = ".cart-qty")
    public WebElement cartQuantity;



}
