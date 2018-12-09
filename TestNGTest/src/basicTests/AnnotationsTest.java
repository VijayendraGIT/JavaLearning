package basicTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {
	
	// Annotations are some keywords that starts with @ 
	// It is mentioned before any method/ function
	
	// Before Annotations - preconditions
	@BeforeSuite // 1st time run before suite execution starts
	void beforeSuite(){
		System.out.println("beforeSuite - called");
	}
	@BeforeTest // It runs before any testset execution 
	void beforeTest(){
		System.out.println("beforeTest - called");
	}
	@BeforeClass // it runs before any test of a class , runs at class level
	void beforeClass(){
		System.out.println("beforeClass - called");
	}
	@BeforeMethod // It runs before any test we run
	void beforeMethod(){
		System.out.println("beforemethod - called");
	}
	
	// IN Test annotations
	@Test
	void test(){
		System.out.println("Test -1 called");
	}
	
	@Test
	void test2(){
		System.out.println("Test -2 called");
	}
	
	// After Annotation - post conditions
	@AfterMethod // Runs after any test case execution completes
	void aftermethod(){
		System.out.println("After method called");
	}
	
	@AfterClass // Run after execution of all the test cases in particular class
	void afterClass(){
		System.out.println("afterClass - called");
	}
	
	@AfterTest // Runs after all test methods of test set runs
	void afterTest(){
		System.out.println("afterTest - called");
	}
	
	@AfterSuite
	void afterSuite(){
		System.out.println("afterSuite - called");
	}
}
