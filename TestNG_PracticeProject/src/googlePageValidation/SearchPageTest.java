package googlePageValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchPageTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setupTest(){
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\TestNG_PracticeProject\\Drivers\\chromedriver.exe");
		
	}
	@BeforeMethod
	public void invokeBrowser(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	
	@Test(priority=1)
	public void verifyTitle(){
		//Asserts of two types : 1. Hard Asserts 2. Soft Asserts	
		//hard Asserts - Stops execution immediatley after throwing AssertException and marks Test as Failed
		//Soft Asserts - it doesn't abort current execution and logs report as fail
		
		Assert.assertEquals(driver.getTitle(), "Google");
		Assert.assertNotEquals(driver.getTitle(), "Google New page");
		
	}
	
	@Test(priority=2)
	public void validateLogo(){
		//driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertEquals(driver.findElement(By.id("hplogo")).isDisplayed(), true);
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed()); // Validation with condition comes as true
		Assert.assertFalse(!driver.findElement(By.id("hplogo")).isDisplayed()); // Validation with condition comes as false
	}
	
	@Test(priority=3,enabled=false)
	public void validateSearchBar(){
		//driver.findElement(By.xpath("//input[@title='Search']")).isDisplayed();
		Assert.assertEquals(driver.findElement(By.xpath("//input[@title='Search']")).isDisplayed(), true);
	}
	
	@Test(priority=4,enabled=false)
	public void validateSearchButton(){
		//driver.findElement(By.xpath("input[@value='Google Search']")).isDisplayed();
		//Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Google Search'][1]")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Google Search'][1]")).isEnabled(), true);
	}
	
	@Test(priority=5,enabled=false)
	public void validateMicrophoneButton(){
		//driver.findElement(By.xpath("//span[@class='hb2Smf']")).isDisplayed();
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='hb2Smf']")).isDisplayed(), true);
	}
	
	@Test(priority=6,enabled=false)
	public void validateSearch() throws InterruptedException{
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("ABC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Google Search'][1]")).click();
		Thread.sleep(3000);
		Assert.assertNotEquals(driver.getTitle(),"Google");
	}
	
	@AfterMethod
	void tearDown() throws InterruptedException{
		//Thread.sleep(3000);
		driver.close();
	}

}
