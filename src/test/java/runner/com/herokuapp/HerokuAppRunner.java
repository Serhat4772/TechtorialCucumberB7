package runner.com.herokuapp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="com.herokuapp/cucumberString",
        glue = "steps/com/herokuappSteps",
        dryRun = false
)
public class HerokuAppRunner {

}
