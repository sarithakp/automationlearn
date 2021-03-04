package testNGListenerpck;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The test Started Successfully---"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The test executed Successfully---"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The test Failed ---"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test Skipped execution ---"+result.getName());
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The test TestFailedButWithinSuccessPercentage ---"+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("The test is on Start---"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
