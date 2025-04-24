package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends PageBase{

    public UserLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "Email")
    WebElement loginEmailBox;

    @FindBy (id = "Password")
    WebElement loginPasswordBox;

    @FindBy (css= "button[class='button-1 login-button']")
    WebElement loginBtn;

    public void UserLogin (String loginEmail , String loginPassword) {
        setTextElement(loginEmailBox,loginEmail);
        setTextElement(loginPasswordBox,loginPassword);

        clickBtn(loginBtn);
    }



}
