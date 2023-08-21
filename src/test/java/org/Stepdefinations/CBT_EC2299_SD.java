package org.Stepdefinations;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;

import org.TestTakerpages.CBT_EC2299;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;
import org.utilities.ConFig;

import io.cucumber.java.en.*;


public class CBT_EC2299_SD {
	private WebDriver driver;
	
	
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		BaseUtility bu = new BaseUtility();
		ConFig cr = new ConFig();
		driver=bu.startup(cr.GettestData("bname"), cr.GettestData("url"));
	   
	}

	@Then("user Enters Username  and Password and Clicks on Login button")
	public void user_enters_username_and_password_and_clicks_on_login_button(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> maps = dataTable.asMaps(String.class,String.class);
		String Uname=maps.get(0).get("Username");
		String Pass=maps.get(0).get("Password");
		CBT_EC2299 Cb = new CBT_EC2299(driver);
		Cb.Login(Uname, Pass);
	}

	@Then("user Clicks on Start The Exam")
	public void user_clicks_on_start_the_exam() throws InterruptedException {
		CBT_EC2299 Cb = new CBT_EC2299(driver);
		Cb.StartExam();
	}

	@When("user Clicks on Esc button and refresh the Browser")
	public void user_clicks_on_esc_button_and_refresh_the_browser() throws InterruptedException {
		CBT_EC2299 Cb = new CBT_EC2299(driver); 
		Cb.PressEscandRefreshBrowser();
	}

	@When("user Clicks on Esc button and Click on Yes in PopUp and Refresh The Browser")
	public void user_clicks_on_esc_button_and_click_on_yes_in_pop_up_and_refresh_the_browser() throws InterruptedException, AWTException {
		CBT_EC2299 Cb = new CBT_EC2299(driver);
		Cb.Esc_Popup_Yes();
	}

	@When("user Clicks on Esc button and Click on No in PopUp and Refresh The Browser")
	public void user_clicks_on_esc_button_and_click_on_no_in_pop_up_and_refresh_the_browser() throws InterruptedException, AWTException {
		CBT_EC2299 Cb = new CBT_EC2299(driver);
		Cb.Esc_Popup_No();
	}
	@When("user clicks on Escape and No in Popup")
	public void user_clicks_on_escape_and_no_in_popup() throws InterruptedException, AWTException {
		CBT_EC2299 Cb = new CBT_EC2299(driver);
		Cb.Esc_No();
	}
	@When("user clicks on Escape and yes in Popup")
	public void user_clicks_on_escape_and_yes_in_popup() throws AWTException, InterruptedException {
		CBT_EC2299 Cb = new CBT_EC2299(driver);
		Cb.Esc_yes();
	}
	
	
}
	
