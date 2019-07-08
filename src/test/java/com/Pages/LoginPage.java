package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Config.Config;
import com.Utility.CloseBrowser;
import com.Utility.LaunchApp;

public class LoginPage {
	
	@FindBy(how=How.XPATH ,using="//input[@name='userName']")
	WebElement objusername;
	
	@FindBy (how=How.XPATH ,using="//input[@name='password']")
	WebElement objpassword;
	
	@FindBy (how=How.XPATH , using="//input[@name='login']")
	WebElement objlogin;
	

	public void loadloginpage()
	{
		
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUsername(String username)
	{
		
		objusername.sendKeys(username);
		
	}
	
	public void enterPassword(String password)
	{
		
		objpassword.sendKeys(password);
		
	}
	
	public void ClickLogin()
	{
		objlogin.click();
		
	}
	public static void main(String[] args) {
		
		LaunchApp lc=new LaunchApp();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
		lc.maximizeBrowser();
		lc.wait(5);
		System.out.println("Launch App Successfully");
		
		LoginPage lp=new LoginPage();
		lp.loadloginpage();//Alway Load PageFactory Initialization
		lp.enterUsername("jaydeep1");
		lp.enterPassword("password1");
		lp.ClickLogin();
		System.out.println("Login Successfully");
		
		CloseBrowser cb=new CloseBrowser();
		cb.closeBrowser();
		System.out.println("CloseBrowser Successfully");
		
	}
	
	
	
	

}
