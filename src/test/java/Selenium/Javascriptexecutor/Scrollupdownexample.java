package Selenium.Javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdownexample {
    /// https://the-internet.herokuapp.com/upload
    /// https://demoqa.com/frames
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4500)");///up and down operation
        Thread.sleep(2000);
      //  driver.findElement(By.xpath("//a[text()='Disclaimer']")).click();
        js.executeScript("window.scrollBy(0,-4500)");
        driver.quit();
    }
}
