package com.example.utils;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;


public class HelperClass {

  //   private static HelperClass helperClass;

        
        
        public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
        
        public final static int TIMEOUT = 10;

         public  WebDriver setupDriver() {
        	//  System.out.println(WebDriverManager.chromedriver().getBrowserPath());
            
      		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
      	  System.setProperty("webdriver.chrome.driver",filePath);
           // WebDriverManager.chromedriver().driverVersion("126.0.6478.126").setup();
          //  System.out.println(WebDriverManager.chromedriver().getBrowserPath());
      	ChromeOptions options = new ChromeOptions();
      	options.addArguments("--remote-allow-origins=*");
      	// driver = new ChromeDriver(options);
      	driver.set(new ChromeDriver(options));
           driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
            driver.get().manage().window().maximize();
		return driver.get();
         }

        public static void openPage(String url) {
            driver.get().get(url);
        }
//
//        public static WebDriver getDriver() {
//            return driver.get();
//        }
//
       
//
//        public static void tearDown() {
//        	
//        		    driver.remove();
//        		    driver.set(null);
//        		  
//        
//       }

    }