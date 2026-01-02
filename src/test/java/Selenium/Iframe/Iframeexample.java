package Selenium.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class Iframeexample {
        public static void main(String[] args) {
            WebDriver driver =new ChromeDriver();
            driver.get("https://demoqa.com/frames");
            //Automation way to identify iframe
     List<WebElement> allelements=driver.findElements(By.tagName("iframe"));
            System.out.println(allelements.size());


    }
}
