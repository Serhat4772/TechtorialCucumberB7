package steps.com.etsysteps;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.com.etsypages.EtsyHomePage;
import utils.BrowserUtils;
import utils.Driver;

public class EtsySearchSteps {

    WebDriver driver;
    EtsyHomePage etsyHomePage;

    @Before
    public void beforeScenario(){
        //it will run before each scenario
        System.out.println("Before Annotation.");
    }
    @Before("@tc2")
    public void conditionalScenario(){
        System.out.println("Conditional Scenario");
    }

    @After
    public void afterScenario(Scenario scenario){
        //it will run after each scenario
        System.out.println("After Annotation");
        if (scenario.isFailed()){
            BrowserUtils.takeScreenShot();
        }

    }
    @BeforeStep
    public void beforeStep(){
        System.out.println("Before Each Step");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("After Each Step");
    }

    @Given("the user navigates {string}")
    public void the_user_navigates(String url) {
       driver= Driver.getDriver();
       driver.get(url);

    }
    @When("the user search with {string}")
    public void the_user_search_with(String searchValue) {
    etsyHomePage=new EtsyHomePage(driver);
    etsyHomePage.sendSearchKey(searchValue);

    }
    @Then("the user should see the title {string}")
    public void the_user_should_see_the_title(String expectedTitle) {
        String actualTitle=driver.getTitle();

        Assert.assertEquals("Validation of Title",expectedTitle,actualTitle);


    }
}
