package com.WebShop.TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.LoginPageValidation;

public class TC2_LoginValidation extends BaseClass {
	
	@Test(description= "Login Validation")
	public void LoginValidation() throws InterruptedException
	{
		logger.info("Welcome to DemoWebShop Login Page");
		LoginPage lp=new LoginPage(driver);
		driver.get(baseURL);
		Thread.sleep(2000);
		lp.ClickonLoginLink();
		lp.EnterUserName(username);
	    lp.EnterPassword(password);
	    lp.ClickonLoginButton();
	    Thread.sleep(2000);
	    
	    LoginPageValidation Lv=new LoginPageValidation(driver);
	    Lv.compareInformation();
	    logger.info("Information footer text are verified");
	    Lv.compareCustomerService();
	    logger.info("Customer Service footer text are verified");
	    Lv.compareMyAccount();
	    logger.info("My Account footer text are verified");
	    Lv.compareFollow();
	    logger.info("Follow Us footer text are verified");
	    Lv.ImageDisplay();
	    logger.info("Image Display Validation");
		
	}
	
}
