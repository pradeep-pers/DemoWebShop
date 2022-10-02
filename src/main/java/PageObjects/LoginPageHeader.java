package PageObjects;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageHeader {
	
	 WebDriver driver;
	 
	 public LoginPageHeader(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//body//div[4]//div[2]//ul[@class='top-menu']")
	 WebElement Header;
	 
	 public void headerTextCompare()
	 {
		 ArrayList<String> Actual=new ArrayList<String>();
		 ArrayList<String> Expected=new ArrayList<String>();
		 Expected.add("BOOKS");
		 Expected.add("COMPUTERS");
		 Expected.add("ELECTRONICS");
		 Expected.add("APPAREL & SHOES");
		 Expected.add("DIGITAL DOWNLOADS");
		 Expected.add("JEWELRY");
		 Expected.add("GIFT CARDS");
		 System.out.println("Expected Header Text are:" +Expected);
		 
		 List<WebElement> header=driver.findElements(By.xpath("//body//div[4]//div[2]//ul[@class='top-menu']//li"));
		 for(WebElement head: header)
		 {
			 Actual.add(head.getText());
		 }
				
		 System.out.println("Actual Header Text are:" +Actual);
		 
		 if(Actual.containsAll(Expected))
		 {
			 System.out.println(" Header Text are matching in DemoWebShop");
	 }
		 else
		 {
			 System.out.println(" Header Text are  not matching in DemoWebShop");
		 }
}
  

}
