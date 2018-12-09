package session15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverTest {

	// No browser is launched
	// Also know as Headless browser or Ghost Driver
	// Action classes should not be used  in this
	// Very fast in execution. it runs in background
	// htmlUnitDriver jar (htmlunit-driver-2.33.3.jar)is required and should be downloaded : https://github.com/SeleniumHQ/htmlunit-driver/releases
	// htmlUnitDriver+phantomJS(javascript)
	
	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();

		driver.get("https://www.google.com");
		System.out.println("Before Search : title-"+driver.getTitle());
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@value='Google Search'][1]")).click();
		System.out.println("After Search : title+"+driver.getTitle());
		System.out.println("After Search : URL :"+driver.getCurrentUrl());
		
	}

}
