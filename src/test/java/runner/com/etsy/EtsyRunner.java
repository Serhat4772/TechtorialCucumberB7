package runner.com.etsy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //to execute cucumber class
@CucumberOptions(
        features ="src/test/resources",
        glue = {"steps/com/etsysteps", "steps/com/Hooks"},
        dryRun = false,
        tags="@outline" //it will execute all etsy feature file @search

)

public class EtsyRunner {
}
