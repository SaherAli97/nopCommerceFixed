package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    public PageBase() {
    }

    protected static void clickBtn (WebElement button) {
        button.click();
    }

    protected static void setTextElement (WebElement textElement, String value){
        textElement.sendKeys(value);
    }
}
