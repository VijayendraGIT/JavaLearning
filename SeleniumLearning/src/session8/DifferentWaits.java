package session8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentWaits {
	
	// PageLoadTimeOut : Page loading time given to load from server
	//Implicit Wait : It instructs driver to wait for sometime by poll. Once declared it is applicable for entire lifecycle of webdriver.
	// By default value is 0. Periodically read DOM to check for a reload. If loaded remaining amount og given time will be skipped.
	//Explicit wait : It instructs driver to wait for a particular web element to meet a condition for a given time
	// - Applicable for the a particular instance only
	// - it is useful for dynamically loaded AJAX components

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//PageLoad Time out
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.rediff.com/");
		
		

		

	}

}
