package org.adminPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;
import org.utilities.ConFig;

public class CBTClearLoginPage {
	private WebDriver driver;
	@FindBy(xpath="//select[@class='test_center_dropdown']")
	private WebElement SelectTestCentre;
	
	@FindBy(xpath="//div[@class='user_key_box pt-1']")
	private WebElement ExamineesNumber;
	
	@FindBy(xpath="//input[@formcontrolname='filteredString']")
	private WebElement CandidateSearchInputField;
	
	@FindBy(xpath="//*[@class='fas fa-search edu-search']")
	private WebElement CandidateSearchButton;
	
	@FindBy(id="blankRadio1")
	private WebElement RadioButtonSelection;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement ChoiceButton;
	
	@FindBy(xpath="//button[@class='btn btn-edulabs float-right']")
	private WebElement ClearLogin;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement ClearLoginAccept;
	
	
	
	public CBTClearLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void selectTestCentre() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, SelectTestCentre, 10);
		Select sel = new Select(SelectTestCentre);
		sel.selectByValue("71");
	}
	public void examineesNumber() {
		ExamineesNumber.click();
	}
	public void candidateSearchInputField() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, CandidateSearchInputField, 10);
		CandidateSearchInputField.sendKeys("gt0701");
	}
	public void candidateSearchButton() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, CandidateSearchButton, 10);
		CandidateSearchButton.click();
	}
	public void radioButtonSelection() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, RadioButtonSelection, 10);
		RadioButtonSelection.click();
	}
	public void choiceButton() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, ChoiceButton, 10);
		ChoiceButton.click();
		
		
	}
	public void clearLogin () {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, ClearLogin, 20);
		ClearLogin.click();
		ClearLoginAccept.click();
		/* Alert alt = driver.switchTo().alert();
		alt.accept();*/
		
	}
	
	
	
	

}
