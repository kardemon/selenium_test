package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.rik.ee/et");
        WebElement element = driver.findElement(By.id("edit-search-block-form--2"));
        element.sendKeys("tööpakkumised");
        WebElement element1 = driver.findElement(By.id("edit-submit"));
        element1.click();

    }
}
