package com.qa.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.HomePage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login extends TestBase{
	
	HomePage homepage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.initialization();
		 homepage = new HomePage(driver);
		//System.out.println("Inside Browser");
	}

	@Then("^Click on Login or Create Account$")
	public void click_on_Login_or_Create_Account() throws Throwable {
		//System.out.println("Login Pop up");
		homepage.LoginPopUp();
		//System.out.println("Witing for");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//System.out.println("Clicking on Loging btn");
		
		homepage.loginorCreateAccountBtn();
		
		
	}

	@Then("^Enter Email id or Mobile number$")
	public void enter_Email_id_or_Mobile_number() throws Throwable {
	    homepage.entermobilenumber(prop.getProperty("mob"));
	}

	@Then("^Click on continue$")
	public void click_on_continue() throws Throwable {
		homepage.clickOnContinueBtn();
	    
	}

	@Then("^Wait for (\\d+) Secs$")
	public void wait_for_Secs(int arg1) throws Throwable {
	    homepage.wait_30_Second();
	}

	@Then("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
	    homepage.clickOnLoginBtn();
	}

}
