package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapbilityExample {
    public static void main(String[] args) {
        ChromeOptions cp=new ChromeOptions();
        cp.setBinary("H:\\AUTOMATION SETUP\\chromedriver file\\chrome-win64\\chrome.exe");
        //cp.addArguments("--headless");
        cp.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(cp);
       driver.get("https://www.saucedemo.com/");
        System.out.println( driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        //driver.close();
        driver.quit();


    }
}
