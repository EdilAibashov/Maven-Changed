package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminCouponPage;
import pages.AdminHomePage;
import step_definitions.step_impl.AdminCouponPage_Impl;
import util.CucumberUtils;
import util.SeleniumUtils;

import java.util.List;
import java.util.Map;

public class AdminCouponPage_STEPS {
    AdminHomePage adminHomePage = new AdminHomePage();
    AdminCouponPage_Impl adminCouponPage_Impl = new AdminCouponPage_Impl();
    AdminCouponPage adminCouponPage = new AdminCouponPage();



    @When("Creates a new coupon")
    public void creates_a_new_coupon() {
        adminCouponPage_Impl.createNewCoupon();
    }

    @When("Creates a new coupon with following info")
    public void creates_a_new_coupon_with_following_info(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps();
        util.SeleniumUtils.click(adminCouponPage.addNewCoupon_Btn);
        util.SeleniumUtils.sendKeys(adminCouponPage.percentage_field, list.get(0).get("value"));
        util.SeleniumUtils.sendKeys(adminCouponPage.maxUses_field, list.get(1).get("value"));
        util.SeleniumUtils.sendKeys(adminCouponPage.startDate_field, list.get(2).get("value"));
        util.SeleniumUtils.sendKeys(adminCouponPage.endDate_field, list.get(3).get("value"));

        if (list.get(4).get("value").equalsIgnoreCase("check"))
        SeleniumUtils.click(adminCouponPage.tours_checkBox);

        if (list.get(4).get("value").equalsIgnoreCase("check"))
            util.SeleniumUtils.click(adminCouponPage.cars_checkBox);

        util.SeleniumUtils.sendKeys(adminCouponPage.codeInput_field, list.get(5).get("value"));
        util.SeleniumUtils.click(adminCouponPage.submit_Btn);
        util.SeleniumUtils.waitForVisibilityOfElement(adminCouponPage.addNewCoupon_Btn);

    }



    @Then("Verifies coupon is {string}")
    public void verifies_coupon_is(String status) {
        switch (status.toLowerCase()){
            case "created":
                Assert.assertTrue(adminCouponPage_Impl.verifyIfCouponExists());
                CucumberUtils.logInfo("Coupon created",true);
                break;
            case "deleted":
                util.SeleniumUtils.waitForPageToLoad();
                CucumberUtils.logInfo("Coupon deleted",true);
                Assert.assertFalse(adminCouponPage_Impl.verifyIfCouponDoesntExist());
        }

    }

    @Then("Deletes newly created coupon")
    public void deletes_newly_created_coupon() {
        adminCouponPage_Impl.deleteLastCreatedCoupon();
    }


}


