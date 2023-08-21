package org.Stepdefinations;

import org.TestTakerpages.CBTLoginTTPage;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;
import org.utilities.ConFig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CBtLoginPageTT {
	private WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseUtility bu = new BaseUtility();
		ConFig cr = new ConFig();
		driver=bu.startup(cr.GettestData("bname"), cr.GettestData("url"));
	    
	}

	@Then("User Enter valid Username {string} and valid Password {string}")
	public void user_enter_valid_username_and_valid_password(String Uname, String Pwd) {
		CBTLoginTTPage Lp = new CBTLoginTTPage(driver);
		Lp.LoginwithValidUsernamePassword(Uname, Pwd);
	   
	}

	@Then("User Enters Login button")
	public void user_enters_login_button() {
		CBTLoginTTPage Lp = new CBTLoginTTPage(driver);
		Lp.LoginBtn();
	    
	}
	@Then("User Clicks On LogOut Tab")
	public void user_clicks_on_log_out_tab() {
		CBTLoginTTPage Lp = new CBTLoginTTPage(driver);
		Lp.ClickOnLogoutTab();
	    
	}
	@Then("User Clicks on Logout button")
	public void user_clicks_on_logout_button() {
		CBTLoginTTPage Lp = new CBTLoginTTPage(driver);
		Lp.Clickonlogout();
	}
	
	@Then("Return To loginpage Popup Displayed")
	public void return_to_loginpage_popup_displayed() {
		CBTLoginTTPage Lp = new CBTLoginTTPage(driver);
		Lp.returntoLoginPagePopup();
	    
	}
	@Then("User Return to Login Page")
	public void user_return_to_login_page() {
		CBTLoginTTPage Lp = new CBTLoginTTPage(driver);
		Lp.ReturnLp();
	}
	


	@Then("User Enter Invalid Username {string} and Invalid Password {string}")
	public void user_enter_invalid_username_and_invalid_password(String uname, String pwd) {
		CBTLoginTTPage Lp = new CBTLoginTTPage(driver);
		Lp.LoginwithInValidUsernamePassword(uname, pwd);
	    
	}

	@Then("User Hits Login button")
	public void user_hits_login_button() {
		CBTLoginTTPage Lp = new CBTLoginTTPage(driver);
		Lp.LoginBtn();
	    
	}
	@Then("Close The Browser")
	public void close_the_browser() {
		driver.close();
	}

}
