package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
//Webdriver-->Interface
        //driver-->Object
        //new-->Keywords to initialized an object
        // ChromeDriver ->Class

        WebDriver driver =new ChromeDriver();// create  a object
        //ChromeDriver driver1=new ChromeDriver();
    //    EdgeDriver driver2=new EdgeDriver();
     //   FirefoxDriver driver3=new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
