package org.Stepdefinations;

import java.util.List;
import java.util.Map;

import org.TestTakerpages.CBTLoginTTPage;
import org.adminPages.CBTAdminHomepage;
import org.adminPages.CBTClearLoginPage;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;
import org.utilities.ConFig;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CBTClearLoginStepDef {
	private WebDriver driver;
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
	    BaseUtility bu = new BaseUtility();
	    ConFig cr = new ConFig();
	    driver = bu.startup(cr.GettestData("bname"), cr.GettestData("url"));
	}

	@Then("user Enters Username and Password")
	public void user_enters_username_and_password(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps(String.class,String.class);
		String Uname=map.get(0).get("Username");
		String pwd=map.get(0).get("Password");
		CBTLoginTTPage Lp= new CBTLoginTTPage(driver);
		Lp.LoginwithInValidUsernamePassword(Uname, pwd);
	}

	@Then("user Clicks on LoginButton")
	public void user_clicks_on_login_button() {
		CBTLoginTTPage Lp= new CBTLoginTTPage(driver);
		Lp.LoginBtn();
	    
	}

	@Given("user is on Admin Login Page")
	public void user_is_on_admin_login_page() {
		ConFig cr = new ConFig();
	    driver.navigate().to(cr.GettestData("url"));
	}

	@Then("User Enters Admin Module Username and Password")
	public void user_enters_admin_module_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps(String.class,String.class);
		String Uname=map.get(0).get("Username");
		String pwd=map.get(0).get("Password");
		CBTLoginTTPage Lp= new CBTLoginTTPage(driver);
		Lp.LoginwithInValidUsernamePassword(Uname, pwd);
	    
	}

	@Then("user clicks on admin LoginButton")
	public void user_clicks_on_admin_login_button() {
		CBTLoginTTPage Lp= new CBTLoginTTPage(driver);
		Lp.LoginBtn();
	   
	}
	@Given("user Clicks on clear Login")
	public void user_clicks_on_clear_login() {
	    CBTAdminHomepage CB = new CBTAdminHomepage(driver);
	    CB.clearLogin();
	    
	}

	@Then("user select The centre")
	public void user_select_the_centre() {
	   CBTClearLoginPage CL = new CBTClearLoginPage(driver);
	   CL.selectTestCentre();
	}

	@Then("clicks Examinees number")
	public void clicks_examinees_number() {
	   CBTClearLoginPage CL = new CBTClearLoginPage(driver);
	   CL.examineesNumber();
		  
	    
	}

	@Then("user Enter on Examniees number in Candidates Search")
	public void user_enter_on_examniees_number_in_candidates_search() {
		CBTClearLoginPage CL = new CBTClearLoginPage(driver);
		CL.candidateSearchInputField();
	}

	@Then("user Clicks on Search")
	public void user_clicks_on_search() {
		CBTClearLoginPage CL = new CBTClearLoginPage(driver);
		CL.candidateSearchButton();
	}

	@Then("user select Radio button")
	public void user_select_radio_button() {
		CBTClearLoginPage CL = new CBTClearLoginPage(driver);
		CL.radioButtonSelection();
	}

	@Then("user Clicks on Choice")
	public void user_clicks_on_choice() {
		CBTClearLoginPage CL = new CBTClearLoginPage(driver);
		CL.choiceButton();
	}

	@Then("Clear Login")
	public void clear_login() {
		CBTClearLoginPage CL = new CBTClearLoginPage(driver);
		CL.clearLogin();
	   
	}

	@Then("user Navigate Forward to test Taker module")
	public void user_navigate_forward_to_test_taker_module() {
		ConFig cr = new ConFig();
	    driver.navigate().to(cr.GettestData("url"));
	}

	@Then("Enters Username and Password")
	public void enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> maps = dataTable.asMaps(String.class,String.class);
		String uname=maps.get(0).get("Username");
		String pass=maps.get(0).get("Password");
		CBTLoginTTPage Lp= new CBTLoginTTPage(driver);
		Lp.LoginwithValidUsernamePassword(uname, pass);
		
	}

	@Then("User Should be Logged In successFully")
	public void user_should_be_logged_in_success_fully() {
		CBTLoginTTPage Lp= new CBTLoginTTPage(driver);
		Lp.LoginBtn();
	}


}
