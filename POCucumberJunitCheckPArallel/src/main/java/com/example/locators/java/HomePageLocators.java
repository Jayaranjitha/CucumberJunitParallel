package com.example.locators.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

      @FindBy(xpath = "//h6[text()='Dashboard']")
      public  WebElement homePageUserName;
      
      @FindBy(xpath="//*[@class='oxd-icon bi-chevron-left']")
      public WebElement  sidebutton_minimize;
      
      @FindBy(xpath="(//span[contains(.,'Admin')])[1]")
      public WebElement  admin_button;

      @FindBy(xpath=" //input[@class=\"oxd-input oxd-input--active\"]")
      public WebElement  search_namefield;
      
      @FindBy(xpath="(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]")
      public WebElement  dropdown_userrole;
      
      @FindBy(xpath="(//*[@class='oxd-select-text-input'])[1]")
      public WebElement  dropdown_select;
      
      @FindBy(xpath="//*[@role='option'][contains(.,'Admin')]")
      public WebElement  dropdown_option;
      
   
      @FindBy(xpath="//div[contains(@class,\"oxd-autocomplete-text-input--active\")]")
      public WebElement employeeName;
      
      @FindBy(xpath="(//*[@class='oxd-select-text-input'])[2]")
      public WebElement  dropdown_select_status;
      
      @FindBy(xpath="//*[@role='option'][contains(.,'Enabled')]")
      public WebElement  dropdown_select_value;
      
      @FindBy(xpath="//button[@type='submit']")
      public WebElement searchButton;
      
   

}