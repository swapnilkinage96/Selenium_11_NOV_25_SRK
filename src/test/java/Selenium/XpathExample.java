package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
      //  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/div[2]/div/span")).sendKeys("SWAPNIL");
         driver.manage().window().maximize();
         //Relative xpath
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SWA123");
      //  driver.findElement(By.xpath("//input[@id='password' and @name='passwd' ]")).sendKeys("2225452559485");
        driver.findElement(By.xpath("//input[@id='password' or @name='passwd' ]")).sendKeys("2225452559485");
Thread.sleep(1000);
         driver.quit();

    }
}
