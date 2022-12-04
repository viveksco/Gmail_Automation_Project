package com.testing;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageFile extends LocatorFile {
	// Define WebDriver
	public WebDriver driver;
	 Actions Act,Act2;
	// Method for Open Brower and assign Chrome WebDriver

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\TestNG\\Final_Project\\Project_Data\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}

	public void closeBrowser(){
		driver.quit();
	}

	public void openURL() throws InterruptedException {
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-469397707%3A1669586515113628&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAtmrnmkD847U1g3lgbogIbtnlQDlR_yD_1XhIc30pvfJtEkckv3kwYLGGKZ8jbTuN97Qb0-"); // opening
		Thread.sleep(2000);
	}

	public void verifyOpenLink() {
		if (!driver.getCurrentUrl().contains("signin")) 
			System.out.println("Your are not on the right Web Page.!");
		 else
			System.out.println("Current open Link Validation passed.!");
	}
	
	public void UIValidation_username() {

		if (usernameField != null && nextbuttonField != null) 
			System.out.println("UI Validation Passed.!");
		 else 
			System.out.println("UI Validation Failed.!");
	}

	public void NoUserName() throws InterruptedException {
		nextbuttonField.click();
		Thread.sleep(1000);
		if(!ErrorMessage_Username.getText().isBlank())
			System.out.println(ErrorMessage_Username.getText()); 
		 
	}

	public void wrongUserName() throws InterruptedException {
		usernameField.sendKeys("hellow@gmail.com");
		nextbuttonField.click();
		System.out.println(ErrorMessage_Username.getText());
		Thread.sleep(2000);
	}

	public void rightUserName() throws InterruptedException {
		usernameField.clear();
		usernameField.sendKeys("testproject191291@gmail.com");
		nextbuttonField.click();
		Thread.sleep(2000);
	}

	public void wrongPassword() throws InterruptedException {
		passwordField.sendKeys("asdfasdfasdf");
		nextbuttonField_password.click();
		System.out.println(ErrorMessage_password.getText());
		Thread.sleep(2000);
	}

	public void rightPassword() throws InterruptedException {
		passwordField.clear();
		passwordField.sendKeys("Test@1219");
		nextbuttonField_password.click();
		Thread.sleep(5000);
	}

	public void verifyInboxPage() throws InterruptedException {
		if(driver.getCurrentUrl().contains("inbox"))
			System.out.println("User is in Inbox");
		
		Thread.sleep(6000);
	}

	public void logOut() throws InterruptedException {
		
		profile_Button.click();
		driver.switchTo().frame("account");
		logout_Button.click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().contains("signinchooser"))
			System.out.println("User Log Out Successfully.!");
		else
			System.out.println("Something went Wrong.!");
		
		Thread.sleep(2000);
	}
	public void totalNumber_EMail_FirstPage() throws InterruptedException {
		System.out.println("Total Number Of EMail on First Page: "+totalNumber_EMail_FirstPage.getText());
		Thread.sleep(2000);
	}
	public void totalNumber_EMail() throws InterruptedException {
		System.out.println("Total Number Of EMail in Inbox: "+totalNumber_EMail.getText());
		Thread.sleep(2000);
	}
	
	public void select_Delete() throws InterruptedException {
		SelectEmail.click();
		Thread.sleep(2000);
		Click_deleteButton.click();
		System.out.println("Verification: "+Message_popUp.getText());
		Thread.sleep(2000);
	}

	public void Click_moreOption() throws InterruptedException {
		Click_moreOption.click();
		Thread.sleep(2000);
	}

	public void click_Trash() throws InterruptedException {
		Click_Trash.click();
		Thread.sleep(2000);
	}

	public void select_Trash_Inbox() throws InterruptedException {
		
		Act = new Actions(driver);
		Act.dragAndDrop(SourceMail,InboxFolder).build().perform();
		Thread.sleep(5000);
		System.out.println("Verification: "+Message_popUp.getText());
		Thread.sleep(3000);
		InboxFolder.click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		
	}
	
	public void Read_Unread_rightClick() throws InterruptedException
	{	
		Act2 = new Actions(driver);
		Act2.contextClick(SelectEmail).build().perform();
		Thread.sleep(2000);
		if(MarkasRead.isDisplayed())
		{
			MarkasRead.click();
			System.out.println(Message_popUp.getText());
			
		}
		else if(MarkasUnread.isDisplayed())
		{
			MarkasUnread.click();
			System.out.println(Message_popUp.getText());
		} 
		else 
		{
			System.out.println("Something went wrong.!");
		}
		SelectEmail.click();
		Thread.sleep(2000);
		
	}
	public void Read_Unread_Method() throws InterruptedException
	{	
		SelectEmail.click();
		Thread.sleep(2000);
		Click_moreButton.click();
		Thread.sleep(2000);
		
		if(MarkasRead_new.isDisplayed())
		{
			MarkasRead_new.click();
			System.out.println(Message_popUp.getText());
		}
		else if(MarkasUnread_new.isDisplayed())
		{
			MarkasUnread_new.click();
			System.out.println(Message_popUp.getText());
		} 
		else {
			
			System.out.println("");
		}
		SelectEmail.click();
		Thread.sleep(5000);
		
	}

	
	
	
	

}
