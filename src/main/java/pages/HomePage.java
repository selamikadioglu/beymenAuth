package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverActions;


public class HomePage extends DriverActions {

    SearchBox searchBox ;
    By product = By.xpath("//div[@class=\"o-productList__item\"]");
    By cartCountLocator = By.id("nav-cart-count");
    By cartContainerLocator = By.id("nav-cart-count-container");
    By acceptCookiesLocator = By.id("onetrust-accept-btn-handler");
    By genderManButton = By.id("genderManButton");
    By cart = By.xpath("//a[@class=\"o-header__userInfo--item bwi-cart-o -cart\"]");



    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public void goToCart() {
        click(cart);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }

    public void genderManButton(){
        if (isDisplayed(genderManButton)){
            click(genderManButton);
        }
    }
    public void clickProduct(){
        click(product);
    }
}
