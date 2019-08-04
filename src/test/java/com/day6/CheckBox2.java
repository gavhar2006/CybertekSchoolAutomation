package com.day6;


import com.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;
public class CheckBox2 {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {

    }

    public static void openCheckBoxesPage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");
    }

    //verify  that checkbox 1 is not selected and checkbox 2 is selected
    public static void test1(){

    }
}

