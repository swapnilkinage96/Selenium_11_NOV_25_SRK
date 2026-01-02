package Selenium.testngbasic;

import org.testng.annotations.*;

public class PriorityExample {

    @Test(priority=1,description = "Verify login test case")
    public void testA(){
        System.out.println("Test A");
    }
    @Test
    public void testB(){
        System.out.println("Test B");
    }
    @Test(enabled = false)
    public void testC(){
        System.out.println("Test C");
    }
    @Test(priority=-2)
    public void testD(){
        System.out.println("Test D");
    }
    @Test
    public void testE(){
        System.out.println("Test E");
    }
}
