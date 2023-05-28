package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverActions;

public class SearchBox extends DriverActions {

    By searchBoxLocator = By.xpath("//input[@class=\"default-input o-header__search--input\"]");
    By submitButtonLocator = By.id("nav-search-submit-button");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        //click(submitButtonLocator);
    }
    public void searchBoxClear(){
        clearLocator(searchBoxLocator);
    }

}
