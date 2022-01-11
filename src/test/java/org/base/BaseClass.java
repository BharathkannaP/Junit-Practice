package org.base;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert b;

	
	public static void browserLaunch(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void bowserTitle() {
		System.out.println(driver.getTitle());
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
			}
	public static void textFill(WebElement element, String text) {
		element.sendKeys(text);
		
		}
	public static void btnClick(WebElement element) {
		element.click();
	}
	@SuppressWarnings("deprecation")
	public static void applywaitToaElement() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void findsyDateTime() {
		java.util.Date c=new java.util.Date();
	}
	public static void takeScreenshot(String snap)throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\gopal\\eclipse-workspace\\MavenA\\ScreenShot\\.png");
		FileUtils.copyFile(source, destination);
	}
	public static void moveToElements(WebElement element) {
		a= new Actions(driver);
		a.doubleClick(element).perform();
				
	}
	public static void dropdwn(WebElement element, String text) {
		Select drop=new Select(element);
		drop.selectByVisibleText(text);
	}
	public static void textfromBox(WebElement element, String wrd) {
		String text= element.getAttribute("value");
		System.out.println("value" +text);
	}
	public static void close() {
		driver.close();
	}
	public static void alert(WebElement element ) {
		b=driver.switchTo().alert();
		b.accept();
				}
	public static void alertwith_string(WebElement element) {
		b=driver.switchTo().alert();
		b.sendKeys("Hi");
		b.accept();
	}
	public static void scrollby(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	public static void time(int value) throws InterruptedException {
		Thread.sleep(value);
				}
	public static void robot(int Keys) {
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_X);
         r.keyRelease(KeyEvent.VK_CONTROL);
         r.keyRelease(KeyEvent.VK_X);
	}
	public static void closeBrowser() {
		driver.quit();
	}
	
	}