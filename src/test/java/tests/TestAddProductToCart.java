package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.CartPage;
import pages.HomePage;
import pages.ProductDetailPage;
import utilities.DataWriter;
import utilities.ExcelDataReader;

public class TestAddProductToCart extends TestRunner {

    @Test
    public void search_a_product(){
        String productPrice;
        HomePage homePage = new HomePage(driver);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        ExcelDataReader excelDataReader = new ExcelDataReader();
        DataWriter dataWriter = new DataWriter();
        CartPage cartPage = new CartPage(driver);
        homePage.acceptCookies();
        homePage.genderManButton();
        homePage.searchBox().search(excelDataReader.readData(0,0));
        homePage.searchBox().search(Keys.CONTROL+ "a");
        homePage.searchBox().search(Keys.BACK_SPACE+"");
        homePage.searchBox().search(excelDataReader.readData(0,1) + Keys.ENTER);
        homePage.waitItem();
        homePage.clickProduct();
        homePage.waitItem();
        dataWriter.dataWriter(
                productDetailPage.getProductName(),
                productDetailPage.getProductDesc(),
                productDetailPage.getProductPrice());
        productPrice = productDetailPage.getProductPrice();
        productDetailPage.clickProductSize();
        productDetailPage.addToCart();
        homePage.waitItem();
        homePage.waitItem();
        homePage.goToCart();
        homePage.waitItem();
        Assertions.assertEquals(productPrice.trim(), cartPage.getProductPrice().trim());
        cartPage.clickDropDownList();
        cartPage.clickCountInDropDownList();
        //Assertions.assertEquals("2 adet", cartPage.getCountInDropDownList());
        cartPage.clickRemoveProductButton();
        cartPage.waitItem();
        Assertions.assertTrue(cartPage.isDisplayedItem(), "cart not empty");
    }

}
