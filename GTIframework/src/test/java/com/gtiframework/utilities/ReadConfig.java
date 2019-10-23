package com.gtiframework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadConfig {

    Properties pro; //create object of property class


    public ReadConfig() throws IOException { //consturction to init class
        try {


            File src = new File(".//Configuration//configuration.properties"); //setup file location
            FileInputStream fis = new FileInputStream(src); //reading data prom path
            pro = new Properties();
            pro.load(fis); //load and read data in file after opening using fireinputstreem
        }
        catch (Exception e) //incase file not aviable in destination throw error
        {
            System.out.println("Exception is " + e.getMessage());
        }

    }
    //methods below read value in file

    public String getApplicationUrl()
    {
        String base = pro.getProperty("baseUrl"); //get value of baseurl string in file
        return base;
    }

    public String getEmail()
    {
        String email = pro.getProperty("useremail");
        return email;
    }


    public String userpassword()
    {
        String password = pro.getProperty("userpassword");
        return password;
    }


    public String chromePath()
    {
        String chromepath = pro.getProperty("chrompath");
        return chromepath;
    }

    public String firePath()
    {
        String frirepath = pro.getProperty("ffpath");
        return frirepath;
    }

}
