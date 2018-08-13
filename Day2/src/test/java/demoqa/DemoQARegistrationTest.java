package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DemoQARegistrationTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\Automation\\Material\\chromedriver.exe");
        /*create web driver object */
        WebDriver driver = new ChromeDriver();

        /*go to this page */
        driver.get ("http://demoqa.com/");
        /*maximize the window */
        driver.manage().window().maximize();
        /*go to relevant page */
        driver.findElement(By.id("menu-item-374")).click();

        /*enter first name*/
        driver.findElement(By.name("first_name")).sendKeys("Thilini");
        /*enter last name*/
        driver.findElement(By.name("last_name")).sendKeys("Chamaree");

        /*enter Marital Status*/
        List<WebElement> radioButton= driver.findElements(By.name("radio_4[]"));
        radioButton.get(1).click();
        /*enter Hobby*/
        List<WebElement> checkbox= driver.findElements(By.name("checkbox_5[]"));
        checkbox.get(0).click();
        checkbox.get(2).click();

        /*enter country*/
        Select countryDropdown = new Select(driver.findElement(By.name("dropdown_7")));
        countryDropdown.selectByVisibleText("Sri Lanka");
        /*enter date of birth - month*/
        Select monthDropdown = new Select(driver.findElement(By.name("date_8[date][mm]")));
        monthDropdown.selectByVisibleText("4");
        /*enter date of birth - day*/
        Select dayDropdown = new Select(driver.findElement(By.name("date_8[date][dd]")));
        dayDropdown.selectByVisibleText("2");
        /*enter date of birth - year*/
        Select yearDropdown = new Select(driver.findElement(By.name("date_8[date][yy]")));
        yearDropdown.selectByVisibleText("1991");

        /*enter phone number*/
        driver.findElement(By.name("phone_9")).sendKeys("0714840828");
        /*enter username*/
        driver.findElement(By.name("username")).sendKeys("MAL");
        /*enter email*/
        driver.findElement(By.name("e_mail")).sendKeys("thilinichamaree@gmail.com");


     //   WebElement UploadImg = driver.findElement(By.name("profile_pic_10"));
     //   UploadImg.click();
      //  UploadImg.sendKeys("C:\Users\hp\Desktop");

        /*enter about me*/
        driver.findElement(By.id("description")).sendKeys("dedicated self motivated person");
        /*enter password*/
        driver.findElement(By.name("password")).sendKeys("12345678");
        /*enter confirm password*/
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("12345678");
        /*click on submit button*/
        driver.findElement(By.name("pie_submit")).click();
    }
}
