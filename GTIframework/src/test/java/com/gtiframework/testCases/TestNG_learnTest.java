package com.gtiframework.testCases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_learnTest {


    @Test
    public void test()
    {
        System.out.println("test");
        Assert.assertTrue(names().contains("na"));
        System.out.println(test2());
        Assert.assertTrue(test2().contains("d"));

    }
    @BeforeMethod
    public void setUp() {
        System.out.println("before");
    }


    @AfterMethod
    public void tearDown() {
        System.out.println("after");
    }







    public String names()
    {
        String name = "nana";
        return name;
    }

    public String test2()
    {
        String[] myarray = {"edin"};
        for (String b: myarray)
        {
            return b;
        }

        return null;
    }

}







