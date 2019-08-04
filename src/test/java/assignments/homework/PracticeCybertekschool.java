package assignments.homework;

import com.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.Driver;

public class PracticeCybertekschool {

    public static   void main(String [] args)  throws  InterruptedException {

            //
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/login");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.name("username")).sendKeys("BrianSmith");

            driver.findElement(By.name("password")).sendKeys("SevenStarPassword");

            driver.findElement(By.id("wooden_spoon")).click();
           // System.out.println("login");

            Thread.sleep(2000);

//            driver.findElement(By.linkText("login")).getText();
//
//
//            System.out.println("Login Unsuccessfully");
//            Thread.sleep(2000);
           String expectedResult = " Your username is invalid!";
           String actualResult = driver.findElement(By.id("flash")).getText();

           System.out.println("expected is: " + expectedResult);
        System.out.println( "actual is: " + actualResult);
        Assert.assertEquals(actualResult, expectedResult);

            driver.quit();




        }

        }


