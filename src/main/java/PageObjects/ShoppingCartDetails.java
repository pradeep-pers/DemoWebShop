package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartDetails {
	
	WebDriver driver;
	public ShoppingCartDetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//th[contains(text(),'Product(s)')]")
	WebElement ShpProducts;
	@FindBy(xpath="//body//div[4]//div[@class='checkout-buttons']")
	WebElement CheckoutButton;

	
	public void DisplayShoppingCartProduct()
	{
		ArrayList<String> CartProduct=new ArrayList<String>();
		List<WebElement> prod=driver.findElements(By.xpath("//body//div[4]//div[@class='order-summary-content']//table//tr//th"));
		for(WebElement i:prod)
		{
			CartProduct.add(i.getText());
		}
		System.out.println("ShoppingCart Product Iist-Header:" +CartProduct);
	}
	public void ClickOnCheckout()
	{
		CheckoutButton.click();
		String text=driver.findElement(By.xpath("//body//div[@id='terms-of-service-warning-box']")).getText();
		System.out.println("The CheckoutText is:" +text);
		driver.findElement(By.xpath("//body/div[5]/div[1]/button[1]/span[1]")).click();
	}
	public void SelectDropdownList()
	{
		Select country=new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
		country.selectByVisibleText("India");
		Select State=new Select(driver.findElement(By.xpath("//select[@id='StateProvinceId']")));
		State.selectByIndex(0);
		WebElement postalCode=driver.findElement(By.xpath("//input[@id='ZipPostalCode']"));
		postalCode.sendKeys("500016");
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//body//div[4]//div[@class='page checkout-page']//input[@title='Continue'] ")).click();
				
	}
}
