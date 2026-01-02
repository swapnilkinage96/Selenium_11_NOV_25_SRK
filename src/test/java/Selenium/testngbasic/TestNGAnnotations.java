package Selenium.testngbasic;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("Beforesuite");
    }

    @AfterSuite
    public void aftersuite()
    {
        System.out.println("Aftersuite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("AfterTest");
    }

    @BeforeMethod
    public void beforemethod()
    {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void aftermethod()
    {
        System.out.println("AfterMethod");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("afterclass");
    }

    @BeforeClass
    public void Beforeclass()
    {
        System.out.println("Beforclass");
    }
    @Test
    public void Test1()
    {
        System.out.println("Test 1");
    }
    @Test
    public void Test2()
    {
        System.out.println("Test 2");
    }
    @Test
    public void Test3()
    {
        System.out.println("Test 3");
    }


}

