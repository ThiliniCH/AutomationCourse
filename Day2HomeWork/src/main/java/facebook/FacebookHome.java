package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Common;
import utils.PropertyFileReader;

public class FacebookHome {
    PropertyFileReader prop = new PropertyFileReader();

    String logOutElement = prop.getProperty("logout", "logout.element.first");
    String logout =prop.getProperty("logout","logout.element");
    String profileElement = prop.getProperty("logout", "profile.element");

    public FacebookLogin logout() {
        // click on left arrow
        Common.getInstance().getDriver().findElement(By.id(logOutElement)).click();

        //wait until element presence
        Common.getInstance().waitForElement(By.linkText(logout), 20);
        // click on logout button
        Common.getInstance().getDriver().findElement(By.linkText(logout)).click();

    return new FacebookLogin();

}
    public String getProfileName(){
        return Common.getInstance().getDriver().findElement(By.className(profileElement)).getText();
    }
}
