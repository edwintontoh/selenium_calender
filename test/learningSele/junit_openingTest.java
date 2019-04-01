package learningSele;

import javafx.beans.property.SetProperty;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class junit_openingTest {

    WebDriver driver;
    String baseURL;

    /*public void tes1(By edwin)
    {
        WebElement testing = driver.findElement(edwin);
    }*/

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
        driver = new ChromeDriver();
        baseURL = "http://letskodeit.teachable.com";
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        Thread.sleep(3000);
    }

    @Test
    public void test()
    {
        System.out.println("hi");
        driver.get(baseURL);



    }
    @After
    public void tearDown() throws Exception {
      System.out.println("hi2");
      driver.quit();
    }

}