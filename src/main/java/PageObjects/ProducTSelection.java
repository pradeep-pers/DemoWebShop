package PageObjects;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProducTSelection {
	
	WebDriver driver;
	
	public ProducTSelection(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//Actions actions = new Actions(driver);
	}

	
	
	@FindBy(xpath="//body//div[4]//div[2]//ul[@class='top-menu']//li[2]")
	WebElement Computers;
	
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]")
	WebElement ClickonDesktop;
		
	@FindBy(xpath="//div[@class='product-grid']//div[@class='item-box']")
	WebElement  DeskTopMenu;
	@FindBy(xpath="//div[@class='product-grid']//div[@class='item-box']//div[2]//a[1]")
	WebElement Menu;
	@FindBy(xpath="//body//div[4]//div[@class='add-to-cart']//input[@type='button']")
	WebElement AddTocart;
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[6]/dl[1]/dd[1]/ul[1]/li[1]")
	WebElement SelectProcessor;
	//@FindBy(xpath="//body//div[2]//div[@class='header-links']//ul//li[3]")
	//WebElement ShoppingCatrt;
	
	@FindBy(xpath="//body//div[2]//div[@class='header-links']//ul//li[3]//a//span[@class='cart-label']")
	WebElement ShoppingCatrt;
	
	public void ClickonComputers()
	{
		Computers.click();
	}
public void ClickonDesktop()
{
	ClickonDesktop.click();
}
public void DisplyDesktopMenu() throws InterruptedException
{
	ArrayList<String> Desktopname=new ArrayList<String>();
	List<WebElement> name=driver.findElements(By.xpath("//div[@class='product-grid']//div[@class='item-box']//div[2]//a[1]"));
	for(WebElement i: name)
	{
		Desktopname.add(i.getText());
	}
	System.out.println("The List of Desktop Available in the Site:" +Desktopname);
	
	String MenuText=Menu.getText();
	System.out.println("Menu Text:" +MenuText);
	if(Desktopname.contains(MenuText))
	{
		driver.findElement(By.xpath("//div[@class='product-grid']//div[@class='item-box']//div[2]//a[1]")).click();
		System.out.println("User Clicks on DesktopMenu ");
		driver.findElement(By.xpath("//body//div[4]//div[@class='add-to-cart']//input[@type='button']")).click();
		System.out.println("User Clicks on add To Cart to button");
		Thread.sleep(2000);
		String SuccessMessage=driver.findElement(By.xpath("//body//div[3]//p[@class='content']")).getText();
		System.out.println("The Item is Added By the User Message:"+SuccessMessage);
		driver.findElement(By.xpath("//body/div[@id='bar-notification']/span[1]")).click();
		
		//AddTocart.click();
		//SelectProcessor.click(); 
		
		//String  CartText=ShoppingCatrt.getText();
		//System.out.println(" Please display the Shopping Cart Details:" +CartText);
	}
	
	ArrayList<String> AddToCartShow=new ArrayList<String>();
	List<WebElement> AddtoCart=driver.findElements(By.xpath("//body//div[4]//div[@class='overview']//div[6]//dl//dt"));
	for(WebElement i: AddtoCart)
	{
		AddToCartShow.add(i.getText());
	}
	System.out.println("Display the AddToCart page Contain:" +AddToCartShow);
}
public void DisplayShoppingCart()
{
	ShoppingCatrt.click();
}
   
}