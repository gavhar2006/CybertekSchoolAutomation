package com.day7;



import com.utilities.BrowserFactory;
import com.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class DropDownsPractice {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        openDropDownPage();
        SeleniumUtils.waitPlease(2);
        test1();
        SeleniumUtils.waitPlease(2);
        driver.close();
    }

    public static void openDropDownPage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement element = driver.findElement(By.xpath("//h3[text()='Dropdown List']"));
        SeleniumUtils.verifyIsDisplayed(element);
    }


    public static void test1(){
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));
        //to work with select elements
        //we need to use Select class
        Select dropdownSelect = new Select(dropdown1);
        String actual = dropdownSelect.getFirstSelectedOption().getText();
        String expcted = "Please select an option";
        SeleniumUtils.verifyEquals(expcted, actual);
    }
}

