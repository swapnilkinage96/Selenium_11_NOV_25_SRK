package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinktextExamples {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //linktext locator example
//        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//        driver.manage().window().maximize();
//        driver.findElement(By.linkText("Forgot password?")).click();

        //Partial linktext locator example
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.partialLinkText("password?")).click();
//https://us.megabus.com/account-management/login
        //https://www.letskodeit.com/practice

   //By tagname locator
       List<WebElement> allelements=driver.findElements(By.tagName("input"));//only main input tagname showing(not hidden input tag not count
        System.out.println(allelements.size());
        driver.quit();
    }
}
