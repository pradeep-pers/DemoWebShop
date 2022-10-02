package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegister {
	
	WebDriver driver;
	
   public UserRegister(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath="//label[text()='Male']")
   WebElement Male;
   @FindBy(xpath="//label[text()='Female']")
   WebElement Female;
   @FindBy(xpath="//body//div[1]//div[@class='center-2']//div[@class='form-fields']//div[@class='inputs']//input[@name='FirstName']")
   WebElement FirstName;
   @FindBy(xpath="//body//div[1]//div[@class='center-2']//div[@class='form-fields']//div[@class='inputs']//input[@name='LastName']")
   WebElement LastName;
   @FindBy(xpath="//body//div[1]//div[@class='center-2']//div[@class='form-fields']//div[@class='inputs']//input[@name='Email']")
   WebElement Email;
   @FindBy(xpath="//input[@name='Password']")
   WebElement Password;
   @FindBy(xpath="//input[@id='ConfirmPassword']")
   WebElement ConfrimPassword;
   @FindBy(xpath="//input[@id='register-button']")
   WebElement RegisterButton;
   @FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/input[1]")
   WebElement ContinueButton;
   
   @FindBy(xpath="//body//div[2]//div[@class='header-links']//ul//li[1]")
   WebElement UserName;
   @FindBy(xpath="//body//div[4]//div[@class='listbox']//ul//li[2]//a[1]")
   WebElement Address;
   @FindBy(xpath="//body//div[4]//div[@class='add-button']//input[@class='button-1 add-address-button']")
   WebElement AddNewButton;
   
   
   public void VerifyRegistration() throws InterruptedException
   {
	   Male.click();
	   FirstName.sendKeys("Samsung9014444445777");
	   LastName.sendKeys("Mobile801155677777");
	   Email.sendKeys("sam12355552@sam80138888.com");
	   Password.sendKeys("test@123");
	   ConfrimPassword.sendKeys("test@123");
	   RegisterButton.click();
	   ContinueButton.click();
	   UserName.click();
	   Thread.sleep(2000);
	   Address.click();
	   Thread.sleep(2000);
	  AddNewButton.click();
	   
   }
}
