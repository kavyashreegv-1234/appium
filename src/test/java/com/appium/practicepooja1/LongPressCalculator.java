package com.appium.practicepooja1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class LongPressCalculator {
	DesiredCapabilities cap=new DesiredCapabilities();
	AndroidDriver driver;
	@Test
		public void longPress() throws MalformedURLException
		{
		cap.setCapability("devicename", "vivo 1819");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationVersion", "10");
		cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
	    cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", ".Calculator");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MobileElement btn7 = (MobileElement) driver.findElementById("com.android.bbkcalculator:id/digit7");
		MobileElement plus=(MobileElement) driver.findElementById("com.android.bbkcalculator:id/plus");
		MobileElement btn2=(MobileElement) driver.findElementByAccessibilityId("2");
		TouchAction ta=new TouchAction(driver);
		driver.findElementById("com.android.bbkcalculator:id/digit7").click();
		ta.longPress(plus).waitAction(1000).release().perform();
		driver.findElementByAccessibilityId("2").click();
		
		}
}
