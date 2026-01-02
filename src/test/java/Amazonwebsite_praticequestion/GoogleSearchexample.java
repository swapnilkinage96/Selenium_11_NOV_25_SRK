package Amazonwebsite_praticequestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.*;
import java.util.*;

public class GoogleSearchexample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("Testing");
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//child::li//descendant::div[@id='c7mM1c']"));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().contains("Testing jobs in pune"));
            Thread.sleep(2000);
            list.get(i).click();
            break;
        }
        driver.quit();
    }

}