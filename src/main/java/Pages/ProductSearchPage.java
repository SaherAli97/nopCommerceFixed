package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPage extends PageBase{
    HomePage homeObject;
    public ProductSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        homeObject = new HomePage(driver);

    }

    @FindBy (css = "div[class='page-title'] h1")
    public WebElement searchAssertion;

    @FindBy (css = "button[title='Add to wishlist']")
    WebElement addWishlistBtn;

    @FindBy (css = ".button-2.product-box-add-to-cart-button")
    WebElement addCartBtn;

    @FindBy (css = ".bar-notification.success")
    public WebElement confirmMessage;


    public void searchInput (String searchText) {

        setTextElement(homeObject.searchBox, searchText);
        homeObject.search();
}

    public void addToWishList () {
        clickBtn(addWishlistBtn);
}

    public void addToCart () {
        clickBtn(addCartBtn);
    }






}
