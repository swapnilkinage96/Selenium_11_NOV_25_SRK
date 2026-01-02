package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsClasssExample2 {
    public static void main(String[] args) throws InterruptedException {
        /// https://selenium08.blogspot.com/2020/01/click-and-hold.html
        //click ona Hold example

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        Thread.sleep(5000);

       // WebElement elementA= driver.findElement((By.xpath(""));

    }
}

