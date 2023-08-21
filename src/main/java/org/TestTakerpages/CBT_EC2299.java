package org.TestTakerpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CBT_EC2299  {
	
	public WebDriver driver;
	 
	@FindBy(xpath="//input[@formcontrolname='username']")
	private WebElement Username;

	@FindBy(xpath="//input[@formcontrolname='password']")
	private WebElement Password;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement LoginButton;

	@FindBy(xpath="//div[@class='t-select__btn']")
	private WebElement GotoExam;

	@FindBy(xpath="//span[contains(@class,'icon-next')]")
	private WebElement NextButton;

	@FindBy(xpath="//button[@class='button button--bg-blue button--radius-medium']")
	private WebElement ToTestStartScreen;

	@FindBy(xpath="//div[@class='t-select__btn']")
	private WebElement TestStart;

	@FindBy(tagName="body")
	private WebElement KeysOpreations;

	@FindBy(xpath="//button[contains(@class,'button button--bg-grey button')]")
	private WebElement PopUpYes;

	@FindBy(xpath="(//button[contains(@class,'button button--bg-blue button')])[2]")
	private WebElement PopUpNo;




	public CBT_EC2299(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//user Enters Username and Password and Clicks on Login Button
	public void Login(String username,String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
		LoginButton.click();
		
	}
	//Start Exam Button and Instruction Page 
	public void StartExam() throws InterruptedException {
		Thread.sleep(2000);
		GotoExam.click();
		for(int i=0;i<12;i++)
		NextButton.click();
		Thread.sleep(2000);
		ToTestStartScreen.click();
		Thread.sleep(2000);
		TestStart.click();

	}
    //User is Giving Exam user Clicks on Esc And Refresh the browser
	public void PressEscandRefreshBrowser() throws InterruptedException {
		KeysOpreations.sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
	 //User is Giving Exam user Clicks on Esc And click on Yes and Refresh the browser
	public void Esc_Popup_Yes() throws InterruptedException, AWTException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		PopUpYes.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	 //User is Giving Exam user Clicks on Esc And click on No and Refresh the browser
	public void Esc_Popup_No() throws InterruptedException, AWTException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		PopUpNo.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	 //User is Giving Exam user Clicks on Esc And click on No 
	public void Esc_No() throws AWTException, InterruptedException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		PopUpNo.click();
	}
	 //User is Giving Exam user Clicks on Esc And click on Yes 
	public void Esc_yes() throws AWTException, InterruptedException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		PopUpYes.click();
	}
	





}
