package com.appium.practice;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Kavithamobile {
	@Test
	public void launch() throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName","LgQ6");
		cap.setCapability("automationName","Appium");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","8.1.0");
		cap.setCapability("UDID", "LGM70035d589ef");
		cap.setCapability("appPackage","com.miui.calculator");
		cap.setCapability("appActivity",".cal.AllInOneCalculatorActivity");
		System.out.println("Lg");
		
		
		URL url=new URL("http://localhost:4723/wd/hub");
		//Thread.sleep(2000);
        AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

}
