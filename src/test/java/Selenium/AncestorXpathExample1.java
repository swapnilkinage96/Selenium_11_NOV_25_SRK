package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AncestorXpathExample1 {
    //we have to fetch that time ancestor used
    //Ancestor xpath axess
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(1000);
        WebElement login = driver.findElement(By.xpath("//span[text()='TVs & Appliances']//ancestor::a"));
        login.click();
    }


}


