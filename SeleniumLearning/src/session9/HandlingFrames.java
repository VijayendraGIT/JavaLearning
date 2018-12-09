package session9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	
	// iframe : it is a webpage which is embedded in another webpage or an HTML document inside another document

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		int frames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("No of frame:"+frames);
		
		List <WebElement> element = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frame:"+element.size());
		
		for(WebElement frame: element){
			System.out.println("Frame id:"+frame.getAttribute("id")+"| Frame name:"+frame.getAttribute("name"));
		}
		
		
		// Swith to frame
		//driver.switchTo().frame("moneyiframe"); // By id
		driver.switchTo().frame(1); // By index , Index starts with 0
		
		driver.findElement(By.className("mw001-widget-getquote")).sendKeys("ABC");
		
		driver.switchTo().parentFrame(); // Switching back to parent frame
		
		//driver.findElement(By.className("mw001-widget-getquote-btn")).click();
		
		
		

	}

}
