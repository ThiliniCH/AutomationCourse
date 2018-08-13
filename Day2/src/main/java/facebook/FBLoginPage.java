package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBLoginPage {


    public void loginSuccess(WebDriver driver, String userName, String password){

        /*enter user name*/
        driver.findElement(By.id("email")).sendKeys(userName);
        /*enter password*/
        driver.findElement(By.id("pass")).sendKeys(password);
        /*click on login button*/
        driver.findElement(By.id("loginbutton")).click();

    }
}
