package Amazonwebsite_praticequestion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

import static Selenium.testngbasic.TestngExample.driver;

public class SearchMobilephonepric {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().logs();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.amazon.in/ref=nav_logo");
        WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchbox.sendKeys("Mobile Phones");
        WebElement searchbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        Thread.sleep(2000);
        searchbutton.click();
//         ecuteScript("scrollBy.window(0,400)");
        List<WebElement> priceelements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        Map<WebElement, Integer> map = new HashMap<WebElement, Integer>();
        for (int i = 0; i < priceelements.size(); i++) {
            if (priceelements.get(i).getText() != "") {
                map.put(priceelements.get(i), Integer.parseInt(priceelements.get(i).getText().replaceAll(",", "")));
            }
            driver.quit();

        }
        // List<Map.Entry<WebElement,Integer>> le=new ArrayList<map>;
    }
}
