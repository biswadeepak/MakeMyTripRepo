package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\NewWorkSpace\\TPoint\\MakeMyTripBDDFramework\\src\\main\\java\\com\\"
					+ "qa\\config\\config.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
public static void initialization(){
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "//D:\\My Selenium\\Selenium Download\\New Download\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		
		else if(browsername.equals("FF")){
			
			System.setProperty("webdriver.gecko.driver", "D:\\My Selenium\\Selenium Download\\GeckoDriver\\geckodriver.exe");
		    driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITE_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	
		
	}

    public static void ExpliciteWait(WebElement element){
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOf(element));
}

         
}

