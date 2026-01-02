package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_IsDisableExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver; //Declare driver
        driver=new ChromeDriver(); //Initilization of driver
       // WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(5000);
        WebElement DisableButton=driver.findElement(By.xpath("//input[@id='enabled-example-input']"));
        WebElement EnableButton=driver.findElement(By.xpath("//input[@id='enabled-example-input']"));
        WebElement Textbox=driver.findElement(By.xpath("//input[@id='enabled-example-input']"));
        //Printing statements
        System.out.println(Textbox.isEnabled());
        DisableButton.click();
        System.out.println(Textbox.isEnabled());
        DisableButton.click();
        System.out.println(Textbox.isEnabled());
        DisableButton.click();
        System.out.println("********************************************");
        System.out.println(Textbox.isEnabled());
        EnableButton.click();
        System.out.println(Textbox.isDisplayed());
        EnableButton.click();
        System.out.println(Textbox.isEnabled());
        EnableButton.click();
        driver.quit();
    }
}
