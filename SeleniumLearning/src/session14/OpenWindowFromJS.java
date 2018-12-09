package session14;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWindowFromJS {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open('https://www.google.com')");
		
		// How to switch windows
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Number of tabs"+tabs.size());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		
		
		

	}

}
