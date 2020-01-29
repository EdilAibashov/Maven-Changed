package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import step_definitions.step_impl.HomePage_impl;
import util.ConfigReader;
import util.Driver;

public class HomePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    HomePage_impl homePage_impl = new HomePage_impl();

    @Given("User opens home page")
    public void user_opens_home_page() {
        driver.get(ConfigReader.readProperty("url"));
    }

    @Then("Verifies title is {string}")
    public void verifies_title_is(String string) {
        Assert.assertEquals(string, homePage_impl.getTitle());
    }
}
