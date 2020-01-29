package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class PhpPage {
    private static WebDriver driver = Driver.getDriver();
    public PhpPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@title='PHP']")
    public WebElement Web_Btn;
}
