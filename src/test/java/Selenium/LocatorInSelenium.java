package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInSelenium {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println(driver.getTitle());

        //***id locator Example****
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //********Class name locator example**********
        //driver.findElement(By.className("input_error form_input")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        //*******Name locator example***********
        // driver.findElement(By.id("login-button")).click();
        // driver.findElement(By.className("submit-button btn_action")).click();
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(3000);
        driver.close();



    }
}
