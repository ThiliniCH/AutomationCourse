package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Common;
import utils.PropertyFileReader;

public class FacebookLogin {

    PropertyFileReader prop = new PropertyFileReader();

    String userNameElement = prop.getProperty("login","user.name.element");
    String passwordElement = prop.getProperty("login","password.element");
    String loginButtonElement = prop.getProperty("login","login.button.element");


    public  FacebookHome loginSuccess(String userName, String password){
        loginAs(userName,password);
        return new FacebookHome();
    }

    //implementation is here
    private void loginAs(String userName, String password){
        WebDriver driver = Common.getInstance().getDriver();

        /*enter user name*/
        driver.findElement(By.id(userNameElement)).sendKeys(userName);
        /*enter password*/
        driver.findElement(By.id(passwordElement)).sendKeys(password);
        /*click on login button*/
        driver.findElement(By.id(loginButtonElement)).click();


    }
}
