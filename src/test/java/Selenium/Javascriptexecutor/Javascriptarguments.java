package Selenium.Javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptarguments {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //Thread.sleep(2000);
        WebElement ds= driver.findElement(By.xpath("//a[text()='Disclaimer']"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,4500)");///up and down operation
        js.executeScript("arguments[0].scrollIntoView();",ds);
        Thread.sleep(2000);

        //js.executeScript("window.scrollBy(0,-4500)");
        driver.quit();
    }
}
