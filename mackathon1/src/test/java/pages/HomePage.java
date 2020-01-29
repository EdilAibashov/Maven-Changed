package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class HomePage {
    private static WebDriver driver = Driver.getDriver();
    public HomePage(){
        PageFactory.initElements(driver, this);
    }



}
