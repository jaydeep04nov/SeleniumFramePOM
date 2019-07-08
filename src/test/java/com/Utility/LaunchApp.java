package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Config.Config;

public class LaunchApp {
	
	public void openBrowser(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaydeep\\Desktop\\Selenium Testing Material\\chromedriver.exe");
		Config.driver=new ChromeDriver();
		
	}
	public void enterApplicationURL(String url)
	{
		
		Config.driver.get(url);
		
	}
	public void maximizeBrowser()
	{
		
		Config.driver.manage().window().maximize();
		
	}
	public void wait(int seconds)
	{
		Config.driver.manage().timeouts().pageLoadTimeout(seconds,TimeUnit.SECONDS);
		
	}
	
	public static void main(String[] args) {
		
		LaunchApp lc=new LaunchApp();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://newtours.demoaut.com/mercurysignon.php");
		lc.maximizeBrowser();
		lc.wait(5);
		System.out.println("LaunchApp Successfully");
		
		
		
		
		
		
		
		
		
	}
	

}
