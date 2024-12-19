/* Types of Listeners in TestNG
1.IAnnotationTransformer
2.IAnnotationTransformer2
3.IConfigurable
4.IConfigurationListener
5.IExecutionListener
6.IHookable
7.IInvoked MethodListener
8.IInvoked MethodListener2
9.IMethodInterceptor
10.IReporter
11.|SuiteListener
12.ITestListener :- iTestListeners in TestNG onTestStart(): An onTestStart() is invoked only when any test method gets started.
onTestSuccess(): An onTestSuccess() method is executed on the success of a test method.
on TestFailure (): An on TestFailure() method is invoked when test method fails.
onTestSkipped(): An onTestSkipped() run only when any test method has been skipped.
onStart(): An onStart() method is executed on the start of any test method.
onFinish(): An onFinish() is invoked when any test case finishes its execution.
on TestFailedButWithin SuccessPercentage(): This method is invoked each time when the test method fails but within success percentage.  */

package TESTNG.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenersDemo {

    @Test
    public void login() {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the login page
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Add an implicit wait (optional)
            driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

            // Locate username field and enter value
            WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
            username.sendKeys("Admin");

            // Locate password field and enter value
            WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
            password.sendKeys("admin123");

            // Locate and click the login button
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();

            // Assert the page title to verify successful login
            Assert.assertEquals(driver.getTitle(), "OrangeHRM");

        } finally {
            // Close the browser
            //driver.quit();
        }
    }
}
