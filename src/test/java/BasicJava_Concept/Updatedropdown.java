package BasicJava_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Updatedropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //   driver.findElement(By.xpath("//button[text()='Practice']/following-sibling::button[1]")).click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //select dropdown with select class
        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.id("hrefIncAdt")).click();
        int i = 1;
//      while (i<5){
//          driver.findElement(By.id("hrefIncAdt")).click();//4 times
//          i++;
//      }
        for (int j=1; j < 5; j++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        // Select dropdown=new Select(staticdropdown);
        driver.quit();
    }
}
