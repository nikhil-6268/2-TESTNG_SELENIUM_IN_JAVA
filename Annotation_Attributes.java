package TESTNG.TESTNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Annotation_Attributes {
	//@Test(priority= 1)
	//@Test(description = "This is test case 1")
	@Test(dependsOnMethods= {"testcase2"})
	public void testcase1() {
		System.out.println("Mobile Login Test Case 1");
	}
	
	@Test(priority= 2)
	//@Test(description = "This is test case 2")
	//@Test(timeOut = 500)
	public void testcase2() {
//		try {
//			Thread.sleep(700);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	System.out.println("Web Login Test Case 2");	
	Assert.assertTrue(false);
	}
	
	@Test(priority= 3)
	//@Test(description = "This is test case 3")
	public void testcase3() {
		System.out.println("Api Login Test Case 3");
		
	}
}
