package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HamePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HamePage homePage;
    EmployeeDashboard employeeDashboard;
    @BeforeMethod
    public void setUp(){
        initializer();
        homePage = new HamePage();
        employeeDashboard = new EmployeeDashboard();
    }

    @Test
    public void verifyHomeTitle(){
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @Test
    public void testLogIn_Btn(){
        SeleniumUtils.click(homePage.logIn_Btn);
        String expectedTitle = "Dashboard";
        Assert.assertEquals(SeleniumUtils.getText(employeeDashboard.dashboardTitle),expectedTitle);
    }
}
