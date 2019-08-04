package assignments.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VytrackLogout {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://qa2.vytrack.com/user/login");
        Thread.sleep(2000);
    WebElement userName = driver.findElement(By.name("_username"));

    WebElement password = driver.findElement(By.id("prependedInput2"));

    WebElement  login = driver.findElement(By.id("_submit"));

    Thread.sleep(2000);

    userName.sendKeys("user185");
    password.sendKeys("UserUser123");
    Thread.sleep(2000);
    login.click();

    Thread.sleep(2000);
    WebElement logout = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));

    logout.click();
    Thread.sleep(2000);

    WebElement signOut = driver.findElement(By.xpath("//a[@class='no-hash']"));
    signOut.click();

    driver.close();
    }


}




