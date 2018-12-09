package session9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// FindElements - Returns list of web elements, Find all elements in currentpage using locators
public class FindElementsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		System.out.println("No of Images in Page:"+images.size());
		
		for(WebElement img: images){
			
			System.out.println("Image Link:"+img.getAttribute("alt"));
		}
	
	}

}
