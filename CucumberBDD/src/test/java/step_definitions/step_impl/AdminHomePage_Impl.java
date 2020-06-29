package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.AdminHomePage;
import testData.AdminInfo;
import util.Driver;
import util.SeleniumUtils;

public class AdminHomePage_Impl {
    private static WebDriver driver = Driver.getDriver();
    AdminHomePage adminHomePage = new AdminHomePage();

    public static void login(){
        AdminInfo adminInfo = new AdminInfo();
        AdminHomePage adminHomePage = new AdminHomePage();
        SeleniumUtils.sleep(2000);
        SeleniumUtils.sendKeys(adminHomePage.emailField,adminInfo.getLogin());
        SeleniumUtils.sendKeys(adminHomePage.passwordField,adminInfo.getPasswrd());
        SeleniumUtils.click(adminHomePage.login_Btn);
    }

    public void navigateToPage(String pageName){
        switch (pageName.toLowerCase()){
            case "coupons":
                SeleniumUtils.click(adminHomePage.coupons_Btn);
                break;
        }
    }

}
