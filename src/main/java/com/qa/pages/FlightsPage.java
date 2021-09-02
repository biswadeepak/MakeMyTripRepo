package com.qa.pages;

import java.util.concurrent.TimeUnit;

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
		@FindBy(xpath = "//input[@id='fromCity']")
		WebElement fromCityMumbai;
		
		@FindBy(xpath = "//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")
		public WebElement enterMumbai;
		
		@FindBy(xpath = "//p[contains(text(),'Mumbai, India')]")
		public WebElement selectMumbai;
		
		
		@FindBy(xpath = "//div[@class='hsw_autocomplePopup autoSuggestPlugin makeFlex column spaceBetween']/div/input	")
		public WebElement enterDelhi;
		
		@FindBy(xpath = "//div[@class='calc60']/p[text()='New Delhi, India']")
		public WebElement selectDelhi;
		
		@FindBy(xpath = "//p[.='3'][1]")
		public WebElement selectDate;
		
	    
	    @FindBy(xpath = "//p[contains(text(),'Flights from ')]")
	    public WebElement verifyFlightSearch;
	    
	    
		@FindBy(xpath = "//a[contains(text(),'Search')]")
		public WebElement searchFlightBtn;
		
		@FindBy(xpath = "//div[@id='premEcon']/div/div[1]/div[1]/div[2]/div[4]/div/button")
		public WebElement PricesBtn;
		
		@FindBy(xpath = "//div[@id='premEcon']/div/div[1]/div[3]/div/div[2]/div/div[3]/button")
		public WebElement bookNowBtn;
		
	
		
	//Actions
		public void select_Mumbai(){
			fromCityMumbai.click();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			enterMumbai.sendKeys(prop.getProperty("loc1"));
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			selectMumbai.click();
		}
		
		public void select_Delhi(){
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			enterDelhi.sendKeys(prop.getProperty("loc2"));
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			selectDelhi.click();
			
		}
		
		public void select_Date(){
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			selectDate.click();
		}
		
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
