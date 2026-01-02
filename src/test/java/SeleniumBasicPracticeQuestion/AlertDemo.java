package SeleniumBasicPracticeQuestion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        //driver.findElement(By.xpath("//a[@class='analystic']/ancestor::div[@class='tabpane pullleft']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Alert a=driver.switchTo().alert();
        System.out.println(  a.getText());
        Thread.sleep(2000);
        a.accept();


        driver.quit();
    }
}

