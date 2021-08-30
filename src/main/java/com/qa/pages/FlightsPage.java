package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class FlightsPage extends TestBase{
	
	//Page Factory-OR
		/*@FindBy(xpath = "//span[contains(text(),'From')]")
		WebElement fromCity;
		
		@FindBy(xpath = "//span[contains(text(),'To')]")
		WebElement toCity;
		*/
	    
	    @FindBy(xpath = "//p[contains(text(),'Flights from ')]")
	    public WebElement verifyFlightSearch;
	    
	    
		@FindBy(xpath = "//a[contains(text(),'Search')]")
		public WebElement searchFlight;
		
		@FindBy(xpath = "//button[@id='bookbutton-RKEY:71e7acb0-11ab-4bbf-82f9-c9dbcbd8b891:26_0']/span[1]")
		public WebElement PricesBtn;
		
		@FindBy(xpath = "//div[@class='viewFareBtnCol ']/button[@id='bookbutton-RKEY:9bea9444-c0c7-4268-8267-1a0d1c4eefbf:6_0']")
		public WebElement bookNowBtn;
		
	//Initializing Page Object
		public FlightsPage(){
			PageFactory.initElements(driver,this);
		}
		
	//Actions
		public void searchFlights(){
			searchFlight.click();
			
		}
		
		public boolean verifySearchFlightPage(){
			return verifyFlightSearch.isDisplayed();
		}
		
		public void ClickOnFlightPrice(){
			
			PricesBtn.click();
		}
		
        public void BookFlight(){
			
        	bookNowBtn.click();
		}

}
