package com.WebShop.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class TC6_DataProviderLogin extends BaseClass {
	
	@Test(dataProvider="data-provider", description= "User Login using DataProvider")
	public void DataProviderLogin(String UserName, String pswd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		driver.get(baseURL);
		logger.info("Application URL is Opened");
		lp.ClickonLoginLink();
		logger.info("User Clicks on Loginlnk");
		lp.EnterUserName(UserName);
		logger.info("User Enters UserName");
		lp.EnterPassword(pswd);
		logger.info("User Enters Password");
		lp.ClickonLoginButton();
		logger.info("User Clicks on LoginButton");
		Thread.sleep(2000);
		lp.ClickonLogoutLink();
		logger.info("User Clicks on Logout link");
		Thread.sleep(2000);
		lp.ClickonLoginLink();
		logger.info("Iteration starts - Clicking for New Login");
		
	}
	@DataProvider(name="data-provider")
	public Object[][]  TestData()
	{
		Object[][]  myData= { {"test@kuna.com","test@123"}, {"test@champi.com","test@123"}, {"sanju@khudi.com","test@123"}};
		return myData;
	}

}
