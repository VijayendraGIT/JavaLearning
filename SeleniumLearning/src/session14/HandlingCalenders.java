package session14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenders {

	public static void main(String[] args) throws InterruptedException {
		
		String date = System.getProperty("time");
		System.out.println(date);

		System.setProperty("webdriver.chrome.driver",
				"E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[@class='picker-first2']/button[@class='ui-datepicker-trigger'][1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody[1]/tr/td[ @data-month='11' and @data-year='2018']/a[contains(text(),'24')]")).click();
		
		

	}

}
