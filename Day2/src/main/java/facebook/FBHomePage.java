package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBHomePage {
    public void logout (WebDriver driver){
        // click on left arrow
        driver.findElement(By.id("userNavigationLabel")).click();

        //wait until element presence
        waitForElement(driver,By.linkText("Log Out"), 20);
        // click on logout button
        driver.findElement(By.linkText("Log Out")).click();
    }
    private WebElement waitForElement(WebDriver driver, By locator, int timeOut) {
        WebElement element = new WebDriverWait(driver, timeOut).until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }
}
