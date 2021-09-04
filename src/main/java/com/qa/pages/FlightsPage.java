package com.qa.pages;



import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.stepDefinations.Bookflight;
import com.qa.util.TestBase;


public class FlightsPage extends TestBase{
	
	
	WebDriver driver;
	Bookflight bookflight;

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
		
		@FindBy(xpath = "//div[@class='DayPicker-Day DayPicker-Day--selected']")
		public WebElement selectDate;
		
	    
	    @FindBy(xpath = "//p[contains(text(),'Flights from ')]")
	    public WebElement verifyFlightSearch;
	    
	    
		@FindBy(xpath = "//a[contains(text(),'Search')]")
		public WebElement searchFlightBtn;
		
		@FindBy(xpath = "//div[@class='filterWrapper']/div[3]/div/label[1]/div/span[2]/span")
		public WebElement nonStopFlights;
		
		@FindBy(xpath = "//div[@class='filterWrapper']/div[5]/div/div/div[2]/span")
		public WebElement Mumbai6_12;
		
		@FindBy(xpath = "//div[@id='premEcon']/div/div[1]/div[1]/div[2]/div[4]/div/button")
		public WebElement PricesBtn;
		
		@FindBy(xpath = "//div[@id='premEcon']/div/div[1]/div[3]/div/div[2]/div/div[3]/button")
		public WebElement bookNowBtn;
		
		
		
		@FindBy(xpath = "((//div[@class='insRadioSection appendBottom8 '])[1]//span)[1]")
		public WebElement secureRadioBtn;
		
		@FindBy(xpath = "//button[contains(text(),'+ ADD NEW ADULT')]")
		public WebElement AddNewAdultLink;
		
		@FindBy(xpath = "//input[@placeholder='First & Middle Name']")
		public WebElement firstName;
		
		@FindBy(xpath = "//input[@placeholder='Last Name']")
		public WebElement lastName;
		
		@FindBy(xpath = "//div[@class='adultItem']/div/div/label[1]")
		public WebElement selectGender;
		
		@FindBy(xpath = "//div[@id='Mobile No']/div/input")
		public WebElement EnterMobNo;
		
		@FindBy(xpath = "//input[@placeholder='Email']")
		public WebElement EnterEmailid;
		
		@FindBy(xpath = "//div[@class='makeFlex hrtlCenter spaceBetween appendTop15']/button")
		public WebElement FinalContinue;
		
		@FindBy(xpath = "//button[contains(text(),'CONFIRM')]")
		public WebElement reviewConfirm;
		
		@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/p[1]")
		public WebElement getPrice;
		
		@FindBy(xpath = "//p[@class='fareRow']/span[2]")
		public WebElement totalAmount;
		
		@FindBy(xpath = "//p[@class='fareRow']/span[2]")
		public WebElement reviewAmount;
		
		@FindBy(xpath = "//button[text()='Yes, Please']")
		public WebElement yespop;
		
		@FindBy(xpath = "//h2[contains(text(),'Complete your booking')]")
		public WebElement completebooking;
		
		
		@FindBy(xpath = "//h4[contains(text(),'Review your booking')]")
		public WebElement riviewbooking;
		
		
		
			
		
	//Actions
		
		/*
		 * 
		 * Here Select the Mumbai Location
		 * 
		 * */
		public void select_Mumbai() throws Exception{
			fromCityMumbai.click();
			//Wait();
			Thread.sleep(3000);
			enterMumbai.sendKeys(prop.getProperty("loc1"));
			Wait();
			selectMumbai.click();
		}
		
		
		/*
		 * 
		 * Here Select the Delhi Location
		 * 
		 * */
		public void select_Delhi() throws Exception{
			//Wait();
			Thread.sleep(5000);
			enterDelhi.sendKeys(prop.getProperty("loc2"));
			ExpliciteWait(selectDelhi);
			selectDelhi.click();
			
		}
		
		/*
		 * 
		 * Here Select the tomorrow Date
		 * 
		 * */
		
		public void select_Date(){
			Wait();
			selectDate.click();
		}
		
		/*
		 * 
		 * Here Search the flights
		 * 
		 * */
		
		public void searchFlights() throws InterruptedException{
			
			Wait();
			searchFlightBtn.click();
			Wait();
			
		}
		
		/*
		 * 
		 * Here select the NonStop Check Box from Mumbai Option
		 * 
		 * */
		
		public void CheckOnNonStop() throws InterruptedException{
			//Wait();
			Thread.sleep(15000);
			nonStopFlights.click();
		}
		
		/*
		 * 
		 * Here select the 6AM-12PM in Deparature from Mumbai option
		 * 
		 * 
		 * */
		
		public void Mumbai6_12(){
			ExpliciteWait(Mumbai6_12);
			Mumbai6_12.click();
		}
		
		
		public boolean verifySearchFlightPage() throws InterruptedException{
			Thread.sleep(15000);
			return verifyFlightSearch.isDisplayed();
		}
		
		/*
		 * 
		 * Here Search the flight and Click on View 
		 * Prices button for lowest flight price
		 * 
		 * */
		
		public void ClickOnFlightPrice(){
			
			PricesBtn.click();
		}
		
		/*
		 * 
		 * Click on View Prices Button
		 * 
		 * 
		 * */
		
        public void BookFlight(){
			
        	bookNowBtn.click();
        	
        	
		}
        
        
        public void switchTabs(int no){
        	ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        	driver.switchTo().window(tabs2.get(no));
        }
        
        /*
         * 
         * 
         * Enter the customer details in Complete Your Booking Page
         * 
         * 
         * */
        
        public void CustomerDetails() throws Throwable{
        	try{
        	switchTabs(1);
        	//executeCall();
        	Thread.sleep(10000);
        	click(secureRadioBtn);
        	Thread.sleep(10000);
        	//Wait();
        	click(AddNewAdultLink);
        	Wait();
        	firstName.sendKeys(prop.getProperty("firstname"));
        	Wait();
        	lastName.sendKeys(prop.getProperty("lastname"));
        	Wait();
        	selectGender.click();
        	Wait();
        	EnterMobNo.sendKeys(prop.getProperty("mob"));
        	Wait();
        	EnterEmailid.sendKeys(prop.getProperty("email"));
        	
        	Thread.sleep(10000);
        	
        	Tab();
        	
        	Thread.sleep(6000);
        	reviewConfirm.click();
        	
        	Thread.sleep(6000);
        	yespop.click();
        	}
        	catch(Exception e){
        		System.out.println("This will not Execute due to Review Booking Page");
        	}
        		
        }
        
	 /*
	  * 
	  *  
	  *  Here to Review the Price for Flight
	  *  
	  *  
	  *  */
        
        public void reviewPrice(){
        	try{
        	String value= totalAmount.getText();
        	String Verified_Value = reviewAmount.getText();
        	
        	if(Verified_Value.equalsIgnoreCase(value)){
        		System.out.println("The Case is Passed");
        	}
        	else{
        		System.out.println("The Amount is not Matched");
        	}
        	}
        	catch(Exception e)
        	{
        		System.out.println("This will not Execute due to Review Booking Page");
        	}
        }
        
        
        
       
        
        

}
