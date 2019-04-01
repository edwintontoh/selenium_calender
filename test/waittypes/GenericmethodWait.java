package waittypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GenericmethodWait {

    WebDriver driver;

    public GenericmethodWait(WebDriver driver)
    {
        this.driver =driver;
    }

    public WebElement waitMethod (By locator, int timeout)
    {
        WebElement element =null;
        try {
            System.out.println("waiting for max ::" + timeout + "seconds for element to be available");
            WebDriverWait mywait = new WebDriverWait(driver,timeout);
            element = mywait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("element appeared on the web page");

        }
        catch (Exception e) {


            System.out.println("element not found");
        }
        return element;
    }

    public void implicitWait()
    {
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }


}
