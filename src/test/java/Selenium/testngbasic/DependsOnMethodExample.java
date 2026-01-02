package Selenium.testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {
    @Test(priority=1,invocationCount = 5,invocationTimeOut = 1)//one test run mutliple time then invocation count used
    public void verifyloginpage(){
        Assert.assertTrue(false);
        System.out.println("Test A");
    }
    @Test(invocationTimeOut = 5,dependsOnMethods = "verifyloginpage")
    public void VerifyHomePage(){
        System.out.println("Test B");
    }
    @Test(invocationTimeOut = 5,dependsOnMethods = "VerifyHomePage")
    public void verifyOnBoarding(){
        System.out.println("Test B");
    }
}
