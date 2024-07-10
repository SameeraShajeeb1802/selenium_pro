package com.tricentis.genericutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtility extends BaseClass implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();
		TakesScreenshot ts = (TakesScreenshot) driver;
		 String photo = ts.getScreenshotAs(OutputType.BASE64);
		 screenTest.addScreenCaptureFromBase64String(photo);
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshots/"+methodName+".png");
		try {
			FileUtils.copyFile(temp, perm);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
