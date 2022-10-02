package com.WebShop.TestCases;

import org.testng.annotations.Test;

import PageObjects.HomeCompuerSelection;
import PageObjects.LoginPage;

public class TC11_ProductSelectioPn extends BaseClass {
	
	@Test
	public void ProductSelectioPn() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		driver.get(baseURL);
		lp.ClickonLoginLink();
		lp.EnterUserName(username);
		lp.EnterPassword(password);
		lp.ClickonLoginButton();
		lp.ClikOnComputer();
		Thread.sleep(2000);
		HomeCompuerSelection HM=new HomeCompuerSelection(driver);
		HM.UserCliksonDesktop();
		//HM.UserClicksonNooteBooks();
		//HM.UserClicksonAccess();
		//HM.ListDownItems();
		
		
	}

}
