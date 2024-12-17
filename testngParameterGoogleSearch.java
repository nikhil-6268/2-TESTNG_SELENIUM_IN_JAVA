/* <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="keyword1">
  <parameter name="keyword" value="selenium"></parameter>
   <classes>
   <class name="TESTNG.TESTNG.testngParameterGoogleSearch"></class>
  </classes>
  </test> <!-- Test -->
  
  <test thread-count="5" name="keyword2">
  <parameter name="keyword" value="Java"></parameter>
  <classes>
  <class name="TESTNG.TESTNG.testngParameterGoogleSearch"></class>
  </classes>
  </test>
</suite> <!-- Suite -->   

---Test steps-
Launch the browser and open www.google.com Add the first keyword as input in the search box
Verify the input value on UI to be same as from test data Repeat the above two steps for the other 2 keywords
TestNG will automatically try to convert the value specified in testng.xml to the type of your parameter
Here are the types supported
String, int/Integer, boolean/Boolean, byte/Byte, char/Character, double/Double, float/Float, long/Long, short/Short   */



package TESTNG.TESTNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngParameterGoogleSearch {
	
	@SuppressWarnings("deprecation")
	@Parameters({"keyword"})
	@Test
	public void GoogleSearch(String Searchdata) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement SearchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		SearchBox.sendKeys(Searchdata);
		 
		Assert.assertEquals(Searchdata, SearchBox.getAttribute("value"));
		
	}
}
