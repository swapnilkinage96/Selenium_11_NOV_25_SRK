package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildXpathExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(2000);

// Locate the element
        WebElement moneyLink = driver.findElement(By.xpath("//div[@class='toplinks']//child::a"));

// Check text and click
        if (moneyLink.getText().equals("Money")) {
            moneyLink.click();
        } else {
            System.out.println("Money link not found!");
        }
        driver.close();
    }
}
