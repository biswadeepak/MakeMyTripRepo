package com.qa.pages;



import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		
		@FindBy(xpath = "//div[@class='tvlrDtlsCard']/p[2]/span[2]")
		public WebElement reviewfirstName;
		
		@FindBy(xpath = "//div[@class='tvlrDtlsCard']/p[3]/span[2]")
		public WebElement reviewlastName;
		
		@FindBy(xpath = "//div[@class='tvlrDtlsCard']/p[4]/span[2]")
		public WebElement reviewGender;

		@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/p[1]")
		public WebElement getPrice;
		
		@FindBy(xpath = "//p[@class='fareRow']/span[2]")
		public WebElement totalAmount;
		
		@FindBy(xpath = "//p[@class='fareRow']/span[2]")
		public WebElement reviewAmount;
		
		@FindBy(xpath = "//button[text()='Yes, Please']")
		public WebElement yespop;
		
		
		
		
		
		
			
		
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
		
		public void Mumbai6_12(){
			ExpliciteWait(Mumbai6_12);
			Mumbai6_12.click();
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
        
        public void CustomerDetails() throws Exception{
        	
        	ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        	driver.switchTo().window(tabs2.get(1));
        	
        	ScrollPage();
        	//Wait();
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
        	
        	/*WebElement inputField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
            inputField.sendKeys(Keys.TAB);*/
        	
        	 Actions act = new Actions(driver);
        	   
        	act.sendKeys(Keys.TAB).build().perform();
        	act.sendKeys(Keys.RETURN).build().perform();
        	
        	Thread.sleep(6000);
        	reviewConfirm.click();
        	
        	
        	Thread.sleep(6000);
        	yespop.click();
   
        	
        	
        }
        
	  
        
        public void reviewPrice(){
        	String value= totalAmount.getText();
        	String Verified_Value = reviewAmount.getText();
        	
        	Assert.assertTrue("Not Verified", value.equals(Verified_Value));
        }
        
        
        
        
       /* public void verifyPrice(){
        	String actPrice = getPrice.getText();
        	String FareSummeryAmount = confirmPrice.getText();
        	
        	Assert.assertTrue("Page is not Verified", actPrice.equals(FareSummeryAmount));
        }*/
        
       
        
        

}
