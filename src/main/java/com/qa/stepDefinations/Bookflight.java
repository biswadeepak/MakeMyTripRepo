package com.qa.stepDefinations;

import com.qa.pages.FlightsPage;
import com.qa.pages.HomePage;
import com.qa.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;


/*
 * 
 * In this Page User has to
 * 1. Open MakeMyTrip in Browser
 * 2. Select Location From Mumbai
 * 3. Select Location To Delhi
 * 4. Select the tomorrow Date and Search
 * 5. Then Check Non Stop check Box and Click on Mumbai 6AM-12PM button 
 * 6. Book the flight which price is low
 * 7. Then Enter Customer deatils and verify Fare summery 
 * 
 * */ 


public class Bookflight extends TestBase{
	HomePage homepage;
	FlightsPage flightspage;
	
	@Given("^User Opens Browser$")
	public void user_Opens_Browser() throws Throwable {
	    TestBase.initialization();
	    homepage = new HomePage(driver);
	    flightspage = new FlightsPage(driver);
	}
	
	@When("^Click on Random place$")
	public void click_on_Random_place() throws Throwable {
	    homepage.LoginPopUp();
	}
	
	@Then("^Select From Mumbai$")
	public void select_From_Mumbai() throws Throwable {
	    flightspage.select_Mumbai();
	}
	
	@And("^Select To Delhi$")
	public void select_To_Delhi() throws Throwable {
	    flightspage.select_Delhi();
	}
	
	@Then("^Select the date$")
	public void select_the_date() throws Throwable {
	    flightspage.select_Date();
	}

	@And("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
		
	    flightspage.searchFlights();
	    
	}
	
	@Then("^Click on Non Stop Checkbox$")
	public void click_on_Non_Stop_Checkbox() throws Throwable {
	    flightspage.CheckOnNonStop();
	}
	
	@And("^Click on Mumbai (\\d+)-(\\d+) button$")
	public void click_on_Mumbai_button(int arg1, int arg2) throws Throwable {
		
		flightspage.Mumbai6_12();
	}
	
	    

	@And("^Verify Search Flights$")
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

	@And("^Click On Book Now button$")
	public void click_On_Book_Now_button() throws Throwable {
		ExpliciteWait(flightspage.bookNowBtn);
	    flightspage.BookFlight();
	}
	
	@Then("^Enter Customer Details$")
	public void enter_Customer_Details() throws Throwable {
			flightspage.CustomerDetails();
		
	}
	
	@And("^Verify Fare Summery$")
	public void verify_Fare_Summery() throws Throwable {
	    	flightspage.reviewPrice();
	    }
	
	@Then("^Close the book flight Browser$")
	public void close_the_book_flight_Browser() throws Throwable {
	    CloseAllBrowser();
	}
	
}
