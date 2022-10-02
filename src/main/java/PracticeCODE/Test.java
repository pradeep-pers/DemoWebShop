package PracticeCODE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	//private static final String WebDriverManager = null;
	static WebDriver driver;
	//WebDriverManager.chromedriver().setup();
	//WebDriverManager.chromedriver().setup();
	
	@SuppressWarnings("static-access")
	public Test(WebDriver driver)
	{
		this.driver=driver;
		// WebDriver driver1 = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver", "E:/Photo-Framework/DemoWebShop/Drivers/chromedriver.exe");  
		//WebDriverManager.chromedriver().setup();
		//Test.driver= new ChromeDriver(); 
		//WebDriverManager.chromedriver().setup();
	}
		
	public void open()
	
	{
		//WebDriverManager.Chromedriver().setup();
		Test.driver= new ChromeDriver(); 
		driver.get("http://google.com");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		Test test=new Test(driver);
		test.open();

	}

}
