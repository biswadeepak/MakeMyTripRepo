package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import org.junit.Assert;

public class HotelsPage extends TestBase{
	
	HomePage homepage;
	
	
	//Page Factory-OR
	
	@FindBy(xpath = "//div[@class='chHeaderContainer']/nav/ul/li[2]/a")
	public WebElement hotelsLink;
	
	@FindBy(id = "city")
	public WebElement selectLocations;
	
	@FindBy(xpath = "//div[@class='hsw_autocomplePopup locus autoSuggestPlugin ']/div/input")
	public WebElement EnterMumbai;
	
	@FindBy(xpath = "//p[contains(text(),'Mumbai, Maharashtra, India')]")
	public WebElement selectMumbai;
	
	@FindBy(xpath = "//button[@id='hsw_search_button']")
	public WebElement searchHotels;
	
	
	@FindBy(xpath = "//div[@id='seoH1DontRemoveContainer']/p[contains(text(),'Hotels, Villas, Apartments and more in Mumbai')]")
	public WebElement verifyhotels;
	
	
	
	
	//Initializing Page Object
			public HotelsPage(){
				PageFactory.initElements(driver,this);
			}
			
	//Actions
			public HotelsPage ClickOnHotelsPage(){
				homepage = new HomePage(driver);
				hotelsLink.click();
				return new HotelsPage();
			}
			public void SelectLoc(){
				selectLocations.click();
				
			}
			
			public void SelectLocAsMumbai(){
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				EnterMumbai.sendKeys(prop.getProperty("loc1"));
				//homepage.randomClick();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				selectMumbai.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				selectLocations.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				selectMumbai.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				searchHotels.click();
				
			}
			
			public void VerifyHotelListPage(){
				
				String atctualtxt = verifyhotels.getText();
				Assert.assertTrue("The Page is not Verified", atctualtxt.equals("Hotels, Villas, Apartments and more in Mumbai"));
				
			}
			
			
			
			
			
		
}
