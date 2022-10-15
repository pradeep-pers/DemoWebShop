package PageObjects;


import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressDetails {
	
	WebDriver driver;
	public AddressDetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body//div[@class='page-body']//input[@id='Address_FirstName']")
	WebElement fname;
	@FindBy(xpath="//body//div[@class='page-body']//input[@id='Address_LastName']")
	WebElement lname;
	@FindBy(xpath="//body//div[@class='page-body']//input[@id='Address_Email']")
	WebElement email;
	@FindBy(xpath="//body//div[@class='page-body']//input[@id='Address_Company']")
	WebElement Company;
	@FindBy(xpath="//body//div[@class='page-body']//select[@id='Address_CountryId']")
	WebElement CountryId;
	@FindBy(xpath="//body//div[@class='page-body']//select[@id='Address_StateProvinceId']")
	WebElement StatePID;
	@FindBy(xpath="//body//div[@class='page-body']//input[@id='Address_City']")
	WebElement City;
	@FindBy(xpath="//body//div[@class='page-body']//input[@id='Address_Address1']")
	WebElement Address1;
	@FindBy(xpath="//body//div[@class='page-body']//input[@id='Address_Address2']")
	WebElement Address2;
	@FindBy(xpath="//body//div[@class='page-body']//input[@id='Address_ZipPostalCode']")
	WebElement PostalCode;
	@FindBy(xpath="//body//div[@class='page-body']//input[@id='Address_PhoneNumber']")
	WebElement PhoneNum;
	@FindBy(xpath="//body//div[@class='buttons']//input[@class='button-1 save-address-button']")
	WebElement AddressSave;
	
	@FindBy(xpath="//body//div[@class='header-links']//ul/li[1]//a")
	WebElement LoginUserName;
	@FindBy(xpath="//body//div[@class='listbox']//ul//li[2]//a")
	WebElement Address;
	@FindBy(xpath="//body//div[@class='add-button']")
	WebElement AddButton;
	
	
	public void EnterAddressDetails() throws InterruptedException
	
	{
		
		
		LoginUserName.click();
		Address.click();
		AddButton.click();
		fname.sendKeys("Sanu");
		lname.sendKeys("Khudi");
		email.sendKeys("Nadu@test.com");
		Company.sendKeys("BopaBhaiCompany");
		Thread.sleep(2000);
		Select id=new Select(CountryId);
				id.selectByVisibleText("India");
				Thread.sleep(2000);
		Select StateId=new Select(StatePID);
		StateId.selectByIndex(0);
		City.sendKeys("Mumbai");
		Address1.sendKeys("NariMan Pont-400078");
		Address2.sendKeys("Juhu Beach");
		PostalCode.sendKeys("100001");
		PhoneNum.sendKeys("9876543201");
		Thread.sleep(2000);
		AddressSave.click();
	}
	/*public void AddressList()
	{
		ArrayList<String>Addr=new ArrayList<String>();
		List<WebElement> CustAdd=driver.findElements(By.xpath("//body//div[@class='address-list']//div//ul"));
		for(WebElement i:CustAdd)
		{
			Addr.add(i.getText());
		}
		System.out.println("The Address Of the Customer :" +Addr);
		
				
	}*/
	public void HashMapList()
	{
	
	HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap  
	List<WebElement> CustAdd=driver.findElements(By.xpath("//body//div[@class='address-list']//div//ul"));

for(WebElement i:CustAdd)
{
map.put(1,i.getText());
}
System.out.println("The Address Of the Customer On HashMap:" +map);
		

}
}