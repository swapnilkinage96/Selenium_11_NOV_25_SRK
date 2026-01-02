package Amazonwebsite_praticequestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class SearchIphonelist {
    public static void main(String[] args) {
        //((//div[@data-component-type="s-search-result"])[1]//h2//span[contains(text(),'Fastrack')])[2]
        //((//div[@data-component-type="s-search-result"])//img)[1]

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/ref=nav_logo");
        driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Iphone");
        driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
        List<WebElement> alliphoneresult = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        for (int i = 0; i < alliphoneresult.size(); i++) {
            String text = alliphoneresult.get(i).getText();
            System.out.println(text);
        }
        String[] arr = {"50,990",
                "66,990",
                "1,54,900",
                "1,34,900",
                "1,50,900",
                "59,900",
                "1,34,900",
                "1,54,900",
                "1,31,900",
                "64,900",
                "52,990",
                "1,50,900",
                "1,49,900",
                "2,29,900",
                "1,49,900",
                "1,34,900",
                "1,89,900",
                "72,999",
                "299" };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
