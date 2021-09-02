package com.qa.stepDefinations;

import com.qa.pages.FlightsPage;
import com.qa.pages.HomePage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class Bookflight extends TestBase{
	HomePage homepage;
	FlightsPage flightspage;
	
	@Given("^User Opens Browser$")
	public void user_Opens_Browser() throws Throwable {
	    TestBase.initialization();
	    homepage = new HomePage(driver);
	    flightspage = new FlightsPage(driver);
	}
	
	@Then("^Click on Random place$")
	public void click_on_Random_place() throws Throwable {
	    homepage.LoginPopUp();
	}
	
	@Then("^Select From Mumbai$")
	public void select_From_Mumbai() throws Throwable {
	    flightspage.select_Mumbai();
	}
	
	@Then("^Select To Delhi$")
	public void select_To_Delhi() throws Throwable {
	    flightspage.select_Delhi();
	}
	
	@Then("^Select the date$")
	public void select_the_date() throws Throwable {
	    flightspage.select_Date();
	}

	@Then("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
		
	    flightspage.searchFlights();
	    
	}
	
	@Then("^Click on Non Stop Checkbox$")
	public void click_on_Non_Stop_Checkbox() throws Throwable {
	    flightspage.CheckOnNonStop();
	}

	@Then("^Verify Search Flights$")
	public void verify_Search_Flights() throws Throwable {
		ExpliciteWait(flightspage.verifyFlightSearch);
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
