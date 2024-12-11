/* Enable / Disable test cases In TestNG, test cases can be enabled / disabled in two ways
1.You can disable the test case in a @Test annotation TestNG @Test enable parameter ·You can disable the test case in the XML file
(enables=True) // test case can be enabled (enables=False) // test case can be disabled
<methods>
<exclude name = "MethodName"/>
<include name = "MethodName"/>
</methods> 

 if we want to exclude some test cases of {for e.g.:- if we want to exclude Mobile Login Personal Loan so we'll take it in <methods> </methods> tag} */

/* <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="LoanDepartment">
  <test thread-count="5" name="Test">
    <classes>
      <class name="TESTNG.TESTNG.TestNG_Enable_Disable_Test_cases">
      <methods>
      <!--<exclude name ="MobileLoginPersonalLoan" ></exclude>-->
   <!--   <include name = "MobileLoginPersonalLoan"></include> -->
       <!-- adding all mobile variables -->
        <include name = "Mobile.*"></include>
        </methods>
      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- LoanDepartment -->
  */


package TESTNG.TESTNG;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNG_Enable_Disable_Test_cases {
	@Test
	public void MobileLoginPersonalLoan(){
		System.out.println("Mobile Login Personal Loan");
		
	}
	
	@Test
	public void WebLoginPersonalLoan(){
		System.out.println("Web Login Personal Loan");
		
	}

	@Test
	public void ApiLoginPersonalLoan(){
		System.out.println("Api Login Personal Loan");
		
	}
	
	@Test
	public void MobileLoginAutoMobileLoan(){
		System.out.println("Mobile Login AutoMobile Loan");
		
	}
	
	@Test
	public void WebLoginAutoMobileLoan(){
		System.out.println("Web Login AutoMobile Loan");
		
	}
	@Test
	public void ApiLoginAutoMobileLoan(){
		System.out.println("Api Login AutoMobile Loan");
		
	}
}
