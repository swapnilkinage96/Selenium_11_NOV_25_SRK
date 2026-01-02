package Selenium.testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(groups = "smoke")
    public void testp1(){
        Assert.assertTrue(true);
        System.out.println("Test p1");
    }
    @Test(dependsOnGroups = "smoke")
    public void testp2(){
        System.out.println("Test p2");
    }
    @Test
    public void testp3(){
        System.out.println("Test p3");
    }
    @Test
    public void testp4(){
        System.out.println("Test p4");
    }
    @Test
    public void testE(){
        System.out.println("Test E");
    }
}
