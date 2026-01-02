package SeleniumBasicPracticeQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        //driver.findElement(By.xpath("//a[@class='analystic']/ancestor::div[@class='tabpane pullleft']")).click();
        driver.findElement(By.xpath("(//button[contains(text(),'click')])[2]")).click();
        String parentid = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        System.out.println(allwindows);

//        for(String s: allwindows){
//            if(!s.contentEquals(parentid)){
//                driver.switchTo().window(s);
//                driver.findElement(By.linkText("BLOG")).click();
//                System.out.println(driver.getTitle());
//                driver.close();
//            }
//        }
//        driver.switchTo().window(parentid);
//        driver.findElement(By.id("bmwradio")).click();
//        driver.quit();
//    }
    }
}