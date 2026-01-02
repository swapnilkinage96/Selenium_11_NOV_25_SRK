package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
      WebElement e= driver.findElement(By.id("user-name"));
        e.sendKeys("SWAPNIL KINAGE");
        Thread.sleep(5000);
        driver.quit();

    }
}
