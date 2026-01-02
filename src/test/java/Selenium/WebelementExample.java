package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(5000);

//        WebElement usernameTextbox = driver.findElement(By.xpath("//input[@class='email-input']"));
//        usernameTextbox.sendKeys("swapnil2222");
//        Thread.sleep(2000);
//        usernameTextbox.clear();
        //click
//        WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
//        login.click();
//       Thread.sleep(2000);
        //gettext method
        // System.out.println(login.getText());
//get tagname
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
        System.out.println(login.getTagName());
        Thread.sleep(2000);
        driver.close();
    }
}
