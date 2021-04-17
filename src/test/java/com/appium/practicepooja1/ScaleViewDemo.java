package com.appium.practicepooja1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ScaleViewDemo {
@Test
public void scaleViewMethod() throws Throwable
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
	WebElement img = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
//	driver.zoom(img);
//	Thread.sleep(3000);
//	driver.pinch(img);
//	Thread.sleep(2000);
	
	int x=driver.manage().window().getSize().getHeight()/2;
	int y=driver.manage().window().getSize().getWidth()/2;
	
	TouchAction finger1=new TouchAction(driver);
	finger1.press(x,y-100).moveTo(x,y-800);
	
	TouchAction finger2=new TouchAction(driver);
	finger2.press(x,y+100).moveTo(x,y+800);
	
	MultiTouchAction mta=new MultiTouchAction(driver);
	mta.add(finger1).add(finger2).perform();
	

	
}
}
