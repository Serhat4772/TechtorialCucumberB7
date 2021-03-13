package runner.com.webOrder;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //it is coming from junit. it will help us to run cucumber feature files.
@CucumberOptions( //we can provide multiple parameter for cucumber options to organize our runner class


        features = {"src/test/resources/com.weborder", "src/test/resources/com.ebay"},//provide feature file path which you want to run
        glue = "steps/com",//provide step definitions class path for your feature file
        dryRun = false //we use dryRun get unimplemented steps for our feature files.
)


public class cukesRunner {

}
