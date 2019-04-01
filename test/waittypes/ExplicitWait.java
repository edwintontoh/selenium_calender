package waittypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class ExplicitWait {
    String baseurl;
    WebDriver driver;
    GenericmethodWait wt;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        baseurl = "https://learn.letskodeit.com/p/practice";
        wt = new GenericmethodWait(driver); //innitiaze contrutor
       // wt.implicitWait();

    }

    @Test
    public void test(){
        driver.get(baseurl);
        WebElement myLogin = driver.findElement(By.linkText("Login"));
        myLogin.click();

        //WebElement waitelement;
        //waitelement = wt.waitMethod(By.id("user_email"),3);
        //waitelement.sendKeys("test");
        WebElement test = driver.findElement(By.id("user_email"));
        test.sendKeys("testing");





    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}