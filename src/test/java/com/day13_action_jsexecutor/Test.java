package com.day13_action_jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Test {


    WebDriver driver;
    @org.testng.annotations.Test
    public void jsExecutorTest1() {
        driver.get("http://practice.cybertekschool.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title = (String) js.executeScript("return document.title");
        js.executeScript("alert('HELLO SPARTANS!!!!')");
        System.out.println(title);


    }
}