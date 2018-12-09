package session6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckVisibility {

	public static void main(String[] args) {
		
		//isDisplayed() - used to verify presence of a webelement within page. It returns false if not displayed
		// It is capable of checking prensence of all kinds of webelements.
		//isEnabled() - verification of webelement is enabled or disabled with in page. it is used for "Buttons".
		//isSelected() - used to verify it the webelement is selected or not. Used for "Radio buttons, dropdown and checkboxes"
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	
		driver.get("https://reg.ebay.in/reg/PartialReg");
		Boolean status = driver.findElement(By.id("ppaFormSbtBtn")).isDisplayed();
		System.out.println("Register button display status: "+status);  // true
		
		status = driver.findElement(By.id("ppaFormSbtBtn")).isEnabled();
		System.out.println("Register button Enable status: "+status);  // false
		
		status = driver.findElement(By.xpath("//span[@class='gspr chk-off']")).isSelected();
		System.out.println("Checkbox selection status: "+status);  // false
				
		


	}

}
