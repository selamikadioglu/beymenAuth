package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.DriverActions;

import java.util.List;

public class CartPage extends DriverActions {

    By productPriceInCart = By.xpath("//span[@class=\"m-productPrice__salePrice\"]");
    By productCountDropDownList = By.id("quantitySelect0-key-0");
    By removeProductButton = By.id("removeCartItemBtn0-key-0");
    By productCountInDropDownList = By.xpath("//option[@value=\"2\"]");
    By emptyCartText = By.id("emtyCart");
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public String getProductPrice() {
        return getText(productPriceInCart);
    }
    public void clickDropDownList() {
        click(productCountDropDownList);
    }
    public void clickCountInDropDownList() {
        click(productCountInDropDownList);
    }
    public String getCountInDropDownList() {
        return getTextList(productCountDropDownList, 0);
    }
    public void clickRemoveProductButton() {
        click(removeProductButton);
    }
    public Boolean isDisplayedItem() {
        return isDisplayed(emptyCartText);
    }
}
