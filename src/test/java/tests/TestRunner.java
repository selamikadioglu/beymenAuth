package tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import testlogger.TestResultLogger;
import utilities.ConfigReader;
import utilities.Driver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class TestRunner {

    WebDriver driver ;

    @BeforeAll
    public void setUp(){
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("homePageUrl"));
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown(){
        Driver.closeDriver();
    }

}