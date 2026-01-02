package Selenium.DATEPICKER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class PastyearDateselection {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://jqueryui.com/");
        // Switch to iframe
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("Datepicker")).click();


        // Open datepicker
        driver.findElement(By.id("datepicker")).click();

        String expectedMonth = "June";
        String expectedYear = "2020";
        String expectedDate = "30";

        // Navigate to expected month & year
        while (true) {
            String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
            String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

            if (currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear)) {
                break;
            }

            // Click Previous button
            driver.findElement(By.xpath("//a[@title='Prev']")).click();
        }

        // Select date
        List<WebElement> allDates = driver.findElements(
                By.xpath("//table[@class='ui-datepicker-calendar']//td/a")
        );

        for (WebElement date : allDates) {
            if (date.getText().equals(expectedDate)) {
                date.click();
                break;
            }
        }

        driver.quit();
    }
}

