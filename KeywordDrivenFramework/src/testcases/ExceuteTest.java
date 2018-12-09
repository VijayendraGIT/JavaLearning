package testcases;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excelUtilities.ReadExcel;
import objectUtilites.ReadObjectFile;
import operations.PerformUIOperations;

public class ExceuteTest {
	//variables to be used across all methods
	String testSteps [][] = null;
	WebDriver driver;
	ReadObjectFile obj = new ReadObjectFile();
	Properties allObjects;
	Row row;
	int testcaseNo=1;
	int totalRows=0;
	int totalColumn=0;
	
	@BeforeTest
	public void beforeLogin() throws IOException{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");

		allObjects = obj.getObjectRepository();
		
		ReadExcel file = new ReadExcel();
		Sheet sheet = file.readExcel("KeywordFramework");
		
		int rowCount = sheet.getLastRowNum();
		testSteps= new String[rowCount][5];
		
		for(int i=0;i<rowCount;i++){
			row = sheet.getRow(i+1); // To bypass header line
			totalRows=row.getRowNum();
			totalColumn=5;
			for(int j=0;j<row.getLastCellNum();j++){
				testSteps[i][j]=row.getCell(j).toString();
				System.out.println(testSteps[i][j]);
			}
		}
		
	}
	
	@BeforeMethod
	public void invokeBrowser(){
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test(invocationCount=2)
	public void testLogin() throws Exception{
		PerformUIOperations operation = new PerformUIOperations(driver);
		
		for(int i= testcaseNo;i<totalRows;i++){
			System.out.println("i ="+i);
			if(!(testSteps[i][0].isEmpty())){
				testcaseNo =i+1;
				break;
			}
			System.out.println("==========testcase[" + i + "][1]=" + testSteps[i][1]);
			operation.performUIActions(allObjects, testSteps[i][1], testSteps[i][2], testSteps[i][3], testSteps[i][4]);
		}
		Thread.sleep(3000);
		System.out.println("Title:"+driver.getTitle());
		
	}
	
	@AfterMethod	
	public void tearDown(){
		driver.close();
	}
	
	
	
}
