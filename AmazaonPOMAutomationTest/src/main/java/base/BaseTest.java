package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.GenericUtilities;

public class BaseTest {
	public static WebDriver driver;
	public static Properties p;
	
	public BaseTest() throws IOException{
		//Read property file
		p = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		FileInputStream stream = new FileInputStream(file);
		p.load(stream);
	}
	
	public static void initalization(){
		String browser = p.getProperty("browser");
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(GenericUtilities.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(GenericUtilities.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		
		driver.get(p.getProperty("url"));
		
	}
}
