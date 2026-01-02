package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentXpathExample {

    ///ancestor->Current node all parents and grandparents
    /// following-->From current node all child and grand child locator
    /// child-->From current node navigate to child only
    ///parent->navigate from current node to parent node only
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(5000);
        //Following-sibling

        ///Need to discuss..?

        WebElement Money = driver.findElement(By.xpath("//a[text()='Money']//parent::div"));
        // Check text and click
         if(Money.getText().equals("Money")){
             Money.click();
         }else {
             System.out.println("Not visible Money");
         }
         driver.close();

    }
}
