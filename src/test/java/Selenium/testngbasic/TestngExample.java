package Selenium.testngbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestngExample {
    public static WebDriver driver;

    @BeforeMethod
    public void m1() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void m2() {
        driver.close();
    }

    @Test
    public void test1() {
        driver.get("https://www.amazon.in/ref=nav_logo");
    }

    @Test
    public void test2() {
        driver.get("https://www.flipkart.com/");
    }

    @Test
    public void test3() {
        driver.get("https://www.facebook.com/");
    }
}
