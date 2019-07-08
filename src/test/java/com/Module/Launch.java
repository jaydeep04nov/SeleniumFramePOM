package com.Module;

import org.testng.annotations.Parameters;


import org.testng.annotations.Test;

import com.Utility.LaunchApp;
@Test(priority=1)
@Parameters({"browser","url","seconds"})

public class Launch {
	
	public void executeLaunch(String browser,String url,int second)
	{
		LaunchApp lc=new LaunchApp();
		lc.openBrowser(browser);
		lc.enterApplicationURL(url);
		lc.maximizeBrowser();
		lc.wait(second);
		System.out.println("LaunchApp Successfully");
		
		
	}

}
