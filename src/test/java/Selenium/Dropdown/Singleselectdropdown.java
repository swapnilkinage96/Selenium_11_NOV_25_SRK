package Selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singleselectdropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        WebElement MultiSelect = driver.findElement(By.xpath("//select[@id='carselect']"));
        Select s = new Select(MultiSelect);
        //Selectbyindex
        s.selectByIndex(2);
        Thread.sleep(2000);
        //select by value
        s.selectByValue("honda");
        Thread.sleep(2000);
        /// select by visible text
        s.selectByVisibleText("BMW");
        Thread.sleep(2000);
        driver.quit();
    }
}
