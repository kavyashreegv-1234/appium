package com.appium.practicepooja1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStroreScrollByIndia {
	AndroidDriver driver;
	@Test
	public void generalStoreAppScroll() throws Throwable
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("devicename", "vivo 1819");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationVersion", "10");
		cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
	    cap.setCapability("appPackage", "com.androidsample.generalstore");
		cap.setCapability("appActivity", ".SplashActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		 driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		Thread.sleep(5000);
		
		scrolling("text","India");
		
		driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
		
	}
	public void scrolling(String an , String av)
	{
	driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
	}

}
