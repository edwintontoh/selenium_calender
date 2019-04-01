package learningSele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class navigating_betweenPagesTest {

    WebDriver driver;
    String baseURL;
    @Before
    public void setUp() throws Exception {
        baseURL= "http://letskodeit.teachable.com";
        System.setProperty("webdriver.chrome.driver","/Users/ed/Documents/selenium java/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
    }

    @Test
    public void test() throws Exception{

        driver.get(baseURL);
        String title = driver.getTitle();
        String currentURL = driver.getCurrentUrl();
        System.out.println("current title of page is:" + title);
        System.out.println("current url is:" + currentURL);
        String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
        driver.navigate().to(urlToNavigate);
        System.out.println("Navigate to Login");

        currentURL = driver.getCurrentUrl();
        System.out.println("current url is:" + currentURL);
        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("navigate back");
        currentURL = driver.getCurrentUrl();
        System.out.println("current url is:" + currentURL);
        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("navigate forward");
        currentURL = driver.getCurrentUrl();
        System.out.println("current url is:" + currentURL);
        Thread.sleep(2000);


        driver.navigate().back();
        System.out.println("navigate back");
        currentURL = driver.getCurrentUrl();
        System.out.println("current url is:" + currentURL);
        Thread.sleep(2000);

        driver.navigate().refresh();
        System.out.println("refresh page");
        driver.get(currentURL);
        System.out.println("refresh page");


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}