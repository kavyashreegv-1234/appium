package com.appium.practice;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class InspectElementsandlaunchCalci {
	@Test
	public void launch() throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName","6g");
		cap.setCapability("automationName","Appium");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");
		cap.setCapability("UDID", "61804041");
		cap.setCapability("appPackage","com.google.android.calculator");
		cap.setCapability("appActivity",".com.android.calculator2.Calculator");
		cap.setCapability("noReset", true);
		System.out.println("hg");
		
		//cap.setCapability("appPackage", "com.android.bbkcalculator");
		//cap.setCapability("appActivity","Calculator");
		
		
		URL url=new URL("http://localhost:4723/wd/hub");
        AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}

}
