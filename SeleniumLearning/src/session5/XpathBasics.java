package session5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBasics {
	// Relative path starts with -> //
	// Absolute path starts with -> /

	//div[@class='n_tabnormal'][3]
	//*[@id='new_design']/div/div/div[2]/h5/a/img
	
	//contains() - it is used when value of an attribute changes dynamically
	//It can find elements with partial text
	//  //*[contains(text(),'Cricket')]
	
	// And and or 
	// or - 2 conditions can be specified , one needs to be satisfied
	// //div[@id='srchinputcopy' or @class='srchinputcopy']
	// and - 2 conditions can be specified , both needs to be satisfied
	// //div[@id='srchinputcopy' and @class='srchinputcopy']	
	
	//Starts-with
	// //img[starts-with(@alt,'Life in Naxal country')]
	
	//text() - searches text in the html document 
	//  //a[text()='Night Vision Binoculars']
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.rediff.com/");
		
		driver.findElement(By.xpath("//div[@class='n_tabnormal' and contains(text(),'News')]")).click();

		
		


	}

}
