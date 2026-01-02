package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(5000);

        WebElement RadioButton = driver.findElement(By.xpath("//input[@id='bmwradio']"));

        System.out.println(RadioButton.isSelected());
        RadioButton.click();
        System.out.println(RadioButton.isSelected());

        driver.quit();
    }
}
