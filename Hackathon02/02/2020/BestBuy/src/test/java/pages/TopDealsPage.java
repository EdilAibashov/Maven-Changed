package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class TopDealsPage {
    private static WebDriver driver= Driver.getDriver();
    public TopDealsPage(){
        PageFactory.initElements(driver,this);
    }





}
