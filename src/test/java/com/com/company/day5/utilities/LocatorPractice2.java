package com.com.company.day5.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LocatorPractice2 {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception{
        test1();
    }

    //negative test, we will use wrong id to locate element
    public static void test1() throws Exception{
        driver.manage().window().maximize();
        //selenium will wait 10 seconds for element
        //if, within 10 seconds, element will not show up
        //you will get NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.id("woodenspoon")).click();
        Thread.sleep(3000);
        driver.quit();
    }


}

