package com.facebookpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_demo.Test_launch;

public class facebook_login extends Test_launch {
	@FindBy(id="email")
	WebElement userEmail;
	
	@FindBy(id="pass")
	WebElement userpass;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement loginButton;
	
	public facebook_login()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifytitle()
	{
		return driver.getTitle();
	}
	
	public void verifylogin()
	{
		userEmail.sendKeys(prop.getProperty("username"));
		userpass.sendKeys(prop.getProperty("password"));
		loginButton.click();
		driver.navigate().back();
	}
	

}
