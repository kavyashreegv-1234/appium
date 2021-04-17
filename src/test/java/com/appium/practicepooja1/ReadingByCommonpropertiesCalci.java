package com.appium.practicepooja1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.appium.genericutility.FileUtility;

import io.appium.java_client.android.AndroidDriver;

public class ReadingByCommonpropertiesCalci {
	DesiredCapabilities cap=new DesiredCapabilities();
	AndroidDriver driver;
	FileUtility p=new FileUtility();
	@Test
	public void readData() throws Throwable
	{	
		cap.setCapability("devicename",p.readdatafrompropfile("devicename"));
		cap.setCapability("automationName",p.readdatafrompropfile("automationName"));
		cap.setCapability("platformName",p.readdatafrompropfile("platformName"));
		cap.setCapability("automationVersion",p.readdatafrompropfile("automationVersion"));
		cap.setCapability("UDID",p.readdatafrompropfile("UDID"));
		cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", ".Calculator");
		
		URL url=new URL(p.readdatafrompropfile("url"));
		driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.android.bbkcalculator:id/digit7").click();
		driver.findElementById("com.android.bbkcalculator:id/plus").click();
		driver.findElementByAccessibilityId("2").click();
		
		
		}
	
	
}
