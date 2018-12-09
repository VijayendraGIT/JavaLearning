package session7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		
		// Download common io jars from Apache website : http://commons.apache.org/proper/commons-io/download_io.cgi
		
		//1. take Screenshot in "File" format
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//2. Copy this file to desired loaction using copyFile
		FileUtils.copyFile(src,new File("E:\\Work\\JavaLearningClasses2\\SeleniumLearning\\Screenshots\\screenshot.png"));


	}

}
