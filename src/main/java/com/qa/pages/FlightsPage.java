package com.qa.pages;



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
		
		@FindBy(xpath = "//p[.='4'][1]")
		public WebElement selectDate;
		
	    
	    @FindBy(xpath = "//p[contains(text(),'Flights from ')]")
	    public WebElement verifyFlightSearch;
	    
	    
		@FindBy(xpath = "//a[contains(text(),'Search')]")
		public WebElement searchFlightBtn;
		
		@FindBy(xpath = "//span[text()='Non Stop']")
		public WebElement nonStopFlights;
		
		@FindBy(xpath = "//div[@id='premEcon']/div/div[1]/div[1]/div[2]/div[4]/div/button")
		public WebElement PricesBtn;
		
		@FindBy(xpath = "//div[@id='premEcon']/div/div[1]/div[3]/div/div[2]/div/div[3]/button")
		public WebElement bookNowBtn;
			
		
	//Actions
		public void select_Mumbai() throws Exception{
			fromCityMumbai.click();
			//Wait();
			Thread.sleep(3000);
			enterMumbai.sendKeys(prop.getProperty("loc1"));
			Wait();
			selectMumbai.click();
		}
		
		public void select_Delhi() throws Exception{
			//Wait();
			Thread.sleep(5000);
			enterDelhi.sendKeys(prop.getProperty("loc2"));
			ExpliciteWait(selectDelhi);
			selectDelhi.click();
			
		}
		
		public void select_Date(){
			Wait();
			selectDate.click();
		}
		
		public void searchFlights() throws InterruptedException{
			
			Wait();
			searchFlightBtn.click();
			Wait();
			
		}
		
		public void CheckOnNonStop() throws InterruptedException{
			//Wait();
			Thread.sleep(15000);
			nonStopFlights.click();
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
