package BasicJava_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Autosuggestiondropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //   driver.findElement(By.xpath("//button[text()='Practice']/following-sibling::button[1]")).click();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        //driver.findElement(By.xpath("//a[contains(text(),\"India\")]/parent::li/parent::ul[@id=\"ui-id-1\"]")).click();
        List<WebElement> options=driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/child::li"));
        for(WebElement option:options){
            if(option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }
        driver.quit();
    }
}
