package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestApp;

public class FBHomeNewPage {

    public void logout (){
        // click on left arrow
        TestApp.getInstance().getDriver().findElement(By.id("userNavigationLabel")).click();

        //wait until element presence
        TestApp.getInstance().waitForElement(By.linkText("Log Out"), 20);
        // click on logout button
        TestApp.getInstance().getDriver().findElement(By.linkText("Log Out")).click();
    }


}
