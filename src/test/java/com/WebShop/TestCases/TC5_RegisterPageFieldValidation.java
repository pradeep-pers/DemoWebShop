package com.WebShop.TestCases;

import org.testng.annotations.Test;

import PageObjects.RegisterFieldValidation;

public class TC5_RegisterPageFieldValidation extends BaseClass {
	
	@Test(description= "Register new User Page Validation")
	public void RegisterPageFieldValidation()
	{
		RegisterFieldValidation  RegV=new RegisterFieldValidation(driver);
		driver.get(baseURL);
		RegV.ClickOnRegisterLink();
		RegV.ClickonRegisterButton();
		RegV.VerifyFnameValidationMessage("First name is required.");
		RegV.VerifyLnameValidationMessage("Last name is required.");
		RegV.VerifyEmailValidationMessage("Email is required");
		RegV.VerfiyPasswordValidationMessage("Password is required.");
	}

}
