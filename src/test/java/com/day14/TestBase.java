package com.day14;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
​
import java.util.concurrent.TimeUnit;
public class TestBase {

    WebDriver driver;
    Actions action;

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Long.valueOf(ConfigurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}
