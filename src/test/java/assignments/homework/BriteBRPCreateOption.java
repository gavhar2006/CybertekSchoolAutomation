package assignments.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BriteBRPCreateOption {




    WebDriver driver;


    public static void main(String[] args) throws Exception {
        WebDriverManager.firefoxdriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://34.220.250.213/web/login");
        String title = driver.getTitle();
        System.out.println(title);

    }


    @Test
    public void verifyLogin() throws InterruptedException {

        driver = new ChromeDriver();
        driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/ul/li[10]/a/b")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("login")).sendKeys("in_ex_officer@info.com");
        driver.findElement(By.id("password")).sendKeys("LLighg93");

        Thread.sleep(3000);

        String expectedResult = "Clicked on login ";
        String actualResult = driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).getText();
        Assert.assertEquals(actualResult, expectedResult);


    }


    @Test
    public void verifyCreateOption() throws InterruptedException {

        String expectedResult1 = "Click on Title";
        driver.findElement(By.xpath("/html/body/nav/div[2]/ul[1]/li[9]/a/span")).click();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // Click on Expenses to submit button

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[9]/ul[1]/li[1]/a/span")).click();

        Thread.sleep(3000);
        String actualResult1 = "VerifyCreateOption";
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")).click();
        Assert.assertEquals(actualResult1, expectedResult1);


    }


    @AfterMethod
    public void teardown() {
        driver.close();


    }


}
