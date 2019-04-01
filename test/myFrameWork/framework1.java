package myFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class framework1 {
    WebDriver driver;


    public  framework1 (WebDriver driver)
    {
        this.driver = driver;
    }


    public WebElement ElementFine(String locator, String type) //locator is the webelement find on site the id or xpath name
    {

        type = type.toLowerCase();
        if (type.equals("id"))
        {
            System.out.println("element found with id:" + type);//type is the id,xpath or css
            //pass the string locator as the id
            return this.driver.findElement(By.id(locator));
        }

        else if (type.equals("name"))
        {
            System.out.println("element found with name: "+ type);
            return this.driver.findElement(By.name(locator));
        }

        else if(type.equals("xpath"))
        {
            System.out.println("element found with xpath:" + type);
            return this.driver.findElement(By.xpath(locator));
        }


        else if (type.equals("xpath")) {
            System.out.println("element found with xpath:" + type);
            return this.driver.findElement(By.partialLinkText(locator));
        }


        else if (type.equals("css")) {
            System.out.println("element found with css:" + type);
            return this.driver.findElement(By.cssSelector(locator));
        }


        else {
            System.out.println("wrong webelement provided:");
            return null;
        }


    }





    }


