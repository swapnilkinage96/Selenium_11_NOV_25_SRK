package Selenium.ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoveraction {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebElement src=driver.findElement(By.xpath("//span[text()='Login']"));
//(//a[@aria-describedby='price-link'])[1]//following::span[@class='a-price-whole']
        Actions a=new Actions(driver);
        a.moveToElement(src).perform();
    }
}
