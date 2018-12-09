package session15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/droppable");
		driver.switchTo().frame(0);
		
		// 1. Create an instance of Action class
		Actions action = new Actions(driver);
		// Use Click and hold method
		// Use and find draggable element
		// drop to droppable webelement location
		// Release , build and Perform
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();

	}

}
