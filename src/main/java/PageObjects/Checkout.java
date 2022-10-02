package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout {
	WebDriver driver;
	
	public Checkout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body//div[4]//div[@class='enter-address-body']//input[@name='BillingNewAddress.Company']")
	WebElement  CompanyName;
	@FindBy(xpath="//body//div[4]//div[@class='enter-address-body']//select[@name='BillingNewAddress.CountryId']")
	WebElement SelectCountry;
	@FindBy(xpath="//body//div[4]//div[@class='enter-address-body']//select[@name='BillingNewAddress.StateProvinceId']")
	WebElement StateP;
	@FindBy(xpath="//body//div[4]//div[@class='enter-address-body']//input[@name='BillingNewAddress.City']")
	WebElement City;
	@FindBy(xpath="//body//div[4]//div[@class='enter-address-body']//input[@name='BillingNewAddress.Address1']")
	WebElement Address1;
	@FindBy(xpath="//body//div[4]//div[@class='enter-address-body']//input[@name='BillingNewAddress.ZipPostalCode']")
	WebElement zipCode;
	@FindBy(xpath="//body//div[4]//div[@class='enter-address-body']//input[@name='BillingNewAddress.PhoneNumber']")
	WebElement PhoneNumber;
	public void CheckoutInputs() throws InterruptedException
	{
		
		/*CompanyName.sendKeys("Pabana");
		Thread.sleep(2000);
		Select county=new Select(SelectCountry);
		county.selectByVisibleText("India");
		Thread.sleep(2000);
		Select prov=new Select(StateP);
		prov.selectByIndex(0);
		Thread.sleep(2000);
		City.sendKeys("Bangalore");
		Thread.sleep(2000);
		Address1.sendKeys("JPLV FLAT NO 609");
		Thread.sleep(2000);
		zipCode.sendKeys("10001");
		Thread.sleep(2000);
		PhoneNumber.sendKeys("987654321");
		Thread.sleep(2000);*/
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body//div[4]//div[@class='page checkout-page']//input[@title='Continue'] ")).click();
		//driver.findElement(By.xpath("//body//div[@class='page-body checkout-data']//ol//li[@id='opc-billing']//input[@type='button']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[2]/div[2]/div[1]/input[1] ")).click();
		//driver.findElement(By.xpath("//body//div[@class='page-body checkout-data']//ol//li[@id='opc-shipping']//input[@type='button']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]")).click();
		//driver.findElement(By.xpath("//body//div[@class='page-body checkout-data']//ol//li[@id='opc-shipping_method']//input[@type='button']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1] ")).click();
		//driver.findElement(By.xpath("//body//div[@class='page-body checkout-data']//ol//li[@id='opc-payment_method']//input[@type='button']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button'] ")).click();
		//driver.findElement(By.xpath("//body//div[@class='page-body checkout-data']//ol//li[@id='opc-payment_info']//input[@type='button']"));
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//body/div[4]//div//ol//li[6]//div//input")).click();
		Thread.sleep(2000);
		//String  OrderInfo=driver.findElement(By.xpath("//body//div[@id='checkout-confrim-ordder']")).getText();
		//System.out.println("Order Info By the Customer:" +OrderInfo);
		//String  OrderInfo=driver.findElement(By.xpath("//body//div[4]//div//div[@class='section order-completed']")).getText();
		//System.out.println("Order Info By the Customer:" +OrderInfo);
		//Thread.sleep(2000);
				
		
		
		//Click on Continue button
		
		//driver.findElement(By.xpath("//body//div[4]//div[@class='section order-completed']//input[@value='Continue']")).click();
		//driver.findElement(By.xpath("//body//div[@id='checkout-confrim-ordder']")).click();
		//click on Confrim Button
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		String FinalText=driver.findElement(By.xpath("//body//div[@class='section order-completed']//div//strong")).getText();
		System.out.println("Oder Status:" +FinalText);
		
		String OrderNumber=driver.findElement(By.xpath("//body//div[@class='section order-completed']//ul//li[1]")).getText();
		System.out.println("Customer Order Number:" +OrderNumber);
		String ClickHere=driver.findElement(By.xpath("//body//div[@class='section order-completed']//ul//li[2]")).getText();
		System.out.println( "Clickhere for Order Details:" +ClickHere);
	}
		public void  ThankYou() throws InterruptedException
		{
		driver.findElement(By.xpath("//body//div[@class='section order-completed']//ul//li[2]//a")).click();
		System.out.println("User Navigated to Order Details Page");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(" User Navigated Back to Thank You Page");
		Thread.sleep(2000);;
		
		}
		public void ClickOnContinue()
		{
			driver.findElement(By.xpath("//body//div[@class='section order-completed']//div//input[@type='button']")).click();
			System.out.println("User Is Landed on HomePage");
		}
	}
	


