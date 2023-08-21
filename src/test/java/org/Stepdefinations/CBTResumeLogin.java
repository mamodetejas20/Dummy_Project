package org.Stepdefinations;

import java.util.List;
import java.util.Map;

import org.TestTakerpages.CBTLoginTTPage;
import org.TestTakerpages.CBTTTHomepage;
import org.adminPages.CBTAdminHomepage;
import org.adminPages.CBTResumeLoginPage;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;
import org.utilities.ConFig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class CBTResumeLogin {
	private WebDriver driver;
	@Given("User Is Login Page")
	public void user_is_login_page() {
		BaseUtility bu = new BaseUtility();
		ConFig cr = new ConFig();
		driver = bu.startup(cr.GettestData("bname"), cr.GettestData("url"));
	}    


@Then("User Enters Username and Password")
public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> values = dataTable.asMaps(String.class,String.class);
	String Uname=values.get(0).get("Username");
	String pwd=values.get(0).get("Password");
	CBTLoginTTPage CL= new CBTLoginTTPage(driver);
	CL.LoginwithInValidUsernamePassword(Uname, pwd);
	
}

@Then("Clicks on Login button")
public void clicks_on_login_button() {
	CBTLoginTTPage CL= new CBTLoginTTPage(driver);
	CL.LoginBtn();
}

@Then("User clicks on Resume Test")
public void user_clicks_on_resume_test() {
	CBTTTHomepage CH= new CBTTTHomepage(driver);
	CH.resumeExamClick();
}

@Then("Confirmation Popup should be Displayed")
public void confirmation_popup_should_be_displayed() {
	CBTTTHomepage CH= new CBTTTHomepage(driver);
	CH.popup();
}



@Given("Admin is on login page")
public void admin_is_on_login_page() {
	BaseUtility bu = new BaseUtility();
	ConFig cr = new ConFig();
	driver = bu.startup(cr.GettestData("bname"), cr.GettestData("url"));
}    



@Then("Admin is logged in Sucesfully")
public void admin_is_logged_in_sucesfully(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> values = dataTable.asMaps(String.class,String.class);
	String Uname=values.get(0).get("Username");
	String pwd=values.get(0).get("Password");
	CBTLoginTTPage CL= new CBTLoginTTPage(driver);
	CL.LoginwithInValidUsernamePassword(Uname, pwd);
	CL.LoginBtn();
	
}

@Then("admin Clicks on Resume Exam")
public void admin_clicks_on_resume_exam() {
	CBTAdminHomepage CA= new CBTAdminHomepage(driver);
	CA.resumeExam();

}

@Then("clicks on Examinees Number")
public void clicks_on_examinees_number() {
	CBTResumeLoginPage CR = new CBTResumeLoginPage(driver);
	CR.examinieesNumber();
}

@Then("Search Examinees Number in SearchField")
public void search_examinees_number_in_search_field() {
	CBTResumeLoginPage CR = new CBTResumeLoginPage(driver);
	CR.examinieesnumberInputField();
}

@Then("Clicks on Search")
public void clicks_on_search() {
	CBTResumeLoginPage CR = new CBTResumeLoginPage(driver);
	CR.candidateSearchButton();
}

@Then("Clicks on RadioButton")
public void clicks_on_radio_button() {
	CBTResumeLoginPage CR = new CBTResumeLoginPage(driver);
	CR.radioButton();
}

@Then("Clicks on Choicebutton")
public void clicks_on_choicebutton() {
	CBTResumeLoginPage CR = new CBTResumeLoginPage(driver);
	CR.choiceButtonClick();
}

@Then("Admin gives Required time Adjustments")
public void admin_gives_required_time_adjustments() {
	CBTResumeLoginPage CR = new CBTResumeLoginPage(driver);
	CR.remTimeAdjustMentMin();
	CR.remTimeAdjustMentSec();
}

@Then("Clicks on Submitted")
public void clicks_on_submitted() {
	CBTResumeLoginPage CR = new CBTResumeLoginPage(driver);
	CR.ResumeExamButton();
	CR.resumeExamButtonYes();
}

@Given("user Navigates to test Taker module")
public void user_navigates_to_test_taker_module() {
	ConFig cr = new ConFig();
	driver.navigate().to(cr.GettestData("url"));
	
	
}

@Then("user Looged in")
public void user_looged_in(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> values = dataTable.asMaps(String.class,String.class);
	String Uname=values.get(0).get("Username");
	String pwd=values.get(0).get("Password");
	CBTLoginTTPage CL= new CBTLoginTTPage(driver);
	CL.LoginwithInValidUsernamePassword(Uname, pwd);
	
}


@Given("Clicks on Resume Test")
public void clicks_on_resume_test() {
	CBTTTHomepage CH = new CBTTTHomepage(driver);
	CH.resumeExamClick();
	CH.popup();
}



}
