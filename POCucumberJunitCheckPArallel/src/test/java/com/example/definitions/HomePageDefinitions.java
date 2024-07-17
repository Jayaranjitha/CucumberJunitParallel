package com.example.definitions;

import org.junit.Assert;


import com.example.actions.HomePageActions;
import com.example.actions.LoginPageActions;
import com.example.utils.HelperClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageDefinitions {

    HomePageActions objHomePage = new HomePageActions();

    @Given("user clicks on the admin button")
    public void user_clicks_on_the_admin_button()  {
       
    	
    	objHomePage.clickAdminButton();
    	
    	
    }

    @And("user enters the name {string}")
    public void user_enter_searchName(String search_name) throws Exception {
       
    	
    	objHomePage.userSearchName(search_name);
    	Thread.sleep(2000);
    //	objHomePage.dropDown_UserRole("Admin");
    	
    	
    }
    
    @And("user selects the role as {string}")
    public void user_enter_role(String search_name) throws Exception  {
       
    	
    
    	objHomePage.dropDown_UserRole("Admin");
    	Thread.sleep(2000);
    	
    }
    

    
    @And("user selects the status as {string}")
    public void status(String status) throws Exception  {
       
   
    	objHomePage.status();
    	Thread.sleep(2000);
    	
    }
    

     @And("user clicks on search button")
     public void searchButton()
     {
    	 objHomePage.clickOnSearch();
     }
    
    
    
    @Given("user minimizes the side view")
    public void user_minimizes_the_side_view() {
        // Write code here that turns the phrase above into concrete actions
        objHomePage.minimizebutton();
       
    }


}