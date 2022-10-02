package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver driver;
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//body//div[@class='header-links']//ul//li[1]//a")
	WebElement RegisterLnk;
	@FindBy(xpath="//input[@id='gender-male']]")
	WebElement Male1;
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement Female1;
	
    @FindBy(xpath=" //input[@id='FirstName']")
    WebElement FirstName;
    
    @FindBy(xpath="//input[@id='LastName']")
    WebElement LastName;
    
    @FindBy(xpath="//input[@id='Email']")
    WebElement Email;
    
    @FindBy(xpath="//input[@id='Password']")
    WebElement Password;
    @FindBy(xpath="//input[@id='ConfirmPassword']")
    WebElement Confrimpassword;
    @FindBy(xpath="//input[@id='register-button']")
    WebElement RegisterButton;
    @FindBy (xpath="//body//div[@class='page-body']//div//input[@id='gender-male']")
    WebElement Male;
    @FindBy (xpath="//label[contains(text(),'Female')]")
    WebElement Female;
    @FindBy(xpath="//div[@class='center-2']")
    WebElement RegComplete;
    
    @FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/input[1]")
    WebElement ContinueButton;
    
    @FindBy(xpath="//body//div[@class='buttons']//input[@id='register-button']")
    WebElement RgButton;
    
    public void ClikonRegisterLnk()
    {
    	RegisterLnk.click();
    }
    public void SelectGender()
    {
    	Male.click();
    	
    	}
    
    public void EnterEmail(String email)
    {
    	Email.clear();
    	Email.sendKeys(email);
    }
    public void EnterFname(String fname)
    {
    	FirstName.clear();
    	FirstName.sendKeys(fname);
    }
    public void EnterLname(String lname)
    {
    	LastName.clear();
    	LastName.sendKeys(lname);
    }
    public void  EnterPassword(String password)
    {
    	Password.clear();
    	Password.sendKeys(password);
    }
    public void ConfrimPassword(String cnfpswd)
    {
    	Confrimpassword.clear();
    	Confrimpassword.sendKeys(cnfpswd);
    }
    public void  ClickOnRegisterButton()
    {
    	RegisterButton.click();
    }
    public void VerifyContinueButton()
    {
    	ContinueButton.isDisplayed();
    	System.out.println("Continue button Displayed");
    	ContinueButton.click();
    }
    public void VerifyRegistartionSuccess(String Message)
    {
    	String text=RegComplete.getText();
    	System.out.println(" RegMessge:"  +text);
    	if(text.contains(Message))
    	{
    		System.out.println("Registration Successfull");
    	}
    	else
    	{
    		System.out.println("Registration unSuccessfull");
    	}
    	}
    public void  ClickonRegisterButton()
    {
    	RgButton.click();
    }
    public void MaleReg()
    {
    	Male.click();
    }
    }

