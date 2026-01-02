package Selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args) {
        //
        //input[@placeholder='Full Name']
        //input[@placeholder='name@example.com']
        //textarea[@placeholder='Current Address']
        //button[@class='btn btn-primary']
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        driver.findElement(By.xpath("//span[text()='Text Box']']")).click();
        driver.findElement(By.xpath("input[@placeholder='name@example.com']")).sendKeys("SRK@gmail.com");
        driver.findElement(By.xpath("//span[text()='Check Box']")).click();

        driver.findElement(By.xpath("//span[text()='Commands']")).isDisplayed();
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).isSelected();
        driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();




    }
}
