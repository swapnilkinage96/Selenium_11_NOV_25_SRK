package Selenium.testngbasic;

import org.testng.annotations.Test;

public class Invocation {

    @Test(priority=1,invocationCount = 5,invocationTimeOut = 1)//one test run mutliple time then invocation count used
    public void testA(){
        System.out.println("Test A");
    }
    @Test(invocationTimeOut = 5)
    public void testB(){
        System.out.println("Test B");
    }
}
