package com.appium.practicepooja1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MultiTouchScaleView {

	@Test
	public void scaleViewMultiTouch() throws Throwable
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("devicename", "vivo 1819");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationVersion", "10");
		cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
		cap.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		cap.setCapability("appActivity", ".MainActivity");
		
		cap.setCapability("noReset", true);
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		 AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();
	//	WebElement img = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
		
		int x=driver.manage().window().getSize().getWidth()/2;
		int y=driver.manage().window().getSize().getHeight()/2;
		//ZoomIn
		TouchAction finger1=new TouchAction(driver);
		finger1.press(x,y-100).moveTo(x,y-800);
		
		
		TouchAction finger2=new TouchAction(driver);
		finger2.press(x,y+100).moveTo(x,y+800);
		
		Thread.sleep(2000);
		
		MultiTouchAction mta=new MultiTouchAction(driver);
		mta.add(finger1).add(finger2).perform();
		
		Thread.sleep(2000);
		
		//ZoomOut
		TouchAction finger3=new TouchAction(driver);
		finger3.press(x,y-800).moveTo(x,y-100);
		
		Thread.sleep(3000);
		
		TouchAction finger4=new TouchAction(driver);
		finger4.press(x,y+800).moveTo(x,y+100);
		
		MultiTouchAction mta1=new MultiTouchAction(driver);
		mta1.add(finger3).add(finger4).perform();
		
	}
}
