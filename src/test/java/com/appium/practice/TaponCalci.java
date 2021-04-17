package com.appium.practice;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TaponCalci {
	@Test
	public void TaponCalci() throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
//		cap.setCapability("deviceName","vivo 1819");
//		cap.setCapability("automationName","Appium");
//		cap.setCapability("platformName","Android");
//		cap.setCapability("platformVersion","10");
//		cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
		cap.setCapability("deviceName","LgQ6");
		cap.setCapability("automationName","Appium");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","8.1.0");
		cap.setCapability("UDID", "LGM70035d589ef");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}}
