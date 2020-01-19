package tests;

import base.EmployeeDashboardPage;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage homePage;
    EmployeeDashboardPage employeeDashboardPage;
    @BeforeMethod
    public void setUp(){
        initializer();
        homePage = new HomePage();
        employeeDashboardPage = new EmployeeDashboardPage();
    }

    @Test
    public void verifyHomeTitle(){
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @Test
    public void testLogIn_Btn(){
        SeleniumUtils.click(homePage.logIn_Btn);
        String expectedTitle = "Dashboard";
        Assert.assertEquals(SeleniumUtils.getText(employeeDashboardPage.dashboardTitle),expectedTitle);
    }
}
