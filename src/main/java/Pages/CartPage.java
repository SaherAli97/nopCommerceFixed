package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends PageBase{
    public CartPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "quantity-up-137")
    public WebElement upQuantityBtn;
    public void addQuantity () {
        clickBtn(upQuantityBtn);
    }

    @FindBy (id = "quantity-down-137" )
    public WebElement downQuantityBtn;
    public void removeQuantity () {
        clickBtn(downQuantityBtn);
    }

    @FindBy (css = "button[name='updatecart'][type='button']")
    public WebElement removeItemBtn;
    public void removeItem () {
        clickBtn(removeItemBtn);
    }

    @FindBy (xpath = "//button[normalize-space()='Continue shopping']")
    public WebElement continueShoppingBtn;
    public void continueShopping () {
        clickBtn(continueShoppingBtn);
    }

    @FindBy (id = "open-estimate-shipping-popup")
    public WebElement estimateShippingBtn;
    public void estimateShipping () {
        clickBtn(estimateShippingBtn);
    }

    @FindBy (id="discountcouponcode")
    public WebElement discountCodeField;
    public void discountCode(String discountCodeInput) {
        setTextElement(discountCodeField,discountCodeInput);
    }

    @FindBy (id = "applydiscountcouponcode")
    public WebElement discountCodeBtn;
    public void applyDiscountCode () {
        clickBtn(discountCodeBtn);
    }



    @FindBy (id = "giftcardcouponcode")
    public WebElement giftCardField;
    public void giftCardCode (String giftCardInput) {
        setTextElement(giftCardField, giftCardInput);
    }


    @FindBy (id = "applygiftcardcouponcode")
    public WebElement giftCardBtn;
    public void applyGiftCardCode () {
        clickBtn(giftCardBtn);
    }

    @FindBy (id = "termsofservice")
    public WebElement termsCheckBtn;
    public void agreeTermOfService () {
        clickBtn(termsCheckBtn);
    }

    @FindBy (id="checkout")
    public WebElement checkoutBtn;
    public void checkOut () {
        clickBtn(checkoutBtn);
    }



}
