package session11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSuggestionsHandling {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li/div[1]"));
		System.out.println("Number of Suggestions ="+suggestions.size());
		
		for(WebElement suggestion : suggestions){
			
			System.out.println("Suggestions : "+suggestion.getText());
			if(suggestion.getText().contains("selenium download")){
				suggestion.click();
			}
			
		}

	}

}
