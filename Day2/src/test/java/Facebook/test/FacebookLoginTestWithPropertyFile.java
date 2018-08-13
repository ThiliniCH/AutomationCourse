package Facebook.test;

import facebook.FBHomePage;
import facebook.FBLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;


public class FacebookLoginTestWithPropertyFile {
        //initialize the driver. null driver
        static WebDriver driver;

        //create object of a property file reader to access its data
        PropertyFileReader prop = new PropertyFileReader();

        //access data from property file
        String url = prop.getProperty("config", "url");
        String chromePath = prop.getProperty("config", "chrome.driver.path");
        String userName = prop.getProperty("config", "userName");
        String password = prop.getProperty("config", "password");


        @BeforeMethod
        public void setUp() {


            /* block chrome notifications*/
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("disable-infobars");
            System.setProperty("webdriver.chrome.driver", chromePath);

            /*create web driver object */
            driver = new ChromeDriver(options);

            /*maximize the window */
            driver.manage().window().maximize();

            /*go to this page */
            driver.get(url);
        }

        @Test
        public void loginSuccess() throws InterruptedException {
            FBLoginPage login = new FBLoginPage();
            login.loginSuccess(driver, userName, password);

            FBHomePage home = new FBHomePage();
            home.logout(driver);


            //wait until element presence
            waitForElement(driver, By.className("_1vp5"), 30);

            /*Verify login success scenario*/
            //from class name
            String profileName = driver.findElement(By.className("_1vp5")).getText();
            Assert.assertEquals(profileName, "Tp", "failed user login");

        }

        @AfterMethod

        public void tearDown() {
            //  driver.quit();
        }


        private WebElement waitForElement(WebDriver driver, By locator, int timeOut) {
          WebElement element = new WebDriverWait(driver, timeOut).until(ExpectedConditions.presenceOfElementLocated(locator));
           return element;
      }
    }


