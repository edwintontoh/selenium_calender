package learningSele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.*;

public class WebElement_loopTest {

    WebDriver driver;
    String baseURL;
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
        driver = new ChromeDriver();

        baseURL="https://learn.letskodeit.com/p/practice";

    }


    @Test
    public void test() throws InterruptedException {
        boolean isChecked=false;
        driver.get(baseURL);

        List<WebElement> radioButtons = driver.findElements(By.name("cars"));
        int size = radioButtons.size();

        for(int i =0; i<size;i++)
        {
            isChecked = radioButtons.get(i).isSelected();
            if(!isChecked)
            {
                radioButtons.get(i).click();
            }
        }


    }


    @After
    public void tearDown() throws Exception {
        Thread.sleep(200);
        driver.quit();
    }

}

