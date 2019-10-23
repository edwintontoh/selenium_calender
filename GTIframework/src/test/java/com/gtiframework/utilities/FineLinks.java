package com.gtiframework.utilities;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FineLinks {
    private WebDriver driver;

    public static List<WebElement> clicableElelementt(WebDriver driver) {

        List<WebElement> linksToClick = new ArrayList<WebElement>();
        List<WebElement> element = driver.findElements(By.tagName("a"));
        element.addAll(driver.findElements(By.tagName("img")));

        for (WebElement e : element) {
            if (e.getAttribute("href") != null)
            // if element in the list has href which is not null add it to links to click
            {
                linksToClick.add(e);
            }
        }
        return linksToClick;

    }

    //check link status
    public static String linkStatus(URL url) {
        try {
            HttpURLConnection http = (HttpURLConnection) url.openConnection();//cast to http and openconnection
            http.connect(); //connect to http
            String responseMessage = http.getResponseMessage(); //save reponse message to string
            http.disconnect();//disconenct once you get response

            return responseMessage; //return string

        } catch (Exception e) {
            return e.getMessage();
        }
    }



}
