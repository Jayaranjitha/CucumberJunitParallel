package com.example.definitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.example.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import java.io.*;

public class Hooks {
	 
	public static WebDriver driver= null;
	@Before(order=1)
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }	
	@Before(order=0)
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    }	
	

    @Before
    public static void setUp() {

       driver=  new HelperClass().setupDriver();
           
    }
    
    
    
    @After
    public static void tearDown(Scenario scenario) {

       
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
            
            Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
            
        }
              if(driver!=null) {
        	                // driver.close(); --> Dont use this to avoid socket exception
        	              driver.quit();
        	            }
        	
              HelperClass.driver.remove();
              HelperClass.driver.set(null);
              
        	         
        	      
    }
}