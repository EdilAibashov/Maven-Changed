package test_runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "step_definitions",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/BookingPage-reports",
                "json:target/cucumber-reports/cucumberTestReports.json",
                "rerun:target/rerun.txt"
        },
        tags = {"@bookingPage"},
        dryRun = false
)
public class BookingPage_Runner {
}