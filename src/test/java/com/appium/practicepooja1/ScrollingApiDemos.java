package com.appium.practicepooja1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ScrollingApiDemos {
	AndroidDriver driver;

	@Test
	public void launchTouchScreen() throws Throwable
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("devicename", "vivo 1819");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationVersion", "10");
		cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
//		cap.setCapability("app", "E:\\APK\\ApiDemos.apk");
	    cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		cap.setCapability("noReset", true);
		URL url=new URL("http://localhost:4723/wd/hub");
		
		 driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement element = driver.findElementByAccessibilityId("Views");
		driver.tap(1, element,1000);
		
		Thread.sleep(2000);
		
		scrolling("text","Layouts");
		WebElement element1=driver.findElementByXPath("//android.widget.TextView[@content-desc='Layouts']");
		driver.tap(1, element1, 1000);
		
	}
		public void scrolling(String an , String av)
		{
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
		}
		
	}
	
		
		 


