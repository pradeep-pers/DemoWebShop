package com.WebShop.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.SearchValidation;

public class TC13_SearchPageValidation extends BaseClass {
	
	@Test
	public void SearchPageValidation() throws InterruptedException 
	{
		logger.info("Welcome to DemoWebShop Login Page");
		
		driver.get(baseURL);
		Thread.sleep(2000);
		SearchValidation Ser=new SearchValidation(driver);
		logger.info("User Enters the Seach Text");
		Ser.UserEntersSearchData("Build your own computer");
		logger.info("User Clicked on Search Button");
		Ser.UserClicksOnSearchButton();
		String title=driver.getTitle();
		//Assert.assertEquals("Demo Web Shop. Search", "Demo Web Shop. Search");
		Assert.assertEquals(title.contains("Demo Web Shop. Search"), true);
		logger.info("Search Page Title Validated");
		
		Ser.VerifyHeaderText();
		logger.info("Header Text are Validated");
		
		//Ser.VerifyStroreMessage("Welcome to the new Tricentis store!");
		//logger.info("Welcome Store Message is displayed");
		//Ser.Welcome("Welcome to our store");
		//logger.info("Welcome Message is displayed");
		
		

		
		
		

}

}
