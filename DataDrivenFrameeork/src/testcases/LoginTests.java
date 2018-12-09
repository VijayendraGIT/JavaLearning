package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelUitlities.ExcelReader;

public class LoginTests {
	ExcelReader obj;
	WebDriver driver=null;
	Object[][] data = null;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	}
	
	@BeforeMethod
	public void browserSetup(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@DataProvider(name="loginData")
	public Object[][] populateData() throws IOException{
		obj = new ExcelReader();
		data = obj.readData();
		//verify Data by print 
		System.out.println("***** Data *****");
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				System.out.println("data["+i+"]["+j+"]="+data[i][j]);
			}
		}
		return data;
	}
	
	@Test(dataProvider="loginData")
	public void loginTests(String username , String password) throws InterruptedException{
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/# ");
		driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(6000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder='Search mail']")).isDisplayed(), "Credentials not valid");
		System.out.println("Logged in Successfully !!");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
