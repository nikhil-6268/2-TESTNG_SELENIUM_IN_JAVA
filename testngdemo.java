/*What is TestNG
TestNG is an automation testing framework in which NG stands for "Next Generation". TestNG is inspired by JUnit which uses the annotations (@).
Features of TestNG we can use in selenium· WebDriver has no native mechanism for generating reports. TestNG can generate the report in a proper & readable format.
· Multiple test cases can be grouped more easily. · The same test case can be executed multiple times without loops
· Using testNG, you can execute multiple test cases on multiple browsers.
. The TestNG framework can be easily integrated with tools like TestNG Maven, Jenkins, etc.
· Annotations used in the testing are very easy to understand ex:@BeforeMethod, @AfterMethod, @BeforeTest, @AfterTest 

Points to remember for writing TestNG testcase.
1) TestNG does not require you to have a main() method.I
2) Methods need not be static.
3) We used the @Test annotation. @Test is used to tell that the method under it
is a test case.
4) we needed to import the package org. testng. annotations. *.
5) We used the Assert class.
The Assert class is used to conduct verification operations in TestNG.
Assertions in TestNG are a way to verify that the expected result matches
the actual result.
To use it, we need to import the org.testng. Assert package. */
package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations. *;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testngdemo {
	
	@Test
	
	public void VerifyPageTitle() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String  ActualTitle = driver.getTitle();
		String  ExpectedTitle = "Google";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}

}
