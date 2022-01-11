package org.test;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Junit_Sample extends BaseClass{
	
	@BeforeClass
	public static void launchBrowser() {
		browserLaunch();
		maxWindow();
	}
	@AfterClass
	public static void quitBrowser() {
		closeBrowser();
	}
	
	@Before
	public void startTime()   {
		findsyDateTime();
	}
	@After
	public void endTime()   {
		findsyDateTime();
	}
		public static WebElement username;
		public static WebElement password;
		public static WebElement login;
	
	
	@Test
	public  void tc1() throws InterruptedException{
		
		PageFactory.initElements(driver, Junit_Sample.class);
		
	urlLaunch("http://adactinhotelapp.com/");
	username.sendKeys("bharathkanna");
	password.sendKeys("12345678");
	login.click();
}
	@Test
	@Ignore
	public  void tc2() throws InterruptedException{
		urlLaunch("http://adactinhotelapp.com/");
		username.sendKeys("kanna");
		password.sendKeys("12345678");
		login.click();
	}
	@Test
	public  void tc3() throws InterruptedException{
		urlLaunch("http://adactinhotelapp.com/");
		username.sendKeys("bharathkanna");
		password.sendKeys("98745");
		login.click();
}}