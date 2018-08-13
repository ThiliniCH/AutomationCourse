package com.demoaut.newtours;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

@FindBy(linkText = "REGISTER") private WebElement register_link;

public RegistrationPage clickOnRegisterLink(){
    register_link.click();
    return new RegistrationPage();
}

}
