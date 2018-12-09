package session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

		//Set property
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Launch a browser
		driver.get("https://www.seleniumhq.org/"); // Open URL
		driver.manage().window().maximize(); // maximizing Window
		driver.manage().deleteAllCookies(); //delete all cookies
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // adding time to wait browser to load page
		
		System.out.println("Title:"+driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println("Current URL:"+driver.getCurrentUrl());
		
		driver.navigate().to("https://www.google.com"); // Navigate to new website
		System.out.println(driver.getTitle()); // gets title of page
		Thread.sleep(3000);
		driver.navigate().back(); // navaigate to previous page
		System.out.println(driver.getTitle());
		Thread.sleep(3000); 
		driver.navigate().forward(); // navigates to forward page
		System.out.println(driver.getTitle());
		Thread.sleep(3000);		
		driver.navigate().refresh(); // refreshes current window
		System.out.println(driver.getTitle());
		Thread.sleep(3000);		
		
		
		driver.close();
		//driver.quit();
		
		
		

	}

}
