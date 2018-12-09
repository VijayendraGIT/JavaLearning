package session15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://html.com/input-type-file/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='om-lightbox-postal-optin-wrap']/a")).click();
		
		driver.findElement(By.xpath("//input[@type='file'][1]")).sendKeys("C:\\Users\\Admin\\Downloads\\photo.jpg");
		

	}

}
