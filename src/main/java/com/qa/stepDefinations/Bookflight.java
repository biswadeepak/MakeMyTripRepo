package com.qa.stepDefinations;

import java.util.concurrent.TimeUnit;

import com.qa.pages.FlightsPage;
import com.qa.pages.HomePage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Bookflight extends TestBase{
	HomePage homepage;
	FlightsPage flightspage;
	
	@Given("^User Opens Browser$")
	public void user_Opens_Browser() throws Throwable {
	    TestBase.initialization();
	    homepage = new HomePage(driver);
	    flightspage = new FlightsPage();
	}
	
	@Then("^Click on Random place$")
	public void click_on_Random_place() throws Throwable {
	    homepage.randomClick();
	}
	

	@Then("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
		ExpliciteWait(flightspage.searchFlight);
	    flightspage.searchFlights();
	    
	}

	@Then("^Verify Search Flights$")
	public void verify_Search_Flights() throws Throwable {
	    boolean flag = flightspage.verifySearchFlightPage();
	    Assert.assertTrue(flag);
	}

	@Then("^Click On View Price button$")
	public void click_On_View_Price_button() throws Throwable {
		ExpliciteWait(flightspage.PricesBtn);
	    flightspage.ClickOnFlightPrice();
	}

	@Then("^Click On Book Now button$")
	public void click_On_Book_Now_button() throws Throwable {
		ExpliciteWait(flightspage.bookNowBtn);
	    flightspage.BookFlight();
	}

}
