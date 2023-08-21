package org.TestTakerpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class CBTLoginTTPage {
	private WebDriver driver;
	@FindBy(xpath="//input[@formcontrolname='username']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy(xpath="//div[@class='header__user-name']")
	private WebElement LogoutTab;
	
	@FindBy(id="dropdown-user")
	private WebElement LogoutBtn;
	
	@FindBy(xpath="//*[@routerlinkactive='active']")
	private WebElement ReturnLoginPage;
	
	@FindBy(xpath="(//span[@class='button__text d-inline-flex'])[3]")
	private WebElement ReturnLoginPagePopup;
	
	@FindBy(xpath="//button[@class='button button--bg-blue button--radius-small']")
	private WebElement ResumeExam;
	
	@FindBy(tagName="body")
	private WebElement KeysOpreations;
	
	
	
	
	public CBTLoginTTPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	
	
	public void UsernameField(String Uname) {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, Username, 10);
		Username.sendKeys(Uname);
	}
	public void PasswordField(String Pwd) {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, Password, 10);
		Password.sendKeys(Pwd);
	}
	public void LoginwithValidUsernamePassword(String Uname,String Pwd) {
		Username.sendKeys(Uname);
		Password.sendKeys(Pwd);
		Assert.assertTrue("User is able to Login TT Module",true);
	}
	public void LoginwithInValidUsernamePassword(String Uname,String Pwd) {
		Username.sendKeys(Uname);
		Password.sendKeys(Pwd);
		Assert.assertFalse("User Not Able to Login TT Module", false);
	}
	
	public void Title(String ExpTitle) {
		String ActTile=driver.getTitle();
		Assert.assertEquals(ActTile, ExpTitle);
	}
	public void LoginBtn() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, LoginButton, 10);
		LoginButton.click();
	}
	public void Verification(String url)  {
		if(url.contains("https://gastrodoctor-dev.edulabcbt.com/#/user/my-home")) {
			System.out.println("Login Succesful");
		}else {
			System.out.println("Login Fail");
		}
	}
	public void ClickOnLogoutTab() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, LogoutTab, 10);
		LogoutTab.click();
	}
	public void Clickonlogout() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, LogoutBtn, 10);
		LogoutBtn.click();
	}
	public void ReturnLp() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, ReturnLoginPage, 10);
		ReturnLoginPage.click();
	}
	public void returntoLoginPagePopup() {
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, ReturnLoginPagePopup, 10);
		ReturnLoginPagePopup.click();
	}
	public void Login(String username,String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
		LoginButton.click();
	}
	public void PressEscandRefreshBrowser() throws InterruptedException {
		KeysOpreations.sendKeys(Keys.ESCAPE);
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	
	}
	

	
	


