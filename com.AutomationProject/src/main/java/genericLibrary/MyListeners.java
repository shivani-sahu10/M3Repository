package genericLibrary;

import java.time.LocalDateTime;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners  extends BaseTest implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
	
		Reporter.log("--test--"+result.getName()+"succeeded",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
  Reporter.log("--test--"+result.getName()+"succeeded",true);

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
	}
		String failedMethod = result.getName();
		String ldt = LocalDateTime.now().toString();
		String timeStamp = ldt.replaceAll(":", "-");
		
		TakeScreenshot ts = (TakeScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshots/"+failedMethod+timeStamp+".png");
		try {
			Fi;es.coppy(src,dest);
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		
				
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	
	

}


}
