package org.adminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class CBTAdminHomepage {
	private WebDriver driver;
	
	@FindBy(xpath="//*[text()='Testing status monitoring']")
	private WebElement TestMonitoring;
	
	@FindBy(xpath="//*[text()='password reset']")
	private WebElement PasswordReset;
	
	@FindBy(xpath="(//*[@routerlinkactive='active'])[3]")
	private WebElement ResumeExam;
	
	@FindBy(xpath="//*[text()='timer adjustment']")
	private WebElement TimerAdjustment;
	
	@FindBy(xpath="/html/body/app-root/app-test-center-admin/body/div[2]/div/div/app-test-center-side-menu/div/ul/li[5]")
	private WebElement ClearLogin;
	
	@FindBy(id="activate-btn")
	private WebElement ActivateTest;
	
	@FindBy(xpath="//*[text()='logout']")
	private WebElement LogoutButton;
	
	
	public CBTAdminHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void testMonitoring() {
		TestMonitoring.click();
	}
	public void passwordReset() {
		PasswordReset.click();
	}
	public void resumeExam() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, ResumeExam, 10);
		ResumeExam.click();
	}
	public void timerAdjustment() {
		TimerAdjustment.click();
	}
	public void clearLogin() {
		BaseUtility bu = new  BaseUtility();
		bu.WaitForVisibility(driver, ClearLogin, 20);
		ClearLogin.click();
	}
	public void activateTest() {
		ActivateTest.click();
	}
	public void logoutButton() {
		LogoutButton.click();
	}
	
	
	
	 
	
	
	
	
	

}
