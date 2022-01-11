package org.test;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		browserLaunch();
		urlLaunch("http://adactinhotelapp.com/");
		maxWindow();
		bowserTitle();
		textFill(driver.findElement(By.id("username")),"bharathkanna");
		WebElement txtPass =driver.findElement(By.id("password"));
		textFill(txtPass, "12345678");
		textfromBox(txtPass,"");
		btnClick(driver.findElement(By.id("login")));
		dropdwn(driver.findElement(By.id("location")), "London");
		takeScreenshot("After Login1");
		time(50);	
		scrollby(driver.findElement(By.xpath("//a[text()='www.adactin.com']")));
		urlLaunch("http://demo.automationtesting.in/Alerts.html");
		btnClick(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")));
		btnClick(driver.findElement(By.xpath("//button[@class='btn btn-primary']")));
		btnClick(driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")));
		WebElement alert=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		textFill(alert, "hi ramya");
		urlLaunch("https://www.flipkart.com/");
		WebElement user=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		textFill(user, "BK");
		moveToElements(user);
		
		closeBrowser();
		
		

		
	}

}
