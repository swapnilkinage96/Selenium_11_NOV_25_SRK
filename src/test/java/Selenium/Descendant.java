package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Descendant {
    public static void main(String[] args) throws InterruptedException {
        //Descendant =>Whenever we have to fetch childrena and grandchildren
        /// child-->only child element fetch

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(5000);
        //Desscendant

        List<WebElement> allelement = driver.findElements(By.xpath("//div[@class='toplinks']//descendant::a"));
        for (WebElement e : allelement) {
            if (e.getText().equals("Money")) {
                e.click();
                break;
            }
        }


    }
}
