package session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new driver
	
		System.setProperty("webdriver.gecko.driver", "E:\\Work\\Simulator_Automation\\drivers\\geckodriver.exe");
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("https://www.google.com/");
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Launches Browser
		driver.get("https://www.seleniumhq.org/"); // Opens URL in browser
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String title = driver.getTitle(); // Get title of page
		System.out.println(title);
		
		if(title.equals("Selenium - Web Browser Automation")){
			System.out.println("Title is correct");
		} else {
			System.out.println("Title incorrect");
		}

		//To get code for the page
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		firefoxDriver.close();

	}

}
