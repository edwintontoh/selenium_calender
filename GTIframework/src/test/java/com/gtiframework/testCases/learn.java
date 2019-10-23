package com.gtiframework.testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.ArrayList;
import java.util.List;


public class learn {

    WebDriver driver;
    String baseUrl ="https://www.google.com";

    private static final Logger log = LogManager.getLogger(learn.class.getName()); //initiate logger and tell what class we want to get login


    public static void main (String[] args)
    {
        log.debug("edwin");
        log.info("tt");
    }
    @BeforeClass
    public void setUp()
    {
        System.out.println("setup");
        log.debug("debut message log");
        log.error("error message log");
        log.fatal("te");


        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver");
        //driver = new ChromeDriver();
    }


    @Test
    public void test()
    {
        System.out.println("test");
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(false,"testing soft assert");
        System.out.println("software");
        assertion.assertAll();
        // driver.get(baseUrl);

    }

    @Test
    public void test2()
    {
        Assert.assertTrue(true);
    }

    @Test
    public void test11()
    {
        Assert.assertTrue(false);
    }
    @Test
    public void testing()
    {
        //driver.get(baseUrl);

    }


    @AfterClass
    public void after()
    {
        System.out.println("quit");
        //driver.quit();
    }




}
