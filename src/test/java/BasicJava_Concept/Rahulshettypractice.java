package BasicJava_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rahulshettypractice {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     //   driver.findElement(By.xpath("//button[text()='Practice']/following-sibling::button[1]")).click();
        driver.manage().window().maximize();
        //select dropdown with select class
        WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown=new Select(staticdropdown);
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        System.out.println(dropdown.getOptions());

        dropdown.selectByIndex(1);
        dropdown.selectByValue("USD");

        driver.quit();

    }
}
