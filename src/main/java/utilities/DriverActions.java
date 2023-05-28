package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DriverActions {

    WebDriver driver ;

    public DriverActions(WebDriver driver){
        this.driver = driver ;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public String finds(By locator, int index){
        return driver.findElements(locator).get(index).getText();
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator , String text){
        find(locator).sendKeys(text);

    }
    public String getText(By locator){
        return find(locator).getText();
    }

    public String getTextList(By locator , int index){
        return finds(locator,index);
    }

    public void clearLocator(By locator){
            find(locator).clear();
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void waitItem(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
