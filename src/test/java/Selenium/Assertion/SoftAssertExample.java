package Selenium.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void verifySoftAssertExample() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("secret_sauce");
        WebElement loginbtn = driver.findElement(By.id("login-button"));
        loginbtn.click();
        SoftAssert sf = new SoftAssert();
        sf.assertTrue(username.isDisplayed());
        sf.assertTrue(pwd.isDisplayed());
        sf.assertEquals(loginbtn.getTagName(), "input");
        sf.assertAll();
        System.out.println("HELLO GOOD MORNING");
        driver.quit();
    }
}

