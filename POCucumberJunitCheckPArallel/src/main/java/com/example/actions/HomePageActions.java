package com.example.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.example.*;
import com.example.locators.java.HomePageLocators;
import com.example.utils.HelperClass;

public class HomePageActions {

    HomePageLocators homePageLocators = null;
    public WebDriver driver ;

    public HomePageActions() {

        this.homePageLocators = new HomePageLocators();
        this.driver = new HelperClass().driver.get();

        PageFactory.initElements(driver,homePageLocators);
    }


    // Get the User name from Home Page
    public String getHomePageText() {
        return homePageLocators.homePageUserName.getText();
    }
    
    public void minimizebutton() {
    	 homePageLocators.sidebutton_minimize.click();
    }
    
    public void clickAdminButton() {
    	homePageLocators.admin_button.click();
    }
    
    public void userSearchName(String searchName) {
    	homePageLocators.search_namefield.sendKeys(searchName);
    	
    }
    public void dropDown_UserRole(String userRole) {
    	//Select select = new Select(homePageLocators.dropdown_select);
         //select.selectByVisibleText(userRole);	
    	homePageLocators.dropdown_userrole.click();
    	homePageLocators.dropdown_option.click();
     	
    }
      
    public void status() {
    
    	homePageLocators.dropdown_select_status.click();
    	homePageLocators.dropdown_select_value.click();
    	
    }

    public void clickOnSearch() {
    	
    	homePageLocators.searchButton.click();
    }
}