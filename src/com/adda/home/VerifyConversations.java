package com.adda.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyConversations {
	final WebDriver driver;
	
	@FindBy(xpath= "//div[@class='input-placeholder']")
	WebElement startConvrstn;
	
	@FindBy(id= "topic-1")
	WebElement titleTextBox;
	
	@FindBy(id= "taTextElement8241789609066877")
	WebElement messageTextBox;
	
	@FindBy(xpath= "//input[@type='submit']")
	WebElement createConvrstn;
	
	public VerifyConversations(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void CreateConversations() throws InterruptedException
	{
		startConvrstn.click();
		titleTextBox.sendKeys("Testing Conversation Automation");
//		messageTextBox.click();
		Thread.sleep(10000);
		messageTextBox.sendKeys("Testing Conversation");
		createConvrstn.click();
	}
	

}
