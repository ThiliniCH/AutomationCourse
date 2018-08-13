package com.demoaut.newtours.test;

import com.demoaut.newtours.RegistrationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.PropertyFileReader;
import utils.TestApp;

public class NewUserRegistrationStepDefs {

    PropertyFileReader property = new PropertyFileReader();
    String url = property.getProperty("config", "url");
    String xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b";

    RegistrationPage register;


        @cucumber.api.java.en.Given("^user is on Mercury Home Page > Register Page$")
        public void userIsOnMercuryHomePageRegisterPage() throws Throwable {
            TestApp.getInstance().openBrowser();
            TestApp.getInstance().navigateToURL(url);

        }


    @Given("^user fills first name as \"([^\"]*)\"$")
    public void userFillsFirstNameAs(String firstName) throws Throwable {
            register= PageFactory.initElements(TestApp.getInstance().getDriver(),RegistrationPage.class);
            register.setFirstName(firstName);


    }

    @And("^user fills last name as \"([^\"]*)\"$")
    public void userFillsLastNameAs(String lastName) throws Throwable {
            register.setLastName(lastName);

    }

    @And("^user fills user name as \"([^\"]*)\"$")
    public void userFillsUserNameAs(String userName) throws Throwable {
            register.setUserName(userName);

    }

    @And("^user fills password as \"([^\"]*)\"$")
    public void userFillsPasswordAs(String password) throws Throwable {
            register.setPassword(password);

    }

    @And("^user fills confirm password as \"([^\"]*)\"$")
    public void userFillsConfirmPasswordAs(String confirmPassword) throws Throwable {
            register.setConfirmPassword(confirmPassword);

    }

    @When("^user clicks on submit button$")
    public void userClicksOnSubmitButton() throws Throwable {
            register.submit();
    }

    @Then("^Note should denote Your user name is \"([^\"]*)\"$")
    public void noteShouldDenoteYourUserNameIs(String userName) throws Throwable {
        String msg = TestApp.getInstance().getDriver().findElement(By.xpath(xpath)).getText();
        Assert.assertEquals(msg, "Note: Your user name is "+ userName +".");

    }
}
