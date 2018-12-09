package session10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert says :"+alert.getText());
		
		if(alert.getText().contains("Please enter a valid user name")){
			System.out.println("This is correct alert message");
		} else {
			System.out.println("This is incorrect alert message");
		}

		alert.accept();
		//alert.dismiss();
		
		
	}

}
