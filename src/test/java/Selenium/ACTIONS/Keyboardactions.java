package Selenium.ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebElement textbox = driver.findElement(By.xpath("//input[@class='lNPl8b']"));

        Actions a = new Actions(driver);
        a.moveToElement(textbox)
                .click(textbox)
                .keyDown(Keys.SHIFT)
                .sendKeys("T shirt for men")
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build().perform();
        driver.close();
    }
}
