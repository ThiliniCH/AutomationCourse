package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DemoQARegistrationTestWithJavaScript {

    static WebDriver driver;

    String jsFirstName = "document.getElementById('name_3_firstname'). value=\"Thilini\";";
    String jsLastName = "document.getElementById('name_3_lastname').value=\"chamaree\";";
    String jsMaritalStatus = "document.getElementsByName('radio_4[]')[1].click();";
    String jsHobbyReading = "document.getElementsByName('checkbox_5[]')[1].click();";
    String jsHobbyCricket = "document.getElementsByName('checkbox_5[]')[2].click();";
   // String jsCountry = "var country = document.getElementById('dropdown_7'); var selectedCountry = country.options[5].value;console.log(selectedCountry);";
 //   String jsDateOfBirthMonth = "";
    String jsPhoneNumber = "document.getElementById('phone_9').value=\"0714840828\";";
    String jsUserName = "document.getElementById('username').value=\"Malki\";";
    String jsEmail = "document.getElementById('email_1').value=\"thilinichamaree1@gmail.com\";";
    String jsPassword = "document.getElementById('password_2').value=\"12345678\";";
    String jsConfirmPassword = "document.getElementById('confirm_password_password_2').value=\"12345678\";";
    String jsSubmitButton = "document.getElementsByName('pie_submit')[0].click();";
    String jsAboutYourSelf = " return document.getElementById('description').value = \"Hey, Im Thilini\";";

@BeforeClass
    public void setUp() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","D:\\Automation\\Material\\chromedriver.exe");
    /*create web driver object */
    driver = new ChromeDriver();

    /*maximize the window */
    driver.manage().window().maximize();

    /*go to this page */
    driver.get ("http://demoqa.com/");

    /*go to relevant page */
    driver.findElement(By.id("menu-item-374")).click();

}

@Test
    public void testRegistration(){
    setJavaScriptToPage(jsFirstName);
    setJavaScriptToPage(jsLastName);
    setJavaScriptToPage(jsMaritalStatus);
    setJavaScriptToPage(jsHobbyReading);
    setJavaScriptToPage(jsHobbyCricket);
   // setJavaScriptToPage(jsCountry);
   // setJavaScriptToPage(jsDateOfBirthMonth);
    setJavaScriptToPage(jsPhoneNumber);
    setJavaScriptToPage(jsUserName);
    setJavaScriptToPage(jsEmail);
    setJavaScriptToPage(jsAboutYourSelf);
    setJavaScriptToPage(jsPassword);
    setJavaScriptToPage(jsConfirmPassword);
    setJavaScriptToPage(jsSubmitButton);


}

    private static Object setJavaScriptToPage(String javaScript) {
        if (driver instanceof JavascriptExecutor) {
            Object jsObject = ((JavascriptExecutor) driver)
                    .executeScript(javaScript);
            return jsObject;
        }
        return null;
    }

@AfterClass
     public void tearDown(){
     //  driver.quit();
}
}





