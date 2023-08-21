package org.adminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class CBTResumeLoginPage {
	private WebDriver driver;
	@FindBy(xpath="//select[@formcontrolname='venue']")
	private WebElement SelectTestCentre;

	@FindBy(xpath="//div[@data-target='#search_doctor_modal']")
	private WebElement ExaminieesNumber;

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement ExaminieesNumberInputField;

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement CandidateSearchTextField;

	@FindBy(xpath="//*[@class='fas fa-search edu-search']")
	private WebElement CandidateSearchButton;

	@FindBy(id="blankRadio1")
	private WebElement RadioButton;

	@FindBy(xpath="(//button[@data-dismiss='modal'])[2]")
	private WebElement ChoiceButtonClick;

	@FindBy(xpath="//input[@formcontrolname='time']")
	private WebElement RemTimeAdjustMentMin;

	@FindBy(xpath="//input[@formcontrolname='timeSecond']")
	private WebElement RemTimeAdjustMentSec;
	
	@FindBy(xpath="//button[@class='btn btn-edulabs float-right']")
	private WebElement ResumeExamButton;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement ResumeExamButtonYes;
	
	


	public CBTResumeLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   
   public void selecttestcentre() {
	   Select sel = new Select(SelectTestCentre);
	   BaseUtility bu = new BaseUtility();
	   bu.WaitForVisibility(driver, SelectTestCentre, 10);
	   sel.selectByValue("0");
   }
   public void examinieesNumber() {
	   BaseUtility bu = new BaseUtility();
	   bu.WaitForVisibility(driver, ExaminieesNumber, 10);
	   ExaminieesNumber.click();
	   
   }
   public void examinieesnumberInputField() {
	   BaseUtility bu = new BaseUtility();
	   bu.WaitForVisibility(driver, ExaminieesNumberInputField, 10);
	   ExaminieesNumberInputField.sendKeys("gt0702");
   }

   public void candidateSearchButton() {
	   BaseUtility bu = new BaseUtility();
	   bu.WaitForVisibility(driver, CandidateSearchButton, 10);
	   CandidateSearchButton.click();
   }
   public void radioButton() {
	   BaseUtility bu = new BaseUtility();
	   bu.WaitForVisibility(driver, RadioButton, 10);
	   RadioButton.click();
   }
   public void choiceButtonClick() {
	   BaseUtility bu = new BaseUtility();
	   bu.WaitForVisibility(driver, ChoiceButtonClick, 10);
	   ChoiceButtonClick.click();
   }
   public void remTimeAdjustMentMin() {
	   BaseUtility bu = new BaseUtility();
	   bu.WaitForVisibility(driver, RemTimeAdjustMentMin, 10);
	   RemTimeAdjustMentMin.clear();
	   RemTimeAdjustMentMin.sendKeys("10");
   }
   public void remTimeAdjustMentSec() {
	   BaseUtility bu = new BaseUtility();
	   bu.WaitForVisibility(driver, RemTimeAdjustMentSec, 10);
	   RemTimeAdjustMentSec.clear();
	   RemTimeAdjustMentSec.sendKeys("10");
   }
   public void ResumeExamButton() {
	   BaseUtility bu = new BaseUtility();
	   bu.WaitForVisibility(driver, ResumeExamButton, 10);
	   ResumeExamButton.click();  
   }
   public void resumeExamButtonYes() {
	   BaseUtility bu = new BaseUtility();
	   bu.WaitForVisibility(driver, ResumeExamButtonYes, 10);
	   ResumeExamButtonYes.click();
   }
}
