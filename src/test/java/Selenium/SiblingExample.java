package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(5000);
//Following-sibling
        WebElement BusinessEmail = driver.findElement(By.xpath("//a[text()='Enterprise Email']//following-sibling::a"));
        // Check text and click
        if (BusinessEmail.getText().equals("Business Email")) {
            BusinessEmail.click();
        } else {
            System.out.println("Business email link not found!");
        }
        Thread.sleep(1000);
        driver.close();
    }
}
