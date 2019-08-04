package com.MYtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/fatimakamardinova/documents/selenium_dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

    }
}
