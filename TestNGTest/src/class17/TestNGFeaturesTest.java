package class17;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFeaturesTest {
	
	//Assigning Priority : @Test(priority=1)  - 0 = Highest priority , and bigger number lower priority
	//If no priority asssigned it follows Alphabetic order
	//Either priortize all test cases or none
	
	//Grouping Test cases: @Test(groups="Group 1") 

	//Adding Dependency @Test(dependsonMethods="Test method name") - It adds dependency of one test case as a prerequite to perform test
	
	//Invocation Count @Test(invocationCount=10 - test case can run n number of times in a loop.
	
	//Expected Exception @Test(exceptedExceptions=Exception name) - any exception that is expected as part of this test case, can be handled
	
	//Disable test case @Test(enabled=false) - test case will be ignored while execution
	
	@BeforeMethod // It runs before any test we run
	void beforeMethod() {
		System.out.println("beforemethod - called");
	}

	// IN Test annotations
	@Test(groups="Group 1",dependsOnMethods="test7")
	void test() {
		System.out.println("Test -1 called");
	}

	@Test(priority=1)
	void test3() {
		System.out.println("Test -3 called");
	}

	@Test(groups="Group 1")
	void test2() {
		System.out.println("Test -2 called");
	}
	
	@Test(groups="Group 2",enabled=false)
	void test4() {
		System.out.println("Test -4 called");
	}
	
	@Test(invocationCount=5)
	void test5() {
		System.out.println("Test -5 called");
	}
	
	@Test(groups="Group 2",dependsOnMethods="test2")
	void test6() {
		System.out.println("Test -6 called");
	}
	
	@Test(groups="Group 2")
	void test7() {
		System.out.println("Test -7 called");
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	//@Test()
	void test8() {
		String str = "10A";
		int i = Integer.parseInt(str);
		System.out.println("Test -8 called");
	}
	
	// After Annotation - post conditions
	@AfterMethod // Runs after any test case execution completes
	void aftermethod() {
		System.out.println("After method called");
	}

}
