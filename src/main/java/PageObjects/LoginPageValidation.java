package PageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageValidation {
	
	WebDriver driver;
	
	public LoginPageValidation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//body//div[2]//div[4]/ul/li//a")
			WebElement FOLLOWUS;

	@FindBy(xpath="//body//div//div[2]//div[@class='validation-summary-errors']")
	WebElement invalidLogin;
	@FindBy(xpath="//body//div[4]//div[@class='checkout-buttons']")
	WebElement CheckoutValidation;

public  void compareFollow()
{
	ArrayList<String> Actual=new ArrayList<String>();
	ArrayList<String> Expected=new ArrayList<String>();
	
	List<WebElement> follow=driver.findElements(By.xpath("//body//div[2]//div[1]//div[4]//ul//li//a"));
	int x=follow.size();
	for(WebElement i: follow)
		
	{
		Actual.add(i.getText());
		//System.out.println("Display Actual Value" +Actual);
	}
	System.out.println("Display Actual Value" +Actual);
	Expected.add("Facebook");
	Expected.add("Twitter");
	Expected.add("RSS");
	Expected.add("YouTube");
	Expected.add("Google+");
	System.out.println("Display Expected Value" +Expected);
	//if(Actual.containsAll(Expected))
	if(Actual.equals(Expected))
	{
		System.out.println(" Follow Us Footer text are matching");
	}
	
	else
	{
		System.out.println(" Follow Us Footer text are  Not matching");
	}
}
public void compareMyAccount() {
	ArrayList<String> Actual=new ArrayList<String>();
	ArrayList<String> Expected=new ArrayList<String>();
	
	List<WebElement> Account=driver.findElements(By.xpath("//body//div[2]//div[1]//div[3]//ul//li//a"));
	
	for(WebElement i: Account)
		
	{
		Actual.add(i.getText());
		//System.out.println("Display Actual Value" +Actual);
	}
	System.out.println("Display Actual Value" +Actual);
	Expected.add("My account");
	Expected.add("Orders");
	Expected.add("Addresses");
	Expected.add("Shopping cart");
	Expected.add("Wishlist");
	System.out.println("Display Expected Value" +Expected);
	if(Actual.containsAll(Expected))
	
	{
		System.out.println(" My Accounts Footer text are matching");
	}
	
	else
	{
		System.out.println(" My Accounts Footer text are  Not matching");
	}
}
public void compareInformation()
{
	ArrayList<String> Actual=new ArrayList<String>();
	ArrayList<String> Expected=new ArrayList<String>();
	
	List<WebElement> info=driver.findElements(By.xpath("//body//div[2]//div[1]//div[1]//ul//li//a"));
	
	for(WebElement i: info)
		
	{
		Actual.add(i.getText());
		//System.out.println("Display Actual Value" +Actual);
	}
	System.out.println("Display Actual Value" +Actual);
	Expected.add("Sitemap");
	Expected.add("Shipping & Returns");
	Expected.add("Privacy Notice");
	Expected.add("Conditions of Use");
	Expected.add("About us");
	Expected.add("Contact us");
	System.out.println("Display Expected Value" +Expected);
	if(Actual.containsAll(Expected))
	
	{
		System.out.println(" Information Footer text are matching");
	}
	
	else
	{
		System.out.println(" Information Footer text are  Not matching");
	}
}
public void compareCustomerService()
{
	ArrayList<String> Actual=new ArrayList<String>();
	ArrayList<String> Expected=new ArrayList<String>();
	
	List<WebElement> info=driver.findElements(By.xpath("//body//div[2]//div[1]//div[2]//ul//li//a"));
	
	for(WebElement i: info)
		
	{
		Actual.add(i.getText());
		//System.out.println("Display Actual Value" +Actual);
	}
	System.out.println("Display Actual Value" +Actual);
	Expected.add("Search");
	Expected.add("News");
	Expected.add("Blog");
	Expected.add("Recently viewed products");
	Expected.add("Compare products list");
	Expected.add("New products");
	System.out.println("Display Expected Value" +Expected);
	if(Actual.containsAll(Expected))
	
	{
		System.out.println(" Customer Service Footer text are matching");
	}
	
	else
	{
		System.out.println(" Customer Service Footer text are  Not matching");
	}
}
public void ImageDisplay()
{
  WebElement Image=driver.findElement(By.xpath("//img[@class='nivo-main-image']"));
  if(Image.isDisplayed())
  {
	  System.out.println(" DemoWebShop Image is displaying");
  }
  else
  {
	  System.out.println(" DemoWebShop Image is  not displaying");
  }
}
public void InvalidLogin(String Message)
{
	String msg=invalidLogin.getText();
	System.out.println("Invalid Login Text:" +msg);
	if(msg.contains(Message))
	{
		System.out.println(" Invalid Login Success");
	}
	else
	{
		System.out.println(" Invalid Login Failure");
	}
}
public void OnClickCheckoutValidation()
{
	CheckoutValidation.click();
	String text=driver.findElement(By.xpath("//body//div[@id='terms-of-service-warning-box']")).getText();
	System.out.println("The CheckoutText is:" +text);
	

	}
	
	
}


	

