package Selenium.ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        WebElement src=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable']"));
        WebElement des=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));

        Actions a=new Actions(driver);
        a.dragAndDrop(src,des).perform();
    }
}
