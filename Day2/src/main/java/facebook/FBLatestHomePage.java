package facebook;

import org.openqa.selenium.By;
import utils.PropertyFileReader;
import utils.TestApp;

public class FBLatestHomePage {

    PropertyFileReader prop = new PropertyFileReader();

    String logOutElement = prop.getProperty("FBLatestHomePage","logout.element");
    String profileElement = prop.getProperty("FBLatestHomePage","profile.element");

    public FBLatestLoginPage logout(){
        // click on left arrow
        TestApp.getInstance().getDriver().findElement(By.id("userNavigationLabel")).click();

        //wait until element presence
        TestApp.getInstance().waitForElement(By.linkText(logOutElement), 25);
        // click on logout button
        TestApp.getInstance().getDriver().findElement(By.linkText(logOutElement)).click();

        return new FBLatestLoginPage();
    }
        public String getProfileName(){
        return TestApp.getInstance().getDriver().findElement(By.className(profileElement)).getText();
        }
    }


