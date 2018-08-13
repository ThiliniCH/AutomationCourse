package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class FBLoginNewPage {
    public void loginSuccess(String userName, String password){

        WebDriver driver = TestApp.getInstance().getDriver();

        /*enter user name*/
        driver.findElement(By.id("email")).sendKeys(userName);
        /*enter password*/
        driver.findElement(By.id("pass")).sendKeys(password);
        /*click on login button*/
        driver.findElement(By.id("loginbutton")).click();

    }
}
