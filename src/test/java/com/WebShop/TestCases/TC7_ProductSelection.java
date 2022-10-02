package com.WebShop.TestCases;

import org.testng.annotations.Test;

import PageObjects.AddressDetails;
import PageObjects.Checkout;
import PageObjects.LoginPage;
import PageObjects.LoginPageValidation;
import PageObjects.ProducTSelection;
import PageObjects.Register;
import PageObjects.ShoppingCartDetails;

public class TC7_ProductSelection  extends BaseClass{
	
	@Test(description=" Test Senario-1:Gabu Is buying From DemoWebshop- By Manuallly")
	public void ProductSelection() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		driver.get(baseURL);
		lp.ClickonLoginLink();
		lp.EnterUserName(username);
		lp.EnterPassword(password);
		lp.ClickonLoginButton();
		logger.info("GabuTbau looged in to the Application");
		Thread.sleep(2000);
		
		//AddressDetails AD=new AddressDetails(driver);
		//AD.EnterAddressDetails();
		
		ProducTSelection PD=new ProducTSelection(driver);
		logger.info("GabuTbau Started Product Selection");
		PD.ClickonComputers();
		logger.info("GabuTbau Selected the Computer");
		PD.ClickonDesktop();
		logger.info("GabuTbau Selected the DeskTop");
		PD.DisplyDesktopMenu();
		logger.info("GabuTbau Selected the DeskTopMenu-Add to cart ");
				
				
				
				
				
		PD.DisplayShoppingCart();
		logger.info("Gabu selected the Products");
		
		//LoginPageValidation LV=new LoginPageValidation(driver);
		//LV.OnClickCheckoutValidation();
		
		ShoppingCartDetails sp=new ShoppingCartDetails(driver);
		sp.DisplayShoppingCartProduct();
		sp.ClickOnCheckout();
		sp.SelectDropdownList();
		Checkout  ck=new Checkout(driver);
		ck.CheckoutInputs();
		logger.info("Gabu Checked out the Products");
		ck.ThankYou();
		ck.ClickOnContinue();
		
		lp.ClickonLogoutLink();
		System.out.println("GabuTabu Logged out From the Application");
	}
	
	

}
