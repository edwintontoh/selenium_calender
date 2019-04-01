package learningSele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class my_testTest {
    WebDriver driver;
    String currentTitle;
    String nextPage;
    WebElement edwin;


    @Before
    public void before()
    {
        System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
        driver = new ChromeDriver();

    }
    @Test
    public void test()
    {

        driver.get("http://google.com");
        currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        driver.findElement(By.name("q")).sendKeys("bbc.co.uk/sports");
        driver.findElement(By.name("btnK")).submit();
        nextPage = driver.getTitle();
        System.out.println(nextPage);
        driver.findElement(By.xpath("//h3[contains(text(),'Home - BBC Sport')]")).click();
        driver.navigate().back();

        String t = driver.getTitle();
        System.out.println(t);
        assertEquals("bbc.co.uk/sports - Google Search",driver.getTitle());

        //driver.navigate().back();
    }




    @After
    public void down()
    {
    driver.close();
    }

    //WebDriver driver;
   // String baseUrl;

    //@Before
    //public void setup()
    //{
      //  driver = new FirefoxDriver();
        //baseUrl="www.google.com";
    //}


}