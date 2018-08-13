package com.demoaut.newtours.test;
import com.demoaut.newtours.HomePage;
import com.demoaut.newtours.RegistrationPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegistrationTest {

    PropertyFileReader property = new PropertyFileReader();
    String url = property.getProperty("config","url");



    @BeforeMethod
    public void setup(){
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL(url);

    }

    @Test
    public void testNewUserRegistration(){
        HomePage home = PageFactory.initElements(TestApp.getInstance().getDriver(),HomePage.class);
        home.clickOnRegisterLink();

        RegistrationPage register = PageFactory.initElements(TestApp.getInstance().getDriver(),RegistrationPage.class);
        register.setFirstName("Thilini");
        register.setLastName("Chamaree");
        register.setUserName("Thilini");
        register.setPassword("tp@12345");
        register.setConfirmPassword("tp@12345");
        register.submit();
    }



    @AfterMethod
    public void tearDown(){

    }
}
