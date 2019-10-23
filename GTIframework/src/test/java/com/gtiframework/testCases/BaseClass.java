package com.gtiframework.testCases;

import com.gtiframework.utilities.ReadConfig;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.logging.Logger;
//import org.apache.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import java.io.IOException;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.testng.annotations.Test;


//the base class defines all actions that repeats all the time
public class BaseClass {
    public static final Logger log = LogManager.getLogger(TC_LoginText_001.class.getName()); //initiate logger and tell what class we want to get login


    //create object of Readconfig to use class
    ReadConfig myconfig = new  ReadConfig();
    //below is common items in every test so goes in baseclassm
    public String  baseUrl = myconfig.getApplicationUrl();
   // public String baseUrl2 = myconfig"https://targetjobs.co.uk/user";
    public String useremail = myconfig.getEmail();
    public String userpassword = myconfig.userpassword();
    public static WebDriver driver;
    //public static Logger logger;


    public BaseClass() throws IOException {
    }

    @Parameters("browser")
    @org.testng.annotations.BeforeClass
    public void setup(String br)
    {

        if (br.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Drivers//chromedriver");
            driver = new ChromeDriver();

        }
        else if (br.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "//Drivers//geckodriver 2");
            driver = new FirefoxDriver();
        }
        driver.get(baseUrl);




        //logger = LogManager.getLogger(BaseClass.class);

        //logger =logger.getLogger("devpinoyLogger"); //setup the logger class
        //PropertyConfigurator.configure("Log4j.properties"); //file to write logs into
        //logger.debug("tes");
        //logger.error("test new logger");
        log.info("new log");



    }


    @org.testng.annotations.AfterClass
    public void tearDown()
    {
        driver.quit();

    }





}
