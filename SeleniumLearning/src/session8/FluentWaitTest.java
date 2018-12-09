package session8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

// Fluent wait is used to wait for a condition , as well as frequency with which we want to check condition before throwsing exception ElementNotFound

public class FluentWaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.rediff.com/");
		
		//1.Create Fluent wait instance
		FluentWait fwait = new FluentWait (driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
		// 2. Create a webelement and associate Fluentwait with it
		WebElement element = (WebElement)fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='LIVE! RBI Governor met PM on Nov 9 possibly to thrash out issues']")));
		// 3. perform operation
		element.click();
		
		
		
		

	}

}
