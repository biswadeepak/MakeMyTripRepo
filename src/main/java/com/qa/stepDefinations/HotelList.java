package com.qa.stepDefinations;

import java.util.concurrent.TimeUnit;

import com.qa.pages.FlightsPage;
import com.qa.pages.HomePage;
import com.qa.pages.HotelsPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HotelList extends TestBase {
	
	HomePage homepage;
	FlightsPage flightspage;
	HotelsPage hotelspage;
	
	@Given("^User Open Browser$")
	public void user_Open_Browser() throws Throwable {
	    TestBase.initialization();
	    homepage = new HomePage(driver);
	    flightspage = new FlightsPage(driver);
	    hotelspage = new HotelsPage();
	}
	
	@Then("^Click on Randoms place$")
	public void click_on_Randoms_place() throws Throwable {
	    homepage.LoginPopUp();
	}
	
	@Then("^Click on Hotels Tab$")
	public void click_on_Hotels_Tab() throws Throwable {
		
		ExpliciteWait(hotelspage.hotelsLink);
	    hotelspage.ClickOnHotelsPage();
	    
	}

	@Then("^Select Mumbai from drop down$")
	public void select_Mumbai_from_drop_down() throws Throwable {
		
		ExpliciteWait(hotelspage.selectLocations);
		hotelspage.SelectLoc();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hotelspage.SelectLocAsMumbai();
	    
	}

	@Then("^Verify the Hotels Page$")
	public void verify_the_Hotels_Page() throws Throwable {
		ExpliciteWait(hotelspage.verifyhotels);
	    hotelspage.VerifyHotelListPage();
	}
	

}
