package com.day9;


import com.utilities.BrowserFactory;
import com.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class MultipleButtonsPracticeWithXpath {

    WebDriver driver;
    //only buttons from 1-5
//    String buttons = "//button[starts-with(text(),'Button')]";
    String button3Locator = "//button[starts-with(@id,'button_')]";
    String resultLocator = "//p[@id='result']";

    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
    }

    @Test
    public void verifyButton3(){
        String expectedMessage = "Clicked on button three!";
        driver.findElement(By.xpath(button3Locator)).click();
        SeleniumUtils.waitPlease(2);
        String actualMessage = driver.findElement(By.xpath(resultLocator)).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

///Users/fatimakamardinova/IdeaProjects/CybertekSchoolAutomation/src/test/java/com/day9/MultipleButtonsPracticeWithXpath.java
///Users/fatimakamardinova/IdeaProjects/CybertekSchoolAutomation/src/test/java/com/day13_action_jsexecutor/ActionsClassTests_d.java
///Users/fatimakamardinova/IdeaProjects/CybertekSchoolAutomation/src/test/java/com/day9/AbsoluteXpathDemo1.java