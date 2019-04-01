package myFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    WebDriver driver;

    public GenericMethod(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> findElementList(String locator, String type) {
        type = type.toLowerCase();
        List<WebElement> elementList = new ArrayList<WebElement>();
        if (type.equals("xpath")) {
            elementList = this.driver.findElements(By.xpath(locator));
        } else if (type.equals("id")) {
            elementList = this.driver.findElements(By.id(locator));
        } else if (type.equals("css")) {
            elementList = this.driver.findElements(By.cssSelector(locator));

        } else if (type.equals("linktext")) {
            elementList = this.driver.findElements(By.linkText(locator));

        } else if (type.equals("tagname")) {
            elementList = this.driver.findElements(By.tagName(locator));
        } else if (type.equals("name")) {
            elementList = this.driver.findElements(By.name(locator));
        } else if (type.equals("classname")) {
            elementList = this.driver.findElements(By.className(locator));
        } else if (type.equals("partiallinktext")) {
            elementList = this.driver.findElements(By.partialLinkText(locator));
        } else {
            System.out.println("locator type not supported");
        }
        if (elementList.isEmpty()) //check if element is empty
        {
            System.out.println("element not found with" + type + " :" + locator);
        }
        else
        {
            System.out.println("element found with" + type + ": " + locator);
        }
        return elementList; //return list of elements

    }

    public boolean isElementPresent (String locator,String type)
    {
        List<WebElement> test = findElementList(locator,type);

        int size = test.size();
        if (size >0)
        {
            return true;

        }
        else {
            return false;
        }
    }
}
