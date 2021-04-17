package com.appium.practicepooja1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CameraDemo {

	@Test
	public void cameraLaunch() throws Throwable
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("devicename", "vivo 1819");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationVersion", "10");
		cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
		cap.setCapability("appPackage", "com.android.camera");
		cap.setCapability("appActivity", ".VideoCamera");
		
		cap.setCapability("noReset", true);
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		 AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		//driver.findElementByAccessibilityId("Shutter").click();
		//Thread.sleep(2000);
		//driver.findElementByAccessibilityId("Back camera").click();
		//Thread.sleep(2000);
		
	}
}
