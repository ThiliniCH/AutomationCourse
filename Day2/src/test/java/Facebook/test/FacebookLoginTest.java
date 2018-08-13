package Facebook.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FacebookLoginTest {

    static WebDriver driver;


    @BeforeMethod
    public void setUp() {


        /* block chrome notifications*/
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Material\\chromedriver.exe");

        /*create web driver object */
        driver = new ChromeDriver(options);

        /*maximize the window */
        driver.manage().window().maximize();

        /*go to this page */
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void loginSuccess() throws InterruptedException {

        /*enter user name*/
        driver.findElement(By.id("email")).sendKeys("tpbatchus2@gmail.com");
        /*enter password*/
        driver.findElement(By.id("pass")).sendKeys("tp@12345");
        /*click on login button*/
        driver.findElement(By.id("loginbutton")).click();

        //wait until element presence
        waitForElement(By.className("_1vp5"), 30);

        /*Verify login success scenario*/

        //from page source
        //Assert.assertTrue(driver.getPageSource().contains("Welcome to Facebook, Tp"));

        //from class name
        String profileName = driver.findElement(By.className("_1vp5")).getText();
        Assert.assertEquals(profileName, "Tp", "failed user login");

        // click on left arrow
        driver.findElement(By.id("userNavigationLabel")).click();

        //wait until element presence
        waitForElement(By.linkText("Log Out"), 20);
        // click on logout button
        driver.findElement(By.linkText("Log Out")).click();

    }

    @AfterMethod

    public void tearDown() {
        //  driver.quit();
    }


    private WebElement waitForElement(By locator, int timeOut) {
        WebElement element = new WebDriverWait(driver, timeOut).until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }
}
