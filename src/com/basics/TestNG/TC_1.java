package com.basics.TestNG;

import org.testng.annotations.*;

public class TC_1 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("I execute before every class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I execute after every class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Executes before every method...");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Executes after every method...");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }

}


