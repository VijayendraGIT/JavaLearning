package session4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2 {
	
	//Linktext - starts with anchor tag <a - text associated with href - full text is used
	//partialLinktext -  starts with anchor tag <a - text associated with href - only partial text is used
	//Tagname - only one instance of tag should be present to use this.
	//CssSelector- 2 types - id and classname - should be unique in html
	//  By.cssSelector("tag#id_value") - For using id for cssselector =>("input#srchword")
	//  By.cssSelector("tag.class_name") - For using class name for Css Selector => ("input.homesrchbox")
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.google.com/");
		
		

//		driver.findElement(By.linkText("Gmail")).click();
//		Thread.sleep(30);
//		driver.navigate().back();
//		Thread.sleep(30);
		//driver.findElement(By.partialLinkText("Gma")).click();
		
		//driver.navigate().to("https://in.yahoo.com/?p=us");
		
		//driver.findElement(By.tagName("input")).sendKeys("ABC");
		
		driver.navigate().to("http://www.rediff.com/");
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.cssSelector("input#srchword")).sendKeys("ABC");
		driver.findElement(By.cssSelector("input.homesrchbox")).sendKeys("XYZ");

	}

}
