package session10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowPopups {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.linkText("Good PopUp #1")).click();
		Thread.sleep(3000);

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parentWindowId=" + parentWindowId);

		String childWindowId = it.next();
		System.out.println("childWindowId=" + childWindowId);

		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);

		System.out.println("Child Title:" + driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Title:" + driver.getTitle());

	}

}
