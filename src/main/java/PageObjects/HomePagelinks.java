package PageObjects;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePagelinks {
	
	

		WebDriver driver;
		public HomePagelinks(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}



		public void HomePageLinks() throws IOException
		{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links:" +links.size());
		for(WebElement link: links)
		{

		String LinkUrl=link.getAttribute("href");
		if(LinkUrl == null || LinkUrl.trim().equals("") || !LinkUrl.startsWith("http")) {
		continue;
		}
		System.out.println(" The Homepage Link is:" +LinkUrl);
		URL url=new URL(LinkUrl);
		URLConnection urlconnection=url.openConnection();
		HttpURLConnection httpURLConnection=(HttpURLConnection) urlconnection;
		httpURLConnection.setConnectTimeout(9000);
		httpURLConnection.connect();


		if(httpURLConnection.getResponseCode()==200)
		{
		System.out.println(LinkUrl +"-"+ httpURLConnection.getResponseMessage());
		}
		else
		{
		System.out.println(LinkUrl +"-"+ httpURLConnection.getResponseCode());
		}

		httpURLConnection.disconnect();

		}
		}
	}