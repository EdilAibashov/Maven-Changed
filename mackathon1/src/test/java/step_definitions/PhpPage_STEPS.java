package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import step_definitions.step_impl.HomePage_impl;
import step_definitions.step_impl.PhpPage_impl;
import util.ConfigReader;
import util.Driver;

public class PhpPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    HomePage_impl homePage_impl = new HomePage_impl();
    @Then("User opens php page")
    public void user_opens_php_page() {
        PhpPage_impl.PhpOpen();
    }

    @And("User verify title of PHP Page")
    public void user_verify_title_of_PHP_Page() {
        PhpPage_impl.getTitle();
    }

}
