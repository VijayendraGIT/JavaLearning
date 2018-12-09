package session3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//We have 8 locators
// 1. id
// 2. name
// 3. linktext
// 4. partialLinkText
// 5. tagname
// 6. classname
// 7. css
// 8. xpath

//F12 - opens the inspection window
public class Locators {

	public static void main(String[] args) {
		
		//Set property
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Launch a browser
		driver.get("http://www.rediff.com/"); // Open URL
		driver.manage().window().maximize(); // maximizing Window
		driver.manage().deleteAllCookies(); //delete all cookies
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // adding time to wait browser to load page
	
		driver.findElement(By.id("srchword")).sendKeys("ABC"); // Most preferred Locator - id are unique , no multiple occurence in web page code
		driver.findElement(By.name("srchword")).sendKeys("XYZ"); // name locator
		driver.findElement(By.className("newsrchbtn")).click(); // classname locator
		
		
		

	}

}
