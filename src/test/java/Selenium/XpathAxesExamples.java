package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class XpathAxesExamples {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        //Following xpath axess
        //
        Thread.sleep(1000);
        Actions a = new Actions(driver);
        WebElement e1 = driver.findElement(By.xpath("//span[text()='Login']"));
        a.moveToElement(e1).perform();
        Thread.sleep(2000);

        List<WebElement> allelements = driver.findElements(By.xpath("//span[text()='Login']//following::a/li"));
        for (WebElement e : allelements) {
            if (e.getText().equalsIgnoreCase("Rewards")) {
                e.click();
                break;
            }
        }
    }
}
