package com.testing;

import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sun.org.apache.xpath.internal.operations.Div;

public class LocatorFile{
	// Common Locators
	@FindBy(xpath = "//*[@name=\"identifier\"]") public WebElement usernameField;
	@FindBy(xpath = "//*[@id=\"identifierNext\"]") public WebElement nextbuttonField;
	@FindBy(xpath="//div[@class='o6cuMc']") public WebElement ErrorMessage_Username;
	@FindBy(xpath = "//*[@name=\"Passwd\"]") public WebElement passwordField;
	@FindBy(xpath = "//*[@id=\"passwordNext\"]") public WebElement nextbuttonField_password;
	@FindBy(xpath = "//span[contains(text(),'Wr')]") public WebElement ErrorMessage_password;
	@FindBy(xpath = "//img[@class = 'gb_Ia gbii']") public WebElement profile_Button;
	@FindBy(xpath = "(//div[@class ='SedFmc'])[2]") public WebElement logout_Button;
	
	//----------------------------------Test Scenario 2--------------------------------------
	@FindBy(xpath = "(//*[@class='ts'])[2]")public WebElement totalNumber_EMail_FirstPage;
	@FindBy(xpath = "(//*[@class='ts'])[3]")public WebElement totalNumber_EMail;
	
	//----------------------------------Test Scenario 3--------------------------------------
		@FindBy(xpath = "//*[contains(text(),'More')]")public WebElement Click_moreOption;
		@FindBy(xpath = "(//*[@class='asa'])[3]")public WebElement Click_deleteButton;
		@FindBy(linkText = "Trash") public WebElement Click_Trash;
		@FindBy(xpath = "//td[@id=':np']")public WebElement SourceMail;
		@FindBy(xpath = "//span[@class='bAq']") public WebElement Message_popUp;
		@FindBy(linkText = "Inbox") public WebElement InboxFolder;
		
	//----------------------------------Test Scenario 4--------------------------------------	
		@FindBy(xpath = "(//*[contains(@class,'zA')])[4]/td[2]") WebElement SelectEmail;
		@FindBy(xpath = "//*[contains(text(),'Mark as read')]") WebElement MarkasRead;
		@FindBy(xpath = "//*[contains(text(),'Mark as unread')]") WebElement MarkasUnread;
		@FindBy(xpath = "(//*[@class='asa'])[11]")public WebElement Click_moreButton;
		@FindBy(xpath = "(//*[contains(text(),'Mark as read')])[2]") WebElement MarkasRead_new;
		@FindBy(xpath = "(//*[contains(text(),'Mark as unread')][2])") WebElement MarkasUnread_new;
		
		
		
}