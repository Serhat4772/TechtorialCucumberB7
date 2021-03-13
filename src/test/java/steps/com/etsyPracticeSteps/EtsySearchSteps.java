package steps.com.etsyPracticeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.com.etsyPracticepages.EtsyHomePage;
import pages.com.etsyPracticepages.EtsySearchResultPages;
import utils.ConfigReader;
import utils.Driver;

public class EtsySearchSteps {
    WebDriver driver;
    EtsyHomePage etsyHomePage;
    EtsySearchResultPages etsySearchResultPages;

    @Given("user go to the etsy home page")
    public void user_go_to_the_etsy_home_page() {
        driver = Driver.getDriver();
        driver.get("https://etsy.com");

    }

    @When("user search for zebra plant")
    public void user_search_for_zebra_plant() {
        etsyHomePage = new EtsyHomePage(driver);
        etsyHomePage.searchField.sendKeys(ConfigReader.getProperty("searchValue"));
        etsyHomePage.searchButton.click();
    }

    @Then("user sees the results")
    public void user_sees_the_results() {
        etsySearchResultPages = new EtsySearchResultPages(driver);

        int index=1;
        for (WebElement text : etsySearchResultPages.listOfLinks) {
            System.out.println(index++ +"-->"+text.getText());
        }
    }
}

