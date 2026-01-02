package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetAllvaluesfromDropdown {
    public static void main(String[] args) {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        WebElement Dropdown = driver.findElement(By.xpath("//select[@id='carselect']"));
        Select s = new Select(Dropdown);
        List<WebElement> allelements = s.getOptions();
        for (WebElement a : allelements) {
            System.out.println(a.getText());
        }
        driver.close();
    }
}
