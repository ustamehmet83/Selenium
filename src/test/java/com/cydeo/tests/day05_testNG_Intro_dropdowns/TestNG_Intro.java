package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNG_Intro {
    @BeforeClass
    public void setupMethod() {
        System.out.println("----->BeforeClass is running");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("----->AfterClass is running");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("--->BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("--->AfterMethod is running!");

    }

    @org.testng.annotations.Test(priority = 1)
    public void test1() {
        System.out.println("Test 1 is running....");
        //ASSERT EQUALS: compare 2  of the same things
        String actual="apple";
        String expected="apple";
        Assert.assertEquals(actual,expected);

    }


    @org.testng.annotations.Test(priority = 2)
    public void test2() {
        System.out.println("Test 2 is running....");
        String actual="apple";
        String expected="apple";
        Assert.assertTrue(actual.equals(expected));
    }








}
