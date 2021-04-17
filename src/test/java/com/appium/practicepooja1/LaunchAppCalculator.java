package com.appium.practicepooja1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LaunchAppCalculator {

	@Test
	public void launchDemo() throws Throwable
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("devicename", "vivo 1819");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationVersion", "10");
		cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
		//cap.setCapability("app", "E:\\APK\\ApiDemos.apk");
	    cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", ".Calculator");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("com.android.bbkcalculator:id/digit7").click();
		driver.findElementById("com.android.bbkcalculator:id/plus").click();
		driver.findElementByAccessibilityId("2").click();
		
		
	}
	
	
}
