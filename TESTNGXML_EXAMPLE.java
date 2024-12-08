/*  What is TestNG XML File
 In TestNG framework, we need to create Testng xml file to run and handle multiple test classes. TestNG.xml file is an XML file which contains all the
test configuration and this XML file can be used to run and organize our test.
In testng.xml file, we configure our test run, set test dependency, include or exclude any test, method, class or package and set priority etc
Testng.xml file is also is used for TestNG Parameters. TestNG Parameters are the arguments that we pass to the test methods 
after creating a maven project click on  testng>> after that right click on testng >> convert to testng */

package TESTNG.TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations. *;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTNGXML_EXAMPLE {
	@Test
	public void test1() {
		System.out.println("test case 1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("test case 2");
	}

}
