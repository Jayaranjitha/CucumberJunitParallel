package com.example.locators.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//span[contains(@class,'input-field-error-message')]")
    public WebElement missingUsernameErrorMessage;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    @FindBy(xpath = "//*[text()='Invalid credentials']")
    public  WebElement errorMessage;

}