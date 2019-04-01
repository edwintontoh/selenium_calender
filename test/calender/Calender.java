package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import waittypes.GenericmethodWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calender {
    String baseurl;
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);

        baseurl = "https://www.expedia.com";


    }

    @Test
    public void test(){

        driver.get(baseurl);
        WebElement element = driver.findElement(By.id("package-departing-hp-package")); //click on calender
        element.click();


        WebElement testing = driver.findElement(By.xpath("//div[@class='datepicker-cal']//div[2]")); //find the calender elemtn

        List<WebElement>allValideDate = testing.findElements(By.tagName("button"));//find date element tag


        for (WebElement d: allValideDate) //loop through the calender
        {
            if (d.getText().contains("30")) //check if calender has 26 as the date
            {

                d.click(); //click on the date
                WebElement retuner = driver.findElement(By.id("package-returning-hp-package"));
                retuner.click();
                WebElement testings = driver.findElement(By.xpath("//div[@class='datepicker-cal show-second-month']//div[3]"));
                testing.clear();
                List<WebElement>allValideDate2 = testings.findElements(By.xpath("//div[@class='datepicker-cal']//div[3]//table[1]//tbody[1]//tr[4]//td[3]//button[1]"));//find date element tag
                for (WebElement te: allValideDate2)
                {

                    if(te.getText().contains("23"))
                    {
                        System.out.println("yes");
                    }
                }



           }

        }



        /*WebElement testings = driver.findElement(By.xpath("//div[@class='datepicker-cal show-second-month']//div[3]//")); //find the calender elemtn

        List<WebElement>allValideDate2 = testings.findElements(By.tagName("button"));//find date element tag

            //div[@class='datepicker-cal show-second-month']//div[3]//

            for (WebElement d: allValideDate2) //loop through the calender
            {
                if (d.getText().contains("23")) //check if calender has 26 as the date
                {

                    System.out.println(d);
                    d.click(); //click on the date

                    //System.out.println("yes");
                }

            }
            */






    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(200);
        //driver.quit();
    }
}