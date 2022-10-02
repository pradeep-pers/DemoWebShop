package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement Loginlnk;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	@FindBy (xpath="//input[@class='button-1 login-button']")
	WebElement LoginBtn;
	@FindBy(xpath="//body//div[2]//div[1]/ul/li//a[@class='account']")
	WebElement MyAccount;
	
	//@FindBy(xpath="//body//div[2]//div[1]/ul/li//a[@class='ico-logout']")
	//WebElement Logoutlnk;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement Logoutlnk;
	@FindBy(xpath="//body//div[4]//div[3]//input[@class='button-1 register-button']")
	WebElement RegisterButton;
	
	@FindBy(xpath="//body//div[@class='header-menu']//ul[@class='top-menu']//li[2]//a")
	WebElement ClickOnComputer;
	
	
	
	
	
	
	
	public void  ClickonLoginLink()
	
	
	{
		Loginlnk.click();
	}
	public void EnterUserName(String name)
	{
		Email.clear();
		Email.sendKeys(name);
	}
	public void EnterPassword(String pswd)
	{
		password.clear();
		password.sendKeys(pswd);
	}
	public void ClickonLoginButton()
	{
		LoginBtn.click();
	}
	
	public  void GetMyAccountName()
	{
		String AccountLoginName= MyAccount.getText();
		System.out.println("User Logged in to The Application using UserID:" +AccountLoginName);
	}
	public void ClickonLogoutLink()
	{
		Logoutlnk.click();
	}
	public void userRegistration()
	{
		RegisterButton.click();
	}
	public void ClikOnComputer()
	{
		ClickOnComputer.click();
	}
}
