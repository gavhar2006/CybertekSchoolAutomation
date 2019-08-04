package assignments.homework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.com.company.day5.utilities.BrowserFactory;

public class VytrackLogin {
    public static void main(String[] args) {

        WebDriver driver;
        BrowserFactory.getDriver("chrome");
        driver = new ChromeDriver();
        driver.get("http://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();

        WebElement UserName = driver.findElement(By.id("prependedInput"));
        UserName.sendKeys("user185");

        WebElement Password = driver.findElement(By.name("_password"));
        Password.sendKeys("UserUser123");

        WebElement Login = driver.findElement(By.id("_submit"));
        Login.click();

        String expectedTitle = "Fleet Management";
        System.out.println(driver.getTitle());
        WebElement expextedResult = driver.findElement(By.xpath("//*[@id='organization-switcher']/div/h1/a"));
        expextedResult.isDisplayed();
        if (expectedTitle.equalsIgnoreCase(expextedResult.getText())) {
            System.out.println("Login Passed!");
        } else {
            System.out.println("Login Failed!");
        }

        driver.close();

    }


}
