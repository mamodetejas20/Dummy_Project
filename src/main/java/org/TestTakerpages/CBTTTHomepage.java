package org.TestTakerpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;



public class CBTTTHomepage {
	private WebDriver driver;
	@FindBy(xpath="//button[@class='button button--bg-blue button--radius-small']")
	private WebElement ResumeExamClick;
	
	@FindBy(xpath="(//span[@class='button__text d-inline-flex'])[3]")
	private WebElement Popup;
	
	@FindBy(xpath="/html/body/app-root/app-student/app-my-home/div/div/div/div/div/div/div[2]/div[3]/font/font[1]")
	private WebElement Msg;
	
	@FindBy(xpath="//div[@class='header__user-name']")
	private WebElement Test702;
	
	@FindBy(xpath="//div[@class='dropdown-menu__item']")
	private WebElement LogoutBtn;
	
	@FindBy(xpath="(//button[contains(@class,'button button--bg-blue button')])[2]")
	private WebElement Agree;
	
	@FindBy(tagName="Body")
	private WebElement Escape;
	
	
	public CBTTTHomepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void resumeExamClick() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, ResumeExamClick, 10);
		ResumeExamClick.click();	
	}
	public void popup() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, Popup, 10);
		Popup.click();	
	}
	public void VerfyMsg(String Exp) {
		String Act=Msg.getText();
		Assert.assertEquals(Exp, Act);
	}
	public void test702() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, Test702, 10);
		Test702.click();
	}
	public void logoutBtn() {
		LogoutBtn.click();
	}
	public void Agree() {
		Agree.click();
		Escape.sendKeys(Keys.ESCAPE);
		
	}
}
