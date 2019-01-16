package com.adda.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adda.utility.Log;

public class Logout {
	final WebDriver driver;
	
	@FindBy(id="userMenu")
	WebElement profileDrpDwn;
	
	@FindBy(xpath= "//a[@href='/user/logout.php']")
	WebElement signOut;
	
	public Logout(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void logoutUser()
	{
		profileDrpDwn.click();
		signOut.click();
		Log.info("Logged Out Successfully");
	}

}
