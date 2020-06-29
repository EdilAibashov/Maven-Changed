package step_definitions;

import org.openqa.selenium.WebDriver;
import pages.TopDealsPage;
import step_definitions.step_impl.CreditCardsPage_Impl;
import util.Driver;

public class CreditCardsPage_STEPS {
    public static WebDriver driver = Driver.getDriver();
    TopDealsPage topDealsPagePage = new TopDealsPage();
    CreditCardsPage_Impl creditCardsPage_impl = new CreditCardsPage_Impl();

    }

