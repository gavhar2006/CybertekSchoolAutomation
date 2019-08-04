package com.day14;


import com.utilities.SeleniumUtils;
import org.testng.annotations.Test;
import com.utilities.Driver;
​
public class SingletonDriverTests {

    @Test
    public void test1(){
        Driver.getDriver().get("http://google.com");
        SeleniumUtils.waitPlease(2);
        Driver.closeDriver();//to completely shutdown driver
}
