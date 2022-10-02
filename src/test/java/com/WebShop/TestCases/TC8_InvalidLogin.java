package com.WebShop.TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.LoginPageValidation;

public class TC8_InvalidLogin  extends BaseClass{
	
	@Test(description="Invalid Login Credentials")
	public void InvalidLogin()
	{
		LoginPage lp=new LoginPage(driver);
		driver.get(baseURL);
		logger.info("Application URL is Opned");
		lp.ClickonLoginLink();
		logger.info("User Clicks on Login Link");
		lp.EnterUserName(username);
		lp.EnterPassword("1234");
		lp.ClickonLoginButton();
		logger.info("User Enters Invalid Credentials");
		LoginPageValidation LV=new LoginPageValidation(driver);
		LV.InvalidLogin("Login was unsuccessful. Please correct the errors and try again.");
		
	}
	
	

}
