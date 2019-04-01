package learningSele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class finding_disable_elementTest {

    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
    //System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    baseURL = "https://learn.letskodeit.com/p/practice";
    }



    @Test
    public void test() throws Exception{
        boolean isChecked = false;
        //System.out.println("hello");
        driver.get(baseURL);
        //WebElement ele = driver.findElement(By.id("bmwradio"));
        //ele.click();
        //System.out.println(ele.isSelected());
       // List<WebElement> radiobutton = driver.findElements(By.name("cars"));
        //List<WebElement> radiobutton = driver.findElements(By.name("cars"));

        List<WebElement> radioButtons = driver.findElements(By.name("cars")); //create a list array of radiobutton
        int size = radioButtons.size(); //find size of list
        System.out.println(size); //display number of radiobuttons

        for(int i =0;i<size;i++) //loop through the arrays or list using the size
        {
            isChecked = radioButtons.get(i).isSelected(); //copy the condidtion of button into a boolean var

            if(!isChecked) //check the state of button selected or not
            {
                radioButtons.get(i).click(); //if condition is true select radiobutton
            }
        }

        Thread.sleep(2000);

    }
    @After
    public void tearDown() throws Exception {
        driver.quit();

    }
}