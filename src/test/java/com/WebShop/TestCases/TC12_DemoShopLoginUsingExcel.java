package com.WebShop.TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.WebShop.Utilities.XLutils;

import PageObjects.LoginPage;



public class TC12_DemoShopLoginUsingExcel  extends BaseClass{
	
	@Test(dataProvider="data-provider")
	public void DemoLogin( String Uname,  String Pwd) throws InterruptedException
	{
		
		LoginPage lp=new LoginPage(driver);
		driver.get(baseURL);
		logger.info("Application URL is Opened");
		lp.ClickonLoginLink();
		logger.info("User Clicks on LoginLink");
		lp.EnterUserName(Uname);
		lp.EnterPassword(Pwd);
		lp.ClickonLoginButton();
		Thread.sleep(2000);
		lp.ClickonLogoutLink();
		logger.info("User Clicked on Logoutlink");
		System.out.println("User Clicked on Logout Link");
		logger.info("User Clicks on Logout link");
		Thread.sleep(2000);  
		lp.ClickonLoginLink();
		logger.info("User Clicked on Loginlink");
		System.out.println("User Clicked on Login Link");
		logger.info("Iteration starts - Clicking for New Login");
		
		
		
		
		
		
	} 
	
	
    @DataProvider(name="data-provider")
	public Object[][]  TestData() throws IOException
	{
		///Read data from excel
		
		String path=("E:\\Photo-Framework\\DemoWebShop\\src\\test\\java\\com\\WebShop\\TestData\\WebShopLoginCredentials.xlsx");
		int rownum=XLutils.getRowCount(path, "Sheet1");
		System.out.println( "Row count is:" +rownum);
		int colcount=XLutils.getCellCount(path, "Sheet1", 1);
		System.out.println(" Column Count:" +colcount);
		String myData[][]=new String [rownum][colcount];
		int ci,cj;
		
		ci=0;
		for(int i=1; i<=rownum; i++,ci++)
		{
		cj=0;
		for (int j=1; j<=colcount; j++,cj++)

		{
		myData[ci][cj]=XLutils.getCellData(path, "Sheet1", i, j-1);


		System.out.println(" Person Info:" +myData[ci][cj]);
			}

}
	 return myData;
	}

}
