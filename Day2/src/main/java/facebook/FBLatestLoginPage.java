package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class FBLatestLoginPage {

    PropertyFileReader prop = new PropertyFileReader();

    String userNameElement = prop.getProperty("FBLatestLoginPage","user.name.element");
    String passwordElement = prop.getProperty("FBLatestLoginPage","password.element");
    String loginButtonElement = prop.getProperty("FBLatestLoginPage","login.button.element");

    public  FBLatestHomePage loginSuccess(String userName, String password){
        loginAs(userName,password);
        return new FBLatestHomePage();
    }

    public FBLatestAttemptPage loginUnsuccess (String userName, String password){
        loginAs(userName,password);
        return new FBLatestAttemptPage();
    }

    //implementation is here
    private void loginAs(String userName, String password){
        WebDriver driver = TestApp.getInstance().getDriver();

        /*enter user name*/
        driver.findElement(By.id(userNameElement)).sendKeys(userName);
        /*enter password*/
        driver.findElement(By.id(passwordElement)).sendKeys(password);
        /*click on login button*/
        driver.findElement(By.id(loginButtonElement)).click();


    }
}
