package org.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class BaseUtility {
	public WebDriver driver;
	public WebDriver startup(String Bname, String url) {
		if(Bname.equalsIgnoreCase("ch") ||
				Bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(Bname.equalsIgnoreCase("ff") ||
				Bname.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else if(Bname.equalsIgnoreCase("ed") ||
				Bname.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("No Driver Found");
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}
	public void WaitForVisibility(WebDriver driver,WebElement ele,int time) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));
	}

}
