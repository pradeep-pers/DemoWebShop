package PageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchValidation {
	WebDriver driver;
	public SearchValidation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body//div[@class='search-box']//input[@type='text']")
	WebElement SearchField;
	@FindBy(xpath="//body//div[@class='search-box']//input[@type='submit']")
	WebElement SearchButton ;

	@FindBy(xpath="//body//div[@class='header-links']//ul//li")
	WebElement HeaderLinkText ;
	
	@FindBy(xpath="//body//div[@class='topic-html-content-title']//h2[contains(text(),'Welcome to our store')]")
	WebElement WelcomeMsg ;
	
	
	
	
	
	
	
	
	
	public void UserEntersSearchData(String TextTobeSeached)
	{
		SearchField.clear();
		SearchField.sendKeys(TextTobeSeached);
	}
	public void UserClicksOnSearchButton()
	{
		SearchButton.click();
	}
	public void VerifyHeaderText()
	{
		ArrayList<String >ExpectedHDtext=new ArrayList<String>();
		ExpectedHDtext.add("Register");
		ExpectedHDtext.add("Log in");
		ExpectedHDtext.add("Shopping cart(0) ");
		ExpectedHDtext.add("Wishlist (0)");
		System.out.println("Expected Header Text should be:"+ExpectedHDtext);
		
		ArrayList<String>ActualHDtext=new ArrayList<String>();
		List<WebElement> HDtext= driver.findElements(By.xpath("//body//div[@class='header-links']//ul//li//a"));
		for(WebElement i: HDtext)
		{
			ActualHDtext.add(i.getText());
		}
		System.out.println("Actual Header Text Should be:"+ActualHDtext);
		
		if(ActualHDtext.containsAll(ExpectedHDtext))
		{
			System.out.println("Header Text are matching");
		}
		else
		{
			System.out.println("Header Text are not matching");
		}
	}
	public void Welcome(String text)
	{
		String WelcomeText=WelcomeMsg.getText();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//div[@class='topic-html-content-title']//h2[contains(text(),'Welcome to our store')]")));
				
	
		System.out.println( "Please display the Welcome Text:"+WelcomeText);
		if(WelcomeText.equalsIgnoreCase(text))
		{
			System.out.println(" Welcome Message is displaying correctly");
		}
		else
		{
			System.out.println(" Welcome Message is  not displaying correctly");
		}
		
	}
	
}
