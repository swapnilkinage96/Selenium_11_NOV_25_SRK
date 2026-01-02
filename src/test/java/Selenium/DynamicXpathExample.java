package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        //Starts-with
        driver.findElement(By.xpath("//a[starts-with(text(),'Get a ')]")).click();
        //Contains
        //driver.findElement(By.xpath("//a[contains(text(),'Rediffmail ID')]")).click();
        Thread.sleep(1400);
        driver.quit();
    }
}
