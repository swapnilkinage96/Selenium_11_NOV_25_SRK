package BasicJava_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //   driver.findElement(By.xpath("//button[text()='Practice']/following-sibling::button[1]")).click();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.findElement(By.id("autosuggest")).sendKeys("ind");
        driver.findElement(By.id("name")).sendKeys("Helo");
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.quit();
    }

}
