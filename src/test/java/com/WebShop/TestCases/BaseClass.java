package com.WebShop.TestCases;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import com.WebShop.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
		
	ReadConfig ConfigReader=new ReadConfig();
	
	public String baseURL=ConfigReader.getApplicationURL();
	public String username=ConfigReader.getUserName();
	public String password=ConfigReader.getPassword();
	public String browser=ConfigReader.getBrowser();

	
	
	// Define the Methods to be executed Before and After Class
	@BeforeClass
	public void Setup()
	{
		logger=Logger.getLogger("Demo-WebShop-Project");
		PropertyConfigurator.configure("Log4J.properties");
		
		if(browser.equals("chrome"))
		{
		
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}

	   if(browser.equals("ie"))
	
	 {
	  WebDriverManager.iedriver().setup();
	  driver=new InternetExplorerDriver();
	  driver.manage().window().maximize();
     }
    if(browser.equals("firefox"))
	
	{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
}
	
	}
	
	
	@AfterClass
	public void TearDown()
	{
		driver.close();
	
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	    FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}


}
