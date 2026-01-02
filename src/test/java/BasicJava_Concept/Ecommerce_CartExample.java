package BasicJava_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Ecommerce_CartExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //   driver.findElement(By.xpath("//button[text()='Practice']/following-sibling::button[1]")).click();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String[] itemsNeeded={"Cucumber","Brocollie"};
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText();

            if (name.contains("Cucumber")) {
                driver.findElements(By.xpath("//button[text()=\"ADD TO CART\"]")).get(i).click();
                break;
            }
            driver.close();
        }
    }
}
