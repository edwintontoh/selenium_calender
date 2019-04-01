package myFrameWork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class frameWorkTestTest {

    private String baseURL;
    private WebDriver driver;
    private frameworkListofElement edwin;
    private GenericMethod gm;
    private test names;
    String yourname;




    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        baseURL = "https://learn.letskodeit.com/p/practice";
        edwin = new frameworkListofElement(driver);
        gm = new GenericMethod(driver);
        yourname = "Ed";
        names = new test(yourname);
    }


    @Test
    public void test1()throws Exception{
        driver.get(baseURL);
        boolean result1 = gm.isElementPresent("//input[@type=\"radio\"]","xpath");
        System.out.println("Is element present:" + result1);

       // names.displayName("Ed","Yaw");
        String testing = names.displayName("Ed","yaw");
        System.out.println(testing);


        //System.out.println(names);
        //boolean mylistelement = gm.findElementList("//input[@type=\"radio\"]","xpath");
        //boolean result = gm.findElementList("name", "id");
        //boolean result2 = gm.findElementList("not present", "id");

    }

    @Test
    public void test() throws InterruptedException {
        boolean ischeck =false;
        driver.get(baseURL);
        //WebElement ed = edwin.isElementPresent("enter-name","name");
        //List<WebElement> myList = edwin.getElementList("//input","xpath");
        //System.out.println(myList.size());
        //WebElement test = edwin.ElementFine("//input[@type=\"radio\"]","xpath");

        List<WebElement> testb = edwin.getElementList("//input[@type=\"radio\"]","xpath");
        int size = testb.size();
        for (WebElement a:testb)
        {
            ischeck = a.isSelected();
            if (!ischeck) {

                a.click();

            }
            System.out.println(a.getText());
        }

        Thread.sleep(500);





       // WebElement el = edwin.ElementFine("//input[@id='name']","xpath");
        //el.sendKeys("edwin");
    }

    @After
    public void tearDown()  {

        driver.quit();
    }
}