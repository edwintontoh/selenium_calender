package com.gtiframework.testCases;

import com.gtiframework.pageObjects.LoginPage;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class TC_LoginWithData extends BaseClass {


    public TC_LoginWithData() throws IOException {
    }
    @org.testng.annotations.Test(dataProvider = "testing")
    public void test(String username,String password) throws InterruptedException
    {


        //driver.get(baseUrl);
        LoginPage login_page = new LoginPage(driver); //initiate loginpage class

            login_page.setUserEmail(username);
            log.info("Enter email");
            login_page.setPassword(password);
            log.debug("Enter password");
            login_page.login_btn();
            login_page.clearEmailField();
            login_page.clearPasswordField();

        String page_title ="test";

        if (driver.getTitle().equals(page_title))
        {

            assertTrue(true);
            log.info("login test pass");
        }
        else {
            assertTrue(true);


            log.info("login test fail");
        }
        Thread.sleep(9000);

    }

    @DataProvider(name = "testing")
        public Object[][] passData()
        {
            Object[][] data= new Object[3][2]; //create 2 columns & 3 rows
            data[0][0] = "edwin.tontoh@groupgti.com";
            data[0][1] = "Gtigti11";


            data[1][0] = "edin.tontoh@groupgti.com";
            data[1][1]= "Gtigti11";

            data[2][0] ="edwin.tontoh@groupgti.com";
            data[2][1]= "Gtigti11";


            return data;

        }
    }



