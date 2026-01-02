package Selenium.ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Click_HoldExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement element=driver.findElement(By.xpath("//li[text()='A']"));
        Actions a=new Actions(driver);
        a.clickAndHold(element).pause(2000).release().build().perform();
        //a.moveToElement(element);
        driver.close();

    }
}
