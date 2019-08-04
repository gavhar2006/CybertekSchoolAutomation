package com.com.company.day5.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class LocatorPracticeID {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.id("woodenspoon")).click();
        driver.quit();
    }
}

