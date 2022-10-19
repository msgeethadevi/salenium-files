package com.basics.TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {

    //Invocation count is used in TestNG to provide the number of times a test is to be executed

    @Test(invocationCount = 3)
    public void mySum(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("The Sum is " + sum);

    }
}
