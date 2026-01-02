package BasicJava_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DyanamicDropdown {
    public static void main(String[] args) {
        //static dropdown
        //Dyanamic dropdown
        WebDriver driver = new ChromeDriver();
        // driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //   driver.findElement(By.xpath("//button[text()='Practice']/following-sibling::button[1]")).click();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("(//a[@value=\"BLR\"])[1]")).click();
        driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();
//parent to child
        driver.findElement(By.xpath("//a[@value=\"MAA\"]//ancestor::div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//child::li[@class=\"city_selected \"]/a")).click();
        driver.findElement(By.xpath("(//div[@class=\"dropdownDiv\"]//li//child::a[text()=\" Coimbatore (CJB)\"])[1]")).click();
        driver.quit();
    }
}
