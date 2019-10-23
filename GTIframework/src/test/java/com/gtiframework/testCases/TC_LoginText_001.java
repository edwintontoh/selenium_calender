package com.gtiframework.testCases;

import com.gtiframework.pageObjects.LoginPage;
import com.gtiframework.utilities.FineLinks;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//import org.junit.Test;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class TC_LoginText_001  extends BaseClass{


    public TC_LoginText_001() throws IOException {
    } //inherite all properties of baseclass



    @org.testng.annotations.Test
    public void test()
    {


        //driver.get(baseUrl);
        LoginPage login_page = new LoginPage(driver); //initiate loginpage class
        login_page.setUserEmail(useremail);
        //info("Enter email");
        log.info("Enter email");
        login_page.setPassword(userpassword);
        log.info("Enter password");
        login_page.login_btn();
        String page_title =driver.getTitle();


        if (driver.getTitle().equals(page_title))
        {

            assertTrue(true);
            log.info("login test pass");
        }
        else {
            assertTrue( false);
           log.info("login test fail");

        }

        //find all links on a page script
        List<WebElement> linklist = FineLinks.clicableElelementt(driver);
        for (WebElement link: linklist )
        {
            String href = link.getAttribute("href");

            try {
                System.out.println("URL" + href   +  "returned" + FineLinks.linkStatus(new URL(href)));

            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }



    }

}
