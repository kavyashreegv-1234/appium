package com.appium.practicepooja1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TapOnCalciByCordiantes {
	DesiredCapabilities cap=new DesiredCapabilities();
	AndroidDriver driver;
	@Test
	public void launchCalci() throws Throwable
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
		MobileElement btn2=(MobileElement) driver.findElementByAccessibilityId("3");
		driver.tap(1, 160, 1422, 1000);
		driver.tap(1,160,1422,1000);
		driver.tap(1,909,1871,1000);
		driver.tap(1,417,1871,1000);
		
	}
	
	
	public void tapMethodByCordinates(int x,int y)
	{
		driver.tap(1, x, y, 1000);
	}
}
