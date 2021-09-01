package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


public class FlightsPage extends TestBase{
	
	
	WebDriver driver;

	//Initializing Page Object
	public FlightsPage(WebDriver driver){
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	//Page Factory-OR
		/*@FindBy(xpath = "//span[contains(text(),'From')]")
		WebElement fromCity;
		
		@FindBy(xpath = "//span[contains(text(),'To')]")
		WebElement toCity;
		*/
	    
	    @FindBy(xpath = "//p[contains(text(),'Flights from ')]")
	    public WebElement verifyFlightSearch;
	    
	    
		@FindBy(xpath = "//a[contains(text(),'Search')]")
		public WebElement searchFlightBtn;
		
		@FindBy(xpath = "//div[@id='premEcon']/div/div[1]/div[1]/div[2]/div[4]/div/button")
		public WebElement PricesBtn;
		
		@FindBy(xpath = "//div[@id='premEcon']/div/div[1]/div[3]/div/div[2]/div/div[3]/button")
		public WebElement bookNowBtn;
		
	
		
	//Actions
		public void searchFlights() throws InterruptedException{
			
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			searchFlightBtn.click();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			
		}
		
		public boolean verifySearchFlightPage() throws InterruptedException{
			Thread.sleep(15000);
			return verifyFlightSearch.isDisplayed();
		}
		
		public void ClickOnFlightPrice(){
			
			PricesBtn.click();
		}
		
        public void BookFlight(){
			
        	bookNowBtn.click();
		}

}
