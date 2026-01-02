package Selenium.DATEPICKER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class Dateselector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://jqueryui.com/");
        driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        driver.findElement(By.id("datepicker")).click();
        List<WebElement> allElements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::td/a"));
        for (WebElement e : allElements) {
            if (e.getText().equals("30")) {
                e.click();
                break;

            }
        }
    }
}
