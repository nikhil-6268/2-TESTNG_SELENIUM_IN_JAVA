package TESTNG.TESTNG;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class ListenersClass implements ITestListener {
	public void onStart(ITestContext Result) {
		System.out.println("On Start Method Invoked..."+Result);
	}

public void onFinish(ITestContext Result) {
	
	System.out.println("On Finish Method Invoked..."+Result);
	}

public void onTestFailure(ITestContext Result) {
	
	System.out.println("On Failure Method Invoked..." + Result.getName());
	}

public void onTestSkipped(ITestContext Result) {
	
	System.out.println("On Skipped Method Invoked..."+ Result.getName());
	}

public void onTestStart(ITestContext Result) {
	
	System.out.println("On TestStart Method Invoked..."+Result.getName());
	}

public void onTestSuccess(ITestContext Result) {
	
	System.out.println("On TestSuccess Method Invoked..."+Result);
	}

public void onTestFailedButWithinSuccessPercentage(ITestContext Result) {
	
	//System.out.println("On onTestFailedButWithinSuccessPercentage Method Invoked..."+Result);
	}



}
