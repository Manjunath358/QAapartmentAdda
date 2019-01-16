package com.adda.main;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.adda.home.DubaiRequestDemo;
import com.adda.home.Login;
import com.adda.home.LoginAsAdmin;
import com.adda.home.Logout;
import com.adda.home.RequestDemo;
import com.adda.home.VerifyConversations;
import com.adda.utility.Log;

public class MainClass  {
		
		static WebDriver driver;
		Login home;
		Logout logout;
		LoginAsAdmin admin;
		VerifyConversations convrstn;
		RequestDemo demo;
		DubaiRequestDemo dubai;
		String residenceUrl = "https://www.apartmentadda.com";
		String addaIOurl = "http://demo.adda.io";
		
		@BeforeSuite
		  public void beforeMethod() {
			String log4jConfPath = "C:\\Users\\ADDA\\eclipse-workspace\\adda\\log4j.xml";
			DOMConfigurator.configure(log4jConfPath);
			Log.info("Staring Firfox Browser");
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.21.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		 
		}
		
//		@Test(priority=0)
//		public void logInToResidence() throws InterruptedException
//		{
//			driver.get(residenceUrl);
//			home = PageFactory.initElements(driver, Login.class);
//			convrstn = PageFactory.initElements(driver, VerifyConversations.class);
//			
//			home.loginToResidence();
//			Thread.sleep(6000);
//			//convrstn.CreateConversations();
//			
////			demo = PageFactory.initElements(driver, RequestDemo.class);
////			demo.launchToASRequestDemoFormPage();
//		}
//		@Test(priority=1)
//		public void LogInAsAdmin()
//		{
//			admin = PageFactory.initElements(driver, LoginAsAdmin.class);
//			admin.loginToAdmin();
//			admin.backToResidence();
//		}
//		@Test(priority=2)
//		public void LogOutAsResidence()
//		{
//			logout = PageFactory.initElements(driver, Logout.class);
//			logout.logoutUser();
//		} 
		@Test
		public void dubaiAdda() throws InterruptedException
		{
			driver.get(addaIOurl);
			dubai = PageFactory.initElements(driver, DubaiRequestDemo.class);
//			dubai.verifyContactPage();
//			dubai.verifyContactUsForm();
//			dubai.verifyGetStared();
			dubai.verifyJoinAddaFlow();
		}
		
		@AfterSuite
		  public void afterMethod() {
			
		    driver.quit();
		  }
		
		
		
}
