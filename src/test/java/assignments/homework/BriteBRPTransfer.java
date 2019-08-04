package assignments.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BriteBRPTransfer {


    static WebDriver driver;

    public static void main(String[] args) throws Exception {
        WebDriverManager.firefoxdriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://54.148.96.210/web/login");
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void verifySignin () throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/ul/li[10]/a/b")).click();
        driver.findElement(By.id("login")).sendKeys("in@info.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("alsfuh7we67");
        Thread.sleep(3000);
        String expectedResult = "Clicked on login page";
        String actualResult = driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).getText();
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void verifyTransfer () throws InterruptedException {
        String expectedResult = "Click on Title";
        driver.findElement(By.xpath("/html/body/nav/div[2]/ul[1]/li[6]/a/span")).click();
        Thread.sleep(3000);
        String expectedResult1 = "VerifyTransfer";
        WebElement actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[6]/ul[1]/li[1]/a"));
        actualResult.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals(actualResult, expectedResult1);


    }


    @AfterMethod
    public void teardown () {

        driver.close();
        // to close browser after test
    }


}
