/* <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="keyword1">
   <classes>
   <class name="TESTNG.TESTNG.DataProvidersDemo"></class>
  </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

 Data Providers:Similar to TestNG Parameters, Data Providers are a means to pass data to test methods in TestNG. Using Data Provider in TestNG, we can easily 
 inject multiple values into the same test case. It comes inbuilt in TestNG and is popularly used in data-driven frameworks.

Syntax
@DataProvider(name = "name of the data provider")
public Object[][] dataProviderfunc()
{
return new Object[][] { values }
}
•The DataProvider annotation has a single attribute called name, which you can select as per your convenience.
•DataProviders are separate methods used in test functions, which means that this annotation is not used on test functions like the testNG parameters.
•The DataProvider method returns a 2D list of objects.
•In case you do not define a name for the DataProvider, the DataProvider method name is considered its default name. So, the name of the DataProvider calls the Data Provider method.


Test Scenario
1) Launch the browser to open www.google.com
2) Search the first keyword combination.
3) Repeat the steps 2 for the other 2 keywords combination.      */


package TESTNG.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidersDemo {
	/* Data Sets
	 1. India Qutub Minar
	 2. Agra Taj Mahal
	 3. Hyderabad Charminar */
	
	@DataProvider(name = "SearchDataSet")
	public Object[][] SearchData(){
		
		Object[][] SearchKeyword = new Object[3][2];
		SearchKeyword[0][0] = "India";
		SearchKeyword[0][1] = "Qutub Minar";
		
		SearchKeyword[1][0] = "Agra";
		SearchKeyword[1][1] = "Taj Mahal";
		
		SearchKeyword[2][0] = "Hyderabad";
		SearchKeyword[2][1] = "Charminar";
		
		return SearchKeyword;
	}
	
	@Test(dataProvider = "SearchDataSet")
	public void TestCaseGoogleSearch(String Country, String Monument) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		
		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.sendKeys(Country + " " + Monument);
		driver.findElement(By.name("btnK")).submit();
		
	}
	
}
