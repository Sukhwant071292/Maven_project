package com.facebook.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.facebookpages.facebook_login;

import Test_demo.Test_launch;

@Test
public class Loginpagetest extends Test_launch {
	facebook_login loginpage;
	 
	public Loginpagetest()
	{
		super();
	}
@BeforeSuite
public void setup()
{
	initialization();
	loginpage=new facebook_login();
}
@Test
public void verifytitle()
{
	String title=loginpage.verifytitle();
}
@Test
public void verifyLogintest()
{
	loginpage.verifylogin();
}
@AfterSuite
public void Teardown()
{
	driver.quit();
}
}