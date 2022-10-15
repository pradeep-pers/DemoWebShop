package com.WebShop.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.HomePagelinks;

public class TC14_HomePageBrokenlinks 
extends BaseClass{
	
	@Test
	public void HomePageLinks() throws InterruptedException, IOException 
	{
		logger.info("Welcome to DemoWebShop Login Page");
		HomePagelinks hm=new HomePagelinks(driver);
		
		driver.get(baseURL);
		Thread.sleep(2000);
		hm.HomePageLinks();
		
}

}