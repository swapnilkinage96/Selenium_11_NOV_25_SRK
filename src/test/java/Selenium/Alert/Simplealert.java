package Selenium.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Simplealert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        driver.findElement(By.id("name")).sendKeys("SRK");
       // WebElement Alertbutton = driver.findElement(By.id("alertbtn"));
        WebElement Alertbutton = driver.findElement(By.id("confirmbtn"));
        // Actions a=new Actions(driver);
        Thread.sleep(2000);
        Alertbutton.click();
        Alert a1 = driver.switchTo().alert();
        Thread.sleep(3000);
        a1.accept();

        driver.quit();
    }
}
