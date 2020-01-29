package step_definitions.step_impl;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.PhpPage;
import util.Driver;
import util.SeleniumUtils;

public class PhpPage_impl {

    private static WebDriver driver = Driver.getDriver();
    PhpPage phpPage = new PhpPage();

    public static void PhpOpen(){
        PhpPage phpPage = new PhpPage();
        SeleniumUtils.click(phpPage.Web_Btn);
        SeleniumUtils.sleep(2000);
    }
    public static void getTitle(){
        Assert.assertEquals(driver.getTitle(), "PHP Tutorial for Beginners: Learn in 7 Days");
    }

}
