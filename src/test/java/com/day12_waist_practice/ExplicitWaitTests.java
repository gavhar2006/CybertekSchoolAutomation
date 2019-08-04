package com.day12_waist_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class ExplicitWaitTests {

    String startButtonLocator = "#start > button";
    String usernameLocator = "#username";
    String passwordLocator = "#pwd";
    String submitButtonLocator = "button[type='submit']";


    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void waitForVisibilityTest(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        driver.findElement(By.cssSelector(startButtonLocator)).click();
        driver.findElement(By.cssSelector(usernameLocator)).sendKeys("tomsmith");
        driver.findElement(By.cssSelector(passwordLocator)).sendKeys("SuperSecretPassword");
        driver.findElement(By.cssSelector(submitButtonLocator)).click();
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
