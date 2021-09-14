package com.qa.stepDefinations;

import java.util.concurrent.TimeUnit;
import com.qa.pages.FlightsPage;
import com.qa.pages.HomePage;
import com.qa.pages.HotelsPage;
import com.qa.util.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * 
 * 
 * This class defines to Select From Mumbai as Location
 * Then Use Click on Search button
 * Verify the Hotels in Mumbai Location 
 * 
 * 
 *
 */
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

	@When("^Click on Randoms place$")
	public void click_on_Randoms_place() throws Throwable {
		homepage.LoginPopUp();
	}

	@And("^Click on Hotels Tab$")
	public void click_on_Hotels_Tab() throws Throwable {

		ExpliciteWait(hotelspage.hotelsLink);
		hotelspage.ClickOnHotelsPage();

	}

	@And("^Select Mumbai from drop down$")
	public void select_Mumbai_from_drop_down() throws Throwable {

		ExpliciteWait(hotelspage.selectLocations);
		hotelspage.SelectLoc();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hotelspage.SelectLocAsMumbai();

	}

	@Then("^Verify the Hotels Page$")
	public void verify_the_Hotels_Page() throws Throwable {
		try {
			String atctualtxt = hotelspage.verifyhotels.getText();
			ExpliciteWait(hotelspage.verifyhotels);
			Assert.assertTrue("The Mumbai Hotels page is not Showing", prop.getProperty("mumbaihotellist").equalsIgnoreCase(atctualtxt));
			}
			catch(Exception e) {
				
			}
		
	}

	@And("^Close the search hotels Browser$")
	public void close_the_search_hotels_Browser() throws Throwable {
		CloseBrowser();
	}

}
