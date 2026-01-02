package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectdropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        WebElement MultiSelect = driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
        Select s = new Select(MultiSelect);
        //Selectbyindex
        s.selectByIndex(2);
        Thread.sleep(2000);
        //select by value
        s.selectByValue("apple");
        Thread.sleep(2000);
        /// select by visible text
        s.selectByVisibleText("Peach");
        Thread.sleep(2000);

        //DeSelectbyindex
//        s.deselectByIndex(2);
//        Thread.sleep(2000);
//        //select by value
//        s.deselectByValue("apple");
//        Thread.sleep(2000);
//        /// select by visible text
//        s.deselectByVisibleText("Peach");
//        Thread.sleep(2000);

 //       s.deselectAll();

        List<WebElement> allelements=s.getOptions();
        for(WebElement e:allelements){
            System.out.println(e.getText());
        }
        List<WebElement> allelements1=s.getAllSelectedOptions();
        for(WebElement e:allelements1){
            System.out.println(e.getText());
        }
        driver.quit();
    }
}
