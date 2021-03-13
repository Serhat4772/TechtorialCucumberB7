package pages.com.etsyPracticepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EtsySearchResultPages {

    public EtsySearchResultPages(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a//div/h3")
    public List<WebElement> listOfLinks;


}
