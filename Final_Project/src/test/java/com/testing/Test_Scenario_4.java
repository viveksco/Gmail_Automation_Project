package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Scenario_4 {
	
	PageFile pf = new PageFile();
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		  pf.openBrowser();
		  pf.openURL();
	}
	
	@Test (priority = 1)
	public void TC001() {
		pf.verifyOpenLink();
	} 
	
	@Test(priority = 2)
	public void TC002() throws InterruptedException {
		pf.rightUserName();
		pf.rightPassword();
	} 
	
	@Test(priority = 3)
	public void TC003() throws InterruptedException {
		pf.verifyInboxPage();
	} 
	
	@Test(priority = 4)
	public void TC004() throws InterruptedException {
		pf.Read_Unread_rightClick();
		//pf.Read_Unread_Method();
	} 
	@Test(priority = 5)
	public void TC005() throws InterruptedException {
		pf.Read_Unread_Method();
	} 
	
	@Test(priority = 6)
	public void TC006() throws InterruptedException {
		pf.logOut();
	}
	  
	@AfterClass
	public void terminateBrowser() {
		pf.closeBrowser();
	}
}
