package facebook.test;

import facebook.FacebookAttempt;
import facebook.FacebookHome;
import facebook.FacebookLogin;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Common;

import utils.PropertyFileReader;

public class FacebookLoginTest {

    //create object of a property file reader to access its data
    PropertyFileReader prop = new PropertyFileReader();

    //access data from property file
    String url = prop.getProperty("config", "url");
    String userName = prop.getProperty("config", "userName");
    String password = prop.getProperty("config", "password");
    String emptyUserName = prop.getProperty("config","emptyUserName");
    String emptyPassword = prop.getProperty("config","emptyPassword");
    String wrongUserName = prop.getProperty("config","wrongUserName");
    String wrongPassword = prop.getProperty("config","wrongPassword");

    @BeforeMethod
    public void setUp() {

        Common.getInstance().openBrowser();
        Common.getInstance().navigateToURL(url);

    }

    @Test (priority = 1)
    public void loginSuccess(){
        FacebookLogin loginPage = new FacebookLogin();
        FacebookHome homePage = loginPage.loginSuccess(userName,password);
        Common.getInstance().waitForElement(By.className("_1vp5"),20);
        Assert.assertEquals(homePage.getProfileName(),"Tp","Failed user login");
        homePage.logout();

    }

    @Test (priority = 2)
    public void loginUnSuccessWithEmptyUserNameandEmptyPassword(){
        FacebookLogin loginPage = new FacebookLogin();
        FacebookHome homePage = loginPage.loginSuccess(emptyUserName,emptyPassword);
        FacebookAttempt attempt = new FacebookAttempt();
       // Common.getInstance().waitForElement(By.className("_1vp5"),20);
        Assert.assertEquals(attempt.attempt(),"facebook.FacebookAttempt@27508c5d","Failed user login");
       // homePage.logout();

    }

    @Test (priority = 3)
    public void loginUnSuccessWithEmptyUserNameandCorrectPassword(){
        FacebookLogin loginPage = new FacebookLogin();
        FacebookHome homePage = loginPage.loginSuccess(emptyUserName,password);
        Common.getInstance().waitForElement(By.className("_1vp5"),20);
        Assert.assertEquals(homePage.getProfileName(),"Tp","Failed user login");
        homePage.logout();

    }

    @Test (priority = 4)
    public void loginUnSuccessWithCorrectUserNameandEmptyPassword(){
        FacebookLogin loginPage = new FacebookLogin();
        FacebookHome homePage = loginPage.loginSuccess(userName,emptyPassword);
        Common.getInstance().waitForElement(By.className("_1vp5"),20);
        Assert.assertEquals(homePage.getProfileName(),"Tp","Failed user login");
        homePage.logout();

    }

    @Test (priority = 5)
    public void loginUnSuccessWithWrongUserNameandWrongPassword(){
        FacebookLogin loginPage = new FacebookLogin();
        FacebookHome homePage = loginPage.loginSuccess(wrongUserName,wrongPassword);
        Common.getInstance().waitForElement(By.className("_1vp5"),20);
        Assert.assertEquals(homePage.getProfileName(),"Tp","Failed user login");
        homePage.logout();

    }

    @Test (priority = 6)
    public void loginUnSuccessWithCorrectUserNameandWrongPassword(){
        FacebookLogin loginPage = new FacebookLogin();
        FacebookHome homePage = loginPage.loginSuccess(userName,wrongPassword);
        Common.getInstance().waitForElement(By.className("_1vp5"),20);
        Assert.assertEquals(homePage.getProfileName(),"Tp","Failed user login");
        homePage.logout();

    }

    @Test (priority = 7)
    public void loginUnSuccessWithWrongUserNameandCorrectPassword(){
        FacebookLogin loginPage = new FacebookLogin();
        FacebookHome homePage = loginPage.loginSuccess(wrongUserName,password);
        Common.getInstance().waitForElement(By.className("_1vp5"),20);
        Assert.assertEquals(homePage.getProfileName(),"Tp","Failed user login");
        homePage.logout();

    }


    @AfterMethod

    public void tearDown() {
        Common.getInstance().closeBrowser();
    }



}
