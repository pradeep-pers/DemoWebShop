package com.WebShop.TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.LoginPageHeader;


public class TC3_LoginHeaderValidation extends BaseClass {
	
	@Test(description= "Header Validation")
	public void LoginHeaderValidation() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		driver.get(baseURL);
		logger.info("Application URL is Opened");
		lp.ClickonLoginLink();
		lp.EnterUserName(username);
		lp.EnterPassword(password);
		logger.info("User Credentials are Entered");
		lp.ClickonLoginButton();
		logger.info("User Clicks on LoginButton");
		Thread.sleep(2000);
		LoginPageHeader Lv=new LoginPageHeader(driver);
	    Lv.headerTextCompare();
	    logger.info("Header Text are Validated Successfully");
	
	}

}
