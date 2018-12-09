package session12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseHovering {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		// 1. Create an instance of Action class
		Actions action = new Actions(driver);
		// 2. Move mouse to the element we want to hover mouse
		action.moveToElement(driver.findElement(By.className("burger-bread"))).build().perform();
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Travel Info')]"))).build().perform();
		Thread.sleep(3000);
		
		//action.moveToElement(driver.findElement(By.partialLinkText("FAQ"))).click();
		driver.findElement(By.partialLinkText("FAQ")).click();
		
		

	}

}
