package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.get();
        driver.navigate().to("https://www.letskodeit.com/home");
        Thread.sleep(5000);
        WebElement Home = driver.findElement(By.xpath("//li[@data-id='41188']"));
        if (Home.getText().equals("HOME")) {
            Home.click();
            System.out.println("isvisible");
        } else {
            System.out.println("no visible");
        }

        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.quit();
    }
}
