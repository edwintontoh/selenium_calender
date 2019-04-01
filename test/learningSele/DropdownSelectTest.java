package learningSele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.*;

public class DropdownSelectTest {
    String baseURL;
    WebDriver driver;

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
        driver = new ChromeDriver();
        baseURL = "https://learn.letskodeit.com/p/practice";





    }



    @Test
    public void test() throws InterruptedException {
        driver.get(baseURL);

        WebElement element = driver.findElement(By.id("carselect"));
        Select sel = new Select(element);

        sel.selectByValue("benz");
        sel.selectByIndex(2);
        sel.selectByVisibleText("BMW");

        List<WebElement> options = sel.getOptions();

        int myOption = options.size();
        for (int i=0;i<myOption;i++)
        {
            String Getsnames = options.get(i).getText();
            System.out.println(Getsnames);
        }






    }
    @After
    public void tearDown() throws Exception {
        Thread.sleep(200);
        driver.quit();
    }
}


