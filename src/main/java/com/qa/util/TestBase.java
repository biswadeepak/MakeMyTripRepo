package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("src\\main\\java\\com\\"
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
			
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeDriver") );
		    driver = new ChromeDriver();
		}
		
		else if(browsername.equals("FF")){
			
			System.setProperty("webdriver.gecko.driver",prop.getProperty("geckoDriver") );
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
    
    public static void click(WebElement element){
    	WebDriverWait wait = new WebDriverWait(driver, 60);
    	wait.until(ExpectedConditions.elementToBeClickable(element)).click();;
    }
    
    
    public static void Wait(){
    	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }
    
    public static void ScrollPage() throws Exception{
    	
    	JavascriptExecutor sc = (JavascriptExecutor) driver;
		sc.executeScript("window.scrollBy(0,2000)", "");
    }

         
}

