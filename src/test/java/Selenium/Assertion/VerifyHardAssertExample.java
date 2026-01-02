package Selenium.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class VerifyHardAssertExample {
    @Test
    public void verifyHardAssert() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement pwd = driver.findElement(By.id("password"));
        WebElement loginbtn = driver.findElement(By.id("login-button"));


        Assert.assertTrue(username.isDisplayed());
        Assert.assertTrue(pwd.isSelected());
        Assert.assertEquals(loginbtn.getTagName(), "input");
        driver.quit();
    }
}