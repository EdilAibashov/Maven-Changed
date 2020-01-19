package pages;

import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamePage extends TestBase {
    public HamePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "btnLogin")
    public WebElement logIn_Btn;

}
