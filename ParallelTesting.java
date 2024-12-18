/* We can execute-
. All the methods with @Test annotation will execute parallel
• All the test cases inside a Java class will run parallel methods
• All the test cases inside <test> tag of Testing xml file will run parallel */

package TESTNG.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParallelTesting {
	
	WebDriver driver;
	
	@Test
	public void verifyTitle() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs"); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Test
	public void verifyLogo() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
	WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
	
	Assert.assertTrue(logo.isDisplayed());
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	}

}
