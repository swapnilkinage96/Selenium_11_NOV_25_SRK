package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsdisplayMethod {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver; //Declare driver
        driver = new ChromeDriver(); //Initilization of driver
        // WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(5000);

        WebElement hidebutton=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
        hidebutton.click();
        WebElement showbutton=driver.findElement(By.xpath("//input[@id='show-textbox']"));
        hidebutton.click();
        WebElement Textbox=driver.findElement(By.xpath("//input[@id='displayed-text']"));
        hidebutton.click();
/// printing statement
        System.out.println(Textbox.isDisplayed());
        hidebutton.click();
        System.out.println(Textbox.isDisplayed());
        showbutton.click();
        System.out.println(Textbox.isDisplayed());
        driver.quit();
    }
}
