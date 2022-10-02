package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeCompuerSelection {
	WebDriver driver;
	
	public HomeCompuerSelection(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body//div[@class='sub-category-grid']//h2[@class='title']//a[@title='Show products in category Desktops']")
	WebElement  UserSelectDeskTop;
	@FindBy(xpath="//body//div[@class='sub-category-grid']//h2[@class='title']//a[@title='Show products in category Notebooks']")
	WebElement UserSelectNooteBooks;
	@FindBy(xpath="//body//div[@class='sub-category-grid']//h2[@class='title']//a[@title='Show products in category Accessories']")
	WebElement UserSelectAccesories;
	@FindBy(xpath="//body//div[@class='product-grid']//div[@class='details']//h2")
	WebElement  NameOfDesktops;
	
	
	public void  UserCliksonDesktop()
	{
		UserSelectDeskTop.click();
		
		
			ArrayList<String> ProdName=new ArrayList<String>();
			List<WebElement> Pname=driver.findElements(By.xpath("//body//div[@class='product-grid']//div[@class='details']//h2"));
			for(WebElement i:Pname)
			{
				ProdName.add(i.getText());
			}
			System.out.println("The Product List for Selection:" +ProdName);
			
			
			String SelectDesktopName=ProdName.get(1);
			System.out.println("DeskTop Name:"+SelectDesktopName);
			if(SelectDesktopName.equalsIgnoreCase("Build your own computer"))
			{
			  WebElement ele=driver.findElement(By.xpath("//body//h2[@class='product-title']//a[text()='Build your own computer']"));
			  ele.click();
			}
			
			
			
	}
	public void UserClicksonNooteBooks()
	{
		UserSelectNooteBooks.click();
	}
		
	public void UserClicksonAccess()
	{
		UserSelectAccesories.click();
	}
  
	/*public void ListDownItems()
	{
		ArrayList<String> ProdName=new ArrayList<String>();
		List<WebElement> Pname=driver.findElements(By.xpath("//body//div[@class='product-grid']//div[@class='details']//h2"));
		for(WebElement i:Pname)
		{
			ProdName.add(i.getText());
		}
		System.out.println("The Product List for Selection:" +ProdName);
	}*/
}
