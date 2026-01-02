package Selenium.Screenshots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screeenshot {
    public static void main(String[] args) throws IOException {

        ChromeOptions options=new ChromeOptions();
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File des=new File("C:\\Users\\Dell\\Pictures\\Screenshots\\Screenshot"+timestamp()+".png");
        FileHandler.copy(src,des);
        driver.quit();
    }
    public static  String timestamp(){
        return new SimpleDateFormat("yyyy-mm-dd HH-MM-SS").format(new Date());
    }

}
