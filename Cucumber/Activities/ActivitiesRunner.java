package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature",
        glue = {"stepDefinitions"},
        tags = "@activity1"
)

public class ActivitiesRunner {
    //empty
}
