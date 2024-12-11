/*  What Are TestNG Annotation:-  An annotation is a tag/piece of code that provides additional information about the method. It is represented by '@' prefix. 
    It is used to control the execution of test cases Following are some of the benefits of using annotations
1.  TestNG identifies the methods it is interested in, by looking up annotations. Hence, method names are not restricted to any pattern or format.
2.  We can pass additional parameters to annotations.
3.  Annotations are strongly typed, so the compiler will flag any mistakes right away.

    In Testng test methods are non-static
TestNG Annotations
 @Before Suite  -->@Before Test--> @Before Class --> @Before Method--> @Test-->  @After Method-->@After Class --> @After Test--> @After Suite   */


package TESTNG.TESTNG;
import org.testng.annotations.*;
public class Annotations_TestCase1 {
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class ");
		
	}
	@AfterClass
		public void AfterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod // in @beforemethod annotation it will execute before every @test methods
	public void BeforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod // in @aftermethod annotation it will execute after every @test methods
	public void AfterMethod() {
		System.out.println("After Method");
	}
	@Test
	public void test1() {
		System.out.println("This is Test 1");
		
	}
	@Test
	public void test2() {
		System.out.println("This is test 2......");
	}

	
}
