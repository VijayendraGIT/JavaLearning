package session7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		
		Select allCategories = new Select(driver.findElement(By.id("gh-cat")));
		allCategories.selectByVisibleText("Art"); // Visible Text
		Thread.sleep(3000);
		allCategories.selectByIndex(4); // Select by Index
		Thread.sleep(3000);
		allCategories.selectByValue("6000"); // Select by Value - It comes from code, in attribute value=6000
		
		Boolean status= allCategories.isMultiple();
		System.out.println("Status :"+status);
		

	}

}
