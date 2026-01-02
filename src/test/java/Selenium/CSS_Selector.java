package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CSS_Selector {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println(driver.getTitle());
       driver.findElement(By.cssSelector("input[class='email-input']")).sendKeys("swapnil123");
      //  driver.findElement(By.cssSelector("input.email-input")).sendKeys("swapnil");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("swapnil");
        //driver.findElement(By.cssSelector("input#password")).sendKeys("swapnil");
         Thread.sleep(2000);
         driver.close();
    }
}
