package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class HomePage{
	
	WebDriver driver;
	
	//Initializing the Page Objects
	
		public HomePage(WebDriver driver){
			this.driver =driver;
			PageFactory.initElements(driver,this);
		}
	
	//Page Factory-OR
	
	@FindBy(xpath = "//li[@data-cy='account']")
	public WebElement loginLink;
	
	@FindBy(id = "username")
	public WebElement mobno;
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	public WebElement continueBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	public WebElement loginBtn;
	
	
	@FindBy(xpath = "//a[contains(text(),'Search')]")
	public WebElement flightLink;
	
	@FindBy(xpath = "//li[@class='menu_Hotels']/a/span[1]")
	public WebElement hotelsLink;
	
	@FindBy(xpath = "//div[@class='loginModal displayBlock modalLogin dynHeight personal ']")
	public WebElement randomClick;
	
	@FindBy(xpath = "//div[@data-cy='outsideModal']")
	public WebElement popUpElement;
	
	
	
	
	//Actions
	
	public 	void loginorCreateAccountBtn() {
		
		try{
			Thread.sleep(3000);
		}
		catch(Exception e){
			
		}
		
		loginLink.click();
		
	}
	
	public void entermobilenumber(String mob){
		mobno.sendKeys(mob);
	}
	
	public void clickOnContinueBtn(){
		loginBtn.click();
		
	}
	
	public void wait_30_Second()throws InterruptedException{
		Thread.sleep(30000);
	}
	
	public void clickOnLoginBtn(){
		loginBtn.click();	
	}
	
	
	public 	String validateHomePageTitle(){
		return driver.getTitle();
	}
	
	public FlightsPage ClickOnFilgtsPage(){
		flightLink.click();
		
		return new FlightsPage();
		
	}
	
	public HotelsPage verifyHotelsPage(){
		hotelsLink.click();
		
		return new HotelsPage();
		
	}
	
	public void randomClick(){
		randomClick.click();
	}
	
	public void LoginPopUp(){
		
		popUpElement.click();
	}
	

}
