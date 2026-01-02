package Selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Bootstrapdropdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/bootstrap-dual-list-box-demo");
        driver.findElement(By.xpath("(//input[@name='SearchDualList'])[1]"));
        List<WebElement> allelements=driver.findElements(By.xpath("//ul[@class=\"list-group sp_list_group mb-20 mt-10\"]//child::li"));
        for(WebElement e:allelements){
           if(e.getText().trim().equalsIgnoreCase("Danville")){
               e.click();
               break;

           }
            driver.findElement(By.xpath("(//button[contains(@class,'block')])[1]")).click();

        }
    }
}
