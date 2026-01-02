package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest_dropdown {

    public static void main(String[] args) throws InterruptedException {
        /// https://selenium08.blogspot.com/2020/01/click-and-hold.html
        //click ona Hold example

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/?zx=1765850590692&no_sw_cr=1");
        WebElement Searchbox = driver.findElement(By.id("APjFqb"));
        Searchbox.sendKeys("iphone");

        Thread.sleep(5000);
//       // for (WebElement suggestion:sear) {
//            System.out.println(suggestion.getText());
//        }
//
//        driver.quit();
    }
}