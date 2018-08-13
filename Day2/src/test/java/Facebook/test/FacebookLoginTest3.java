package Facebook.test;

import facebook.FBLatestAttemptPage;
import facebook.FBLatestHomePage;
import facebook.FBLatestLoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;
import utils.TestApp;

public class FacebookLoginTest3 {
    //create object of a property file reader to access its data
    PropertyFileReader prop = new PropertyFileReader();
    //access data from property file
    String url = prop.getProperty("config", "url");
    String userName = prop.getProperty("config","userName");
    String password = prop.getProperty("config","password");
    @BeforeMethod
    public void setup (){
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL(url);
        TestApp.getInstance().waitForElement(By.id("email"),20);

    }

    @Test
    public void loginSuccess(){
        FBLatestLoginPage loginPage = new FBLatestLoginPage();
        FBLatestHomePage homePage = loginPage.loginSuccess(userName,password);
        TestApp.getInstance().waitForElement(By.className("_1vp5"),20);
        Assert.assertEquals(homePage.getProfileName(),"Tp","Failed user login");
        homePage.logout();

    }

   // @Test
   // public void loginUnsuccess(){
       // FBLatestLoginPage loginPage = new FBLatestLoginPage();
     //   FBLatestAttemptPage attemptPage = loginPage.loginUnsuccess("test","1234");


    //    String profileName = TestApp.getInstance().getDriver().findElement(By.className("_4rbf _53ij")).getText();
      //  Assert.assertEquals(profileName, "Tp", "failed user login");
       // TestApp.getInstance().waitForElement(By.className("_1vp5"),20);
     //   Assert.assertEquals(homePage.getProfileName(),"Tp","Failed user login");



  //  }

    @AfterMethod
    public void tearDown(){

    }

}
