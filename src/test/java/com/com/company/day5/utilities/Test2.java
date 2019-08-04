package com.com.company.day5.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test2 {

     public static WebDriver driver;
    public static void test2() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //this is you must to use, otherwise you will be in trouble
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/login");
    driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(3000);
        String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";
        String actualMessage = driver.findElement(By.className("subheader")).getText();
        SeleniumUtils.verifyEquals(expectedMessage, actualMessage);
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        driver.quit();


    }

}
