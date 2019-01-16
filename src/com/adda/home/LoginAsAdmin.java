package com.adda.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adda.utility.Log;

public class LoginAsAdmin {
	final WebDriver driver;
	
	@FindBy(id="admin-link")
	WebElement adminLink;
	   
	@FindBy(xpath="//a[@href='../myadda/index.php']")
	WebElement myAddaBtn;
	
	@FindBy(xpath="//p[@class='notification-heading-color font_size_16'][contains(text(),'Post Notice')]")
	WebElement postNoticeBtn;
	
	public LoginAsAdmin(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void loginToAdmin()
	{
		adminLink.click();
		Log.info("Logged in as Admin Successfully");
	}
	public void createNotice()
	{
		postNoticeBtn.click();
		
	}
	public void backToResidence()
	{
		myAddaBtn.click();
		Log.info("Back to residence URL");
	}

}
