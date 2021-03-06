package pages.com.etsyPracticepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {
    public EtsyHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "search_query")
   public WebElement searchField;

    @FindBy( xpath = "//button[@data-id='gnav-search-submit-button']")
   public WebElement searchButton;

}
