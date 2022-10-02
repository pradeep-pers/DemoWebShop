package com.WebShop.Utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	
	public ReadConfig() 
	{
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	
	public String getApplicationURL()
	
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
    
	public String getUserName()
	{
		String UserName=prop.getProperty("username");
		return UserName;
	}
	
	public String getPassword()
	{
		String Password=prop.getProperty("password");
		return Password;
	}
	public String getBrowser()
	{
		String Browser=prop.getProperty("browser");
		return Browser;
	}
	public String getChromePath()
	{
	 String Chromepath=prop.getProperty("chromepath");
	 return  Chromepath;
    }
	
	public String getFirefoxPath()
	
	{
		String Firefoxpath=prop.getProperty("firefoxpath");
		return Firefoxpath;
	}
	public String getIEPath()
	{
		String IEpath=prop.getProperty("iepath");
		return IEpath;
	}
}