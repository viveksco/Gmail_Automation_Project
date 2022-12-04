package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test_Scenario_3 {
	
	PageFile pf = new PageFile();
	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		  pf.openBrowser();
		  pf.openURL();
	}
	  
	@Test(priority = 1)
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
		pf.totalNumber_EMail();
		pf.select_Delete();
	}
	
	@Test(priority = 5)
	public void TC005() throws InterruptedException {
		pf.totalNumber_EMail();
	}
	
	@Test(priority = 6)
	public void TC006() throws InterruptedException {
		pf.Click_moreOption();
		pf.click_Trash();
	}
	@Test(priority = 7)
	public void TC007() throws InterruptedException {
		pf.select_Trash_Inbox();
		pf.totalNumber_EMail();
	}
	
	@Test(priority = 8)
	public void TC008() throws InterruptedException {
		pf.logOut();
	}
	
	@AfterClass
	public void terminateBrowser() throws InterruptedException{
		pf.closeBrowser();
	}

}
