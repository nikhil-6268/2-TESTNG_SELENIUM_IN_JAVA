/* In TestNG, InvocationCount Attribute is used to run single test case multiple time.
Syntax 
@Test(invocationCount=num)
Where num = number of times you want to run this test method  */

package TESTNG.TESTNG;
import org.testng.ITestContext;
import org.testng.annotations.*;

public class InvocationCountDemo {

	@Test(invocationCount = 5)
	public void TestMethod1(ITestContext context) {
	
		 int CurrentInnvocation = context.getAllTestMethods()[0].getCurrentInvocationCount();
		 System.out.println("Executing : "+CurrentInnvocation);
		 System.out.println("Test Method1...");
	}
	
	@Test(invocationCount = 3)
	public void TestMethod2(ITestContext context) {
		 int CurrentInnvocation = context.getAllTestMethods()[1].getCurrentInvocationCount();
		 System.out.println("Executing : "+CurrentInnvocation);
	
		System.out.println("Test Method2...");
	}
}
