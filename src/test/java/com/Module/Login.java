package com.Module;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.Utility.CloseBrowser;

public class Login {
	@Test(priority=2)
	@Parameters({"username","password"})
	
	public void executeLogin(String username, String password)
	{
		
		LoginPage lp=new LoginPage();
		lp.loadloginpage();//Alway Load PageFactory Initialization
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.ClickLogin();
		System.out.println("Login Successfully");
		
		CloseBrowser cb=new CloseBrowser();
		cb.closeBrowser();
		System.out.println("CloseBrowser Successfully");
	}

}
