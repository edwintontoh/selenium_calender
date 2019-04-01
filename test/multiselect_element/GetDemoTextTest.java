package multiselect_element;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class GetDemoTextTest {
    WebDriver driver;
    String baseURL;
    @Before
    public void setUp() throws Exception {
        baseURL = "https://learn.letskodeit.com/p/practice";
        System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
        driver = new ChromeDriver();

    }

    @Test
    public void test() throws Exception{
        driver.get(baseURL);
        WebElement my_text = driver.findElement(By.xpath("//input[@id='name']"));
        my_text.sendKeys("hello");
        String myattribute = my_text.getTagName();
        System.out.println(myattribute);
        //String text = my_text.getText();
       // String textb = "Select Class Example";
        //assertEquals(text,textb);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}