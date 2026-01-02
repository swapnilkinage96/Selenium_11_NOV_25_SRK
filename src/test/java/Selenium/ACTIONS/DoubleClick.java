package Selenium.ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        WebElement element=driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));
        Actions a=new Actions(driver);
        // a.clickAndHold(element).pause(2000).release().build().perform();
        //a.moveToElement(element);
       // a.contextClick(element).perform();
        a.doubleClick(element).perform();
        Thread.sleep(2000);
        driver.close();
    }
}
