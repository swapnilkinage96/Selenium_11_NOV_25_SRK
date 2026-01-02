package Amazonwebsite_praticequestion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(1000);
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollByView(0,500)");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

//        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
//        Thread.sleep(1000);
        WebElement windows = driver.findElement(By.xpath("//button[text()='New Window']"));
        windows.click();
        Thread.sleep(1000);
        driver.switchTo().parentFrame();
        WebElement textwindow=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
        textwindow.click();
        Thread.sleep(1000);
        driver.quit();

    }
}
