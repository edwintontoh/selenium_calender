package multiselect_element;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;


public class multiselect_dropdownTest {

    WebDriver driver;
    String baseURL;



    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
        driver =  new  ChromeDriver();
        baseURL = "https://learn.letskodeit.com/p/practice";
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

    }

    //@Test
    public void test() throws InterruptedException {
        driver.get(baseURL);
        WebElement elem = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(elem);

        sel.selectByVisibleText("Apple");
        sel.selectByIndex(1);
        sel.selectByVisibleText("Peach");


        List<WebElement> myElement = sel.getAllSelectedOptions();
        for (WebElement option : myElement)
        {
            System.out.println(option.getText());
        }

        Thread.sleep(500);


        System.out.println("testing");
    }


    @Test
    public void test1() throws Exception{
        boolean ischeck=false;
        driver.get(baseURL);
        List<WebElement> myelemnt = driver.findElements(By.name("cars"));

        int mysize = myelemnt.size();
        for (WebElement testing:myelemnt)
        {
            //myelemnt.get(testing).isSelected();
            ischeck = testing.isSelected(); //save the stage of isSelected to boolean variable
            if (!ischeck) //if is not selected
            {
                testing.click(); //click everything button
                System.out.println(testing.getText()); //display name of buttons
            }
            //System.out.println(testing.isSelected());
        }

        //Select sel = new Select(myelemnt);


        //sel.selectByIndex(1);

       // List<WebElement> mylist = myelemnt.


    }
    @After
    public void tearDown() throws Exception {

        driver.quit();
    }
}