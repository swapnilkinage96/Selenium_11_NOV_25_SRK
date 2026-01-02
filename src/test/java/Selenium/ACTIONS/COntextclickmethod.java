package Selenium.ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class COntextclickmethod {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement element=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions a=new Actions(driver);
       // a.clickAndHold(element).pause(2000).release().build().perform();
        //a.moveToElement(element);
        a.contextClick(element).perform();
        Thread.sleep(2000);
        driver.close();
    }
}
