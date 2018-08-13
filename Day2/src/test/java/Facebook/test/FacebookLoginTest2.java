package Facebook.test;

import facebook.FBHomeNewPage;
import facebook.FBLoginNewPage;
import org.testng.annotations.*;
import utils.PropertyFileReader;
import utils.TestApp;

public class FacebookLoginTest2 {
    //create object of a property file reader to access its data
    PropertyFileReader prop = new PropertyFileReader();
    //access data from property file
    String url = prop.getProperty("config", "url");
    String userName = prop.getProperty("config", "userName");
    String password = prop.getProperty("config", "password");

    @BeforeClass
    public void setUp(){
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL(url);

    }

    @Test(priority = 1)
    public void loginSuccess(){

        FBLoginNewPage login = new FBLoginNewPage();
        login.loginSuccess(userName,password);


    }

    @Test(priority = 2)
    public void logOut(){
        FBHomeNewPage home = new FBHomeNewPage();
        home.logout();
    }


    @AfterClass
    public void tearDown(){
        TestApp.getInstance().closeBrowser();

    }
}
