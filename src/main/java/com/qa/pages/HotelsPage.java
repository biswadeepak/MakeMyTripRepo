package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

/**
 * This class is to define all the locators used in the hotels page
 *
 */


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
			
			/*
			 * 
			 * 
			 * Here Cliking On Hotels tab after Opening the Browser
			 * 
			 * 
			 * 
			 * */
			
			
			public HotelsPage ClickOnHotelsPage(){
				homepage = new HomePage(driver);
				hotelsLink.click();
				return new HotelsPage();
			}
			
			/*
			 * 
			 * Select Location
			 * 
			 * */
			public void SelectLoc(){
				selectLocations.click();
				
			}
			
			/*
			 * 
			 * 
			 * Here Enter the Mumbai and Click on Search Button
			 * 
			 * 
			 * */
			
			public void SelectLocAsMumbai(){
				Wait();
				EnterMumbai.sendKeys(prop.getProperty("loc1"));
				Wait();
				selectMumbai.click();
				Wait();
				selectLocations.click();
				Wait();
				selectMumbai.click();
				Wait();
				searchHotels.click();
				
			}
			
				
}
