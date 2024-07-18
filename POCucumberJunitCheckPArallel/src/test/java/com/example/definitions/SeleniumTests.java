package com.example.definitions;


import org.junit.Assert;


import com.example.actions.HomePageActions;
import com.example.actions.LoginPageActions;
import com.example.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import java.time.Duration;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTests
{   
	private static WebDriver driver;
	public void AssignLeave() throws Exception {
		
		String text = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		
		Assert.assertEquals("Dashboard",text);
		
		driver.findElement(By.xpath("//button[contains(@title,'Assign Leave')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Type for hints...')]")).sendKeys("Em");
		
		//WebElement autooptions= driver.findElement(By.xpath("//*[@role='listbox'][contains(.,'Emily')])"));
		
		
	//	WebDriverWait  wait = new WebDriverWait(driver, Time);
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@role='option'][contains(.,'Emily')]"))));
		
		
//		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@role='listbox']"))));
//		List<WebElement> optionsToSelect =driver.findElements(By.xpath("//*[@role='listbox']"));
//		
//		for(WebElement option : optionsToSelect){
//			System.out.println("Trying to select: "+option.getText());
//	       //if(option.getText().equals("Emily Jones")) {
//	        	System.out.println("Trying to select: "+option.getText());
//	            option.click();
//	            break;
//	       // }
//		}
		
		
	    driver.findElement(By.xpath("//*[@role='option'][contains(.,'Emily')]")).click();
		
		
		driver.findElement(By.xpath("//div[contains(@class,'oxd-select-text oxd-select-text--active')]")).click();
		
		
		driver.findElement(By.xpath("//*[@role='option'][contains(.,'US - Bereavement')]")).click();
		
		driver.findElement(By.xpath("(//input[contains(@placeholder,'yyyy-dd-mm')])[1]")).sendKeys("2024-07-07");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//i[contains(@class,'oxd-date-input-icon')])[2]")).click();
		
		driver.findElement(By.xpath("(//div[contains(.,'13')])[17]")).click();
		
		//driver.findElement(By.xpath("(//input[contains(@placeholder,'yyyy-dd-mm')])[2]")).clear();
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("(//input[contains(@placeholder,'yyyy-dd-mm')])[2]")).sendKeys("2024-07-08");
		
		driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text oxd-select-text')])[2]")).click();
		
		driver.findElement(By.xpath("//*[@role='option'][contains(.,'All Days')]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//button[@type='submit'][ contains(.,'Assign')]")));
		
		driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text oxd-select-text')])[3]")).click();

		
	
		
		driver.findElement(By.xpath("//*[@role='option'][contains(.,'Half Day - Morning')]")).click(); 
		
		driver.findElement(By.xpath("//button[@type='submit'][ contains(.,'Assign')]")).click();
		
	}
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\KALAIMAN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       // WebDriver driver=new ChromeDriver();

   
              ChromeOptions options = new ChromeOptions();
            	options.addArguments("--remote-allow-origins=*");
            	 driver = new ChromeDriver(options);
            	
            //      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                  driver.manage().window().maximize();
              driver.get("https://opensource-demo.orangehrmlive.com/");
               driver.findElement(By.name("username")).sendKeys("Admin");
               driver.findElement(By.name("password")).sendKeys("admin123");
               driver.findElement(By.xpath("//button[@type='submit']")).click();
               
               new SeleniumTests().AssignLeave();
            

    }
}