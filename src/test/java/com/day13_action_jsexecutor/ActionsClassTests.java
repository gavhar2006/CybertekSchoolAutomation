package com.day13_action_jsexecutor;


import com.utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class ActionsClassTests {


    WebDriver driver;
    String user1TextLocator = "//a[@href='/users/1']/preceding-sibling::h5";
    String firstImageLocator = "(//img)[1]";

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void hoverTest1(){
        driver.get("http://practice.cybertekschool.com/hovers");
        //we are creating object of Actions class
        //we have provide object of webdriver
        Actions action = new Actions(driver);
        //hover on element
        action.moveToElement(driver.findElement(By.xpath(firstImageLocator))).perform();
        String expectedText = "name: user1";
        String actualText = driver.findElement(By.xpath(user1TextLocator)).getText();

        //verify that after hover event text is visible
        Assert.assertTrue(driver.findElement(By.xpath(user1TextLocator)).isDisplayed());
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void hoverTest2(){
        driver.get("http://practice.cybertekschool.com/hovers");
        //we are creating object of Actions class
        //we have provide object of webdriver
        Actions action = new Actions(driver);
        List<WebElement> images = driver.findElements(By.tagName("img"));
        for (WebElement image: images){
            //ONLY DEMO
            SeleniumUtils.waitPlease(1);
            action.moveToElement(image).perform();
        }

    }

    @AfterMethod
    public void teardown() {
        driver.quit();


    }


}





