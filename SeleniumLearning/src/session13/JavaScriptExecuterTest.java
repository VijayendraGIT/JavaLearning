package session13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterTest {
	
	//It is an interface that helps to execute 'JavaScript' through Selenium
	// 2 methods
	// 1. executeAsyncScript - it is rarely used
	//  -page rendering is fast
	//  -doesn't wait for page to download
	//	-it works with current window or frame
	// 2. executeScript  - 99% is getting used in Selenium
	//  - it takes parameters
	//  - it can returns datatypes like Boolean,int,long,string,WebElement etc
	//  - it works with current window or frame

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com/");

		// Syntax 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Click() operation
		WebElement element = driver.findElement(By.partialLinkText("Sign in"));
		js.executeScript("arguments[0].click();", element);
		
		// Sendkeys operation
		js.executeScript("document.getElementById('login1').value='ABC';");
		
		Thread.sleep(3000);
		//Checkbox operation
		WebElement checkbox = driver.findElement(By.id("remember"));
		js.executeScript("arguments[0].checked=false;", checkbox);
		
		Thread.sleep(3000);
		//Refresh page
		js.executeScript("history.go(0)");
		
		//Get title
		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title = "+title);
		
		//Domain
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain:"+domain);
		
		//URL
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL ="+url);
		
		
	}

}
