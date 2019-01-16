package com.adda.home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adda.utility.Log;

public class Login  {
	final WebDriver driver;
	
	@FindBy(id="signInLink")
	WebElement signinBtn;
	
	@FindBy(id="email")
	WebElement emailTextBox;
	
	@FindBy(id="password")
	WebElement passwordTextBox;
	
	@FindBy(id="loginSubmit")
	WebElement loginSubmitBtn;
	
	public Login(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void loginToResidence()
	{
		Log.startTestCase("loginToResidence");
		signinBtn.click();
		emailTextBox.sendKeys("bibhuti@3five8.com");
		passwordTextBox.sendKeys("Bibhuti@1993");
		Log.info("Entered Username and Password Successfully");
		loginSubmitBtn.click();
		Log.info("Logged in as residence Successfully");
		Log.endTestCase("loginToResidence");
	}
}





