package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test_Scenario_1 {
	PageFile pf = new PageFile();
  
  @BeforeTest 
  public void launchBrowser() throws InterruptedException{
	  pf.openBrowser();
	  pf.openURL();
  }
  
  @Test(priority = 1)
  public void TC001(){
	  pf.verifyOpenLink();
  }
  
  @Test(priority = 2)
  public void TC002(){
	  pf.UIValidation_username();
  }
  
  @Test(priority = 3)
  public void TC003() throws InterruptedException{
	  pf.NoUserName();
  }
  
  @Test(priority = 4)
  public void TC004() throws InterruptedException{
	  pf.wrongUserName();
  }
  
  @Test(priority = 5)
  public void TC005() throws InterruptedException{
	  pf.rightUserName();
  }
  
  @Test(priority = 6)
  public void TC006() throws InterruptedException{
	  pf.wrongPassword();
  }
  
  @Test(priority = 7)
  public void TC007() throws InterruptedException{
	  pf.rightPassword();
  }
  
  @Test(priority = 8)
  public void TC008() throws InterruptedException{
	  pf.verifyInboxPage();
  }
  
  @Test(priority = 9)
  public void TC009() throws InterruptedException{
	  pf.logOut();
  }
  
  @AfterTest
  public void terminateBrowser(){
	  pf.closeBrowser();
  }

}
