package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase{


    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (id = "gender-male")
    WebElement genderRadioBtn;

    @FindBy (id = "FirstName")
    WebElement firstNameBox;

    @FindBy (id="LastName")
    WebElement lastNameBox;

    @FindBy (id = "Email")
    WebElement emailBox;

    @FindBy (id="Password")
    WebElement passwordBox;

    @FindBy (id="ConfirmPassword")
    WebElement confirmPasswordBox;

    @FindBy (id="register-button")
    WebElement registerBtn;

    @FindBy (className = "result")
    public WebElement successMessage;

    public void userRegistration (String firstName, String lastName, String email, String password) {
        clickBtn(registerBtn);
        clickBtn(genderRadioBtn);
        setTextElement(firstNameBox,firstName);
        setTextElement(lastNameBox,lastName);
        setTextElement(emailBox,email);
        setTextElement(passwordBox,password);
        setTextElement(confirmPasswordBox,password);
        clickBtn(registerBtn);
    }
}

