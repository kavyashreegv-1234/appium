package com.appium.practicepooja1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ExecutionThroughCommandPromptCali {

	AndroidDriver driver;
	@Test
	public void launchCalci() throws Throwable
	{ 
		
		AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
		
		service.start();
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("devicename", "vivo 1819");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationVersion", "10");
		cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
	    cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", ".Calculator");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		service.stop();
	}
}
