package Selenium.BrowserCookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class CookiesExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        //Add own Cookies
        Cookie owncookie = new Cookie("company", "SLB");
        driver.manage().addCookie(owncookie);
        Set<Cookie> allcookies = driver.manage().getCookies();
        for (Cookie c : allcookies) {
            // System.out.println(c);
            System.out.println("Name: " + c.getName()
                    + " | Value: " + c.getValue());
            System.out.println("*****************");
            System.out.println();
            System.out.println(driver.manage().getCookieNamed("company"));



        }
        for (Cookie dc : allcookies) {
            // System.out.println(c);
            System.out.println("Name: " + dc.getName()
                    + " | Value: " + dc.getValue());
         //   driver.manage().deleteAllCookies();
        }
//        System.out.println("*****************");
//        System.out.println();
//        System.out.println(driver.manage().getCookieNamed("company"));
        driver.close();
    }
}
