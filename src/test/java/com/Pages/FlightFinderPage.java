package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Config.Config;
import com.Utility.CloseBrowser;
import com.Utility.LaunchApp;

public class FlightFinderPage {

	@FindBy (how=How.XPATH , using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objflightfinder;
	
	@FindBy (how=How.LINK_TEXT ,using="SIGN-OFF")
	WebElement objsignoff;
	
	public void loadFlightFinderPage()
	{
		
		PageFactory.initElements(Config.driver, this);
		
	}
	
	public void FlightFinderPage()
	{
		boolean flag=objflightfinder.isDisplayed();
		if(flag==true)
		{
			System.out.println("FlightFinder page is displayed");
		}
		
	}
	
	public void Signoffpage()
	{
		
		objsignoff.click();
		
	}
	public static void main(String[] args) {
		
		

		LaunchApp lc=new LaunchApp();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
		lc.maximizeBrowser();
		lc.wait(5);
		System.out.println("Launch App Successfully");
		
		LoginPage lp=new LoginPage();
		lp.loadloginpage();//Always Load PageFactory Initialization for every WebPage
		lp.enterUsername("jaydeep1");
		lp.enterPassword("password1");
		lp.ClickLogin();
		System.out.println("Login Successfully");
		
		
		FlightFinderPage fp=new FlightFinderPage();
		fp.loadFlightFinderPage();
		fp.FlightFinderPage();
		fp.Signoffpage();
		System.out.println("Successfully Sign Off from Account");
		
		

		CloseBrowser cb=new CloseBrowser();
		cb.closeBrowser();
		System.out.println("CloseBrowser Successfully");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
