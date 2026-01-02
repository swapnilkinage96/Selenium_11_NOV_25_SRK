package Selenium.WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowhandle {
    //open application
    //open child window
    //click on blog option
    //fetch the title of blog page
    //close blog window
    //click on radio button
    //close the parent window

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        //Thread.sleep(2000);
        WebElement ds = driver.findElement(By.id("openwindow"));
        ds.click();
        Thread.sleep(2000);
        String parentid = driver.getWindowHandle();
        System.out.println(parentid);
//        Thread.sleep(2000);
        Set<String> allwindows = driver.getWindowHandles();
        System.out.println(allwindows);
        for (String s : allwindows) {
            if (!s.contentEquals(parentid)) {
                driver.switchTo().window(s);
                driver.findElement(By.linkText("BLOG")).click();
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentid);
        driver.findElement(By.id("bmwradio")).click();
        driver.quit();
    }
}
