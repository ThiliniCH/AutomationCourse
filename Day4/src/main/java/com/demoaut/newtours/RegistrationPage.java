package com.demoaut.newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegistrationPage {

    @FindBy(name = "firstName") private WebElement first_name;
    @FindBy(name = "lastName") private WebElement last_name;
    @FindBy(id = "email") private WebElement user_name;
    @FindBy(name = "password") private WebElement password_element;
    @FindBy(name = "confirmPassword") private WebElement confirm_Password;
    @FindBy(name = "register") private WebElement submit;


   public RegistrationPage setFirstName(String firstName){
        first_name.sendKeys(firstName);
        return this;
    }

   public RegistrationPage setLastName(String lastName){
        last_name.sendKeys(lastName);
        return this;
    }

   public RegistrationPage setUserName(String userName){
        user_name.sendKeys(userName);
        return this;

    }

    public RegistrationPage setPassword(String password){
        password_element.sendKeys(password);
        return this;
    }

    public RegistrationPage setConfirmPassword(String confirmPassword){
        confirm_Password.sendKeys(confirmPassword);
        return this;
    }

    public RegistrationPage submit(){
    submit.click();
    return this;
    }



}
