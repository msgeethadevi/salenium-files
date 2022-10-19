package com.basics.TestNG;

import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithPriority {

    @Test(priority = 1, description = "Signup")
    public void signUp(){
        System.out.println("Signing up and creating an account");
    }

    @Test(priority = 2, description = "Login")  // we will get this discription in emailable report
    public void login(){
        System.out.println("login into account");
    }

    @Test(priority = 3)
    public void bookTicket(){
        System.out.println("Book flight ticket");
    }

    @Test(priority = 4)
    public void checkOut(){
        System.out.println("Make payment & checkout");
    }

    @Test(priority = 5)
    public void failedTest(){
        Assert.assertEquals(1,1);
    }

}

