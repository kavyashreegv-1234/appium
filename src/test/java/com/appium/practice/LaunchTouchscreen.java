package com.appium.practice;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LaunchTouchscreen {
	@Test
	public void launch() throws Throwable {
		DesiredCapabilities cap1=new DesiredCapabilities();
		cap1.setCapability("deviceName","6g");
		cap1.setCapability("automationName","Appium");
		cap1.setCapability("platformName","Android");
		cap1.setCapability("platformVersion","9");
		cap1.setCapability("UDID", "61804041");
		cap1.setCapability("app", "E:\\APK\\Touchscreen.apk");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}


}
