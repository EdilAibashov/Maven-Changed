package test_runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "step_definitions",
        plugin = {
                "pretty",
                "html:target/cucumber-failed-reports/cucumber-pretty",
                "json:target/cucumber-reports/cucumberFailedTests.json",
        }

)
public class failedFeatures_Runner {

}
