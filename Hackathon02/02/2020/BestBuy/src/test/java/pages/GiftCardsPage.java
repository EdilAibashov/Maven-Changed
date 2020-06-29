package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class GiftCardsPage {
    private static WebDriver driver = Driver.getDriver();
    public GiftCardsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='btn btn-secondary btn-block mt-20 btn-action btn-lg loader' and text()='Book Now']")
    public WebElement bookNow_Btn;

    @FindBy(xpath = "//label[@class='pure-material-textfield-outlined float-none coupon-label']//input[contains(@placeholder,'')]")
    public  WebElement couponCodeTextArea;

    @FindBy(xpath = "//button[@class='btn btn-danger applycoupon btn-block']")
    public WebElement applyCoupon_Btn;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement couponAppliedDisplayedText;

    @FindBy(xpath = "//button[@aria-label='dismiss cookie message']")
    public WebElement cookies_Btn;

    @FindBy(xpath = "//tr[5]/td[6]")
    public WebElement book_Btn;

    @FindBy(name = "firstname")
    public WebElement first_Name_Field;

    @FindBy(name = "email")
    public WebElement email_Field;

    @FindBy(xpath = "//*[@id=\"send_enquery\"]/div/div[2]/div[2]/div[1]/div/input")
    public WebElement phone_Field;

    @FindBy(xpath = "//*[@id=\"send_enquery\"]/div/div[2]/div[2]/div[2]/div/input")
    public WebElement address_Field;

    @FindBy(xpath = "//button[@id='ClickMyButton']")
    public WebElement package_Book_Now_Btn;


}
