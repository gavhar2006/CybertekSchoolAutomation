package com.day9;


import com.utilities.BrowserFactory;
import com.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AbsoluteXpathDemo {
    //we use only inside this class, that's why it's private
    private WebDriver driver = BrowserFactory.getDriver("chrome");

    @BeforeMethod // it runs before every @Test
    public void setup() {
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
    }

    @Test
    public void test1() {
        driver.findElement(By.xpath("html/body/div/div[2]/div/div/form/div/div[1]/input[@name='full_name']")).sendKeys("Java GURU");
        driver.findElement(By.xpath("html/body/div/div[2]/div/div/form/div/div[1]/input[@name='email']")).sendKeys("tomsmith@email.com");
        SeleniumUtils.waitPlease(2);
        driver.findElement(By.xpath("html/body/div/div[2]/div/div/form/button")).click();
        SeleniumUtils.waitPlease(2);
        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        String actualMessage = driver.findElement(By.xpath("html/body/div/div[2]/div/div/h3")).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @AfterMethod // it will run after every @Test
    public void teardown() {
        driver.quit();
    }
}
