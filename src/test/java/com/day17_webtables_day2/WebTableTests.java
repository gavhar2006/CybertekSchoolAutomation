package com.day17_webtables_day2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

import com.utilities.TestBase;

public class WebTableTests extends TestBase {


    /**
     * Write a method that will return count of rows
     *
     */
    public int getCountOfRows(){
        return driver.findElements(By.cssSelector("#table1 tr")).size();
    }
    /**
     * Write a method that will return count of rows
     * In this case, object of by allows us to specify table locator of any type
     */
    public int getCountOfRows(By by){
        return driver.findElements(by).size();
    }
    @Test
    public void countOfRowsTest1(){
        Assert.assertEquals(getCountOfRows(), 5, "Number of rows doesn't match");
    }
    @Test
    public void countOfRowsTest2(){
        Assert.assertEquals(getCountOfRows(By.xpath("//table[1]//tr")), 5, "Number of rows doesn't match");
    }
    /**
     *  Write a method that returns number of columns
     */
    public int getCountOfColumns(){
        return driver.findElements(By.cssSelector("#table1 th")).size();
    }
    /**
     *  Write a method that returns number of columns
     */
    public int getCountOfColumns(By by){
        return driver.findElements(by).size();
    }
    @Test
    public void countOfColumnsTest1(){
        Assert.assertEquals(getCountOfColumns(), 6, "Number of columns doesn't match");
    }



}
