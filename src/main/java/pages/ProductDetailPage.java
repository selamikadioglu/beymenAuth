package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverActions;

public class ProductDetailPage extends DriverActions {

    By addToCartButtonLocator = By.xpath("//button[@class=\"m-addBasketFavorite__basket btn\"]");
    By newPrice = By.id("priceNew");
    By productName = By.xpath("//a[@class=\"o-productDetail__brandLink\"]");
    By productDesc = By.xpath("//span[@class=\"o-productDetail__description\"]");

    By productSize = By.xpath("//span[@class=\"m-variation__item\"]");


    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        return getText(productName);
    }
    public String getProductDesc() {
        return getText(productDesc);
    }

    public String getProductPrice(){
        return getText(newPrice);
    }
    public void clickProductSize(){
        click(productSize);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }
}
