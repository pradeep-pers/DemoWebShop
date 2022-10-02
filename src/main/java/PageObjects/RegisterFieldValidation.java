package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterFieldValidation {
	WebDriver driver;
	
	public RegisterFieldValidation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement RegisterLnk;
	@FindBy(xpath="//input[@id='register-button']")
    WebElement RegisterButton;
	@FindBy(xpath="//span[contains(text(),'First name is required.')]")
	WebElement FnameValidation;
	@FindBy(xpath="//span[contains(text(),'Last name is required.')]")
	WebElement LnameValidation;
	@FindBy(xpath="//span[contains(text(),'Email is required.')]")
	WebElement EmailValidation;
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[3]/div[2]/div[1]/span[2]/span[1]")
	WebElement PasswordValidation;
	
	public void ClickOnRegisterLink()
	{
		RegisterLnk.click();
	}
	public void ClickonRegisterButton()
	{
		RegisterButton.click();
	}
	public void VerifyFnameValidationMessage(String Message)
	{
		String msg=FnameValidation.getText();
		if(msg.equalsIgnoreCase(Message))
		{
			System.out.println("Application is displaying correct validation error message- FirstName field");
		}
		else
		{
			System.out.println("Application is displaying Incorrect validation error message- FirstName field");
		}
	}
	public void VerifyLnameValidationMessage(String Message)
	{
		String msg=LnameValidation.getText();
		if(msg.equalsIgnoreCase(Message))
		{
			System.out.println("Application is displaying correct validation error message- LastName field");
		}
		else
		{
			System.out.println("Application is displaying Incorrect validation error message- LastName field");
		}
	}
	public void VerifyEmailValidationMessage(String Message)
	{
		String msg=EmailValidation.getText();
		if(msg.equalsIgnoreCase(Message))
		{
			System.out.println("Application is displaying correct validation error message- Email field");
		}
		else
		{

			System.out.println("Application is displaying Incorrect validation error message- Email field");
		}
	}
	public void VerfiyPasswordValidationMessage(String Message)
	{
		String msg=PasswordValidation.getText();
		if(msg.equalsIgnoreCase(Message))
		{
			System.out.println("Application is displaying correct validation error message- Password field");
		}
		else
		{
			System.out.println("Application is displaying Incorrect validation error message- Password field");
		}
	}
	
}

