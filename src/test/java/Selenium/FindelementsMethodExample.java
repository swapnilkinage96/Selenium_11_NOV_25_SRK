package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindelementsMethodExample {
    public static void main(String[] args) {
//1.locate for mulitple  webelement
        //2
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println(driver.getTitle());
        List<WebElement> allelements= driver.findElements(By.id("user-name"));
        for(WebElement a:allelements){
            System.out.println(a);
        }
        driver.quit();
    }

}
