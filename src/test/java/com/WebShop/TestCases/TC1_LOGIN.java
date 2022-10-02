package com.WebShop.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class TC1_LOGIN  extends BaseClass{
	
	@Test(description= "User Login To Demo WebShop Application")
	public void LOGINTEST() throws InterruptedException 
	{
		logger.info("Welcome to DemoWebShop Login Page");
		LoginPage lp=new LoginPage(driver);
		driver.get(baseURL);
		Thread.sleep(2000);
		lp.ClickonLoginLink();
		logger.info("Login Page is displayed");
		logger.info("Application URL is opned");
		lp.EnterUserName(username);
		logger.info("UserName is Entered");
		lp.EnterPassword(password);
		logger.info("Password is Entered");
		lp.ClickonLoginButton();  
		logger.info("User Loggged in Successfully");
		
		String title=driver.getTitle();
		/*if(title.equals("Demo Web Shop"))
		{
			System.out.println(" Test Passed");
			
		}
		else
		{
			System.out.println(" Test Failed");
			
		}*/
		//Assert.assertEquals(title, "Demo Web Shop");
		//Assert.assertEquals(title, "Demo Web Shop", "Test is Passed");
		//Assert.assertEquals(title, "Demo Web Shop123", "Test is failed");
		//Assert.assertNull(title.contains("Demo Web Shop"));
		Assert.assertTrue(title.contains("Demo Web Shop"));
		 logger.info("User Logged in Using the Account Name");
		lp.GetMyAccountName();
		logger.info("User Logged out Successfully");
		lp.ClickonLogoutLink();
	}
}

