package com.appium.practicepooja1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwipeUsingGetheightmethod {
	@Test
	public void Touchswipe() throws Throwable
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("devicename", "vivo 1819");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationVersion", "10");
		cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
	    cap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability("appActivity", ".TouchScreenTestActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Dimension d=driver.manage().window().getSize();
		int ht=d.getHeight();
		System.out.println("height :"+ht);
		int wd=d.getWidth();
		System.out.println("width"+wd);
		
		//swipe Horizontal
//		int startx=(int)(wd*.20);
//		int starty=(int)(ht*.50);
//		int endx=(int)(wd*.80);
//		int endy=(int)(ht*.50);
//		driver.swipe(startx, starty, endx, endy, 1000);
		
		//swipe Vertical
//		int startx=(int)(wd*.30);
//		int starty=(int)(ht*.20);
//		int endx=(int)(wd*.30);
//		int endy=(int)(ht*.80);
//		driver.swipe(startx, starty, endx, endy, 1000);
		
		//swipe L shape
		int startx=(int)(wd*.30);
		int starty=(int)(ht*.20);
		int endx=(int)(wd*.30);
		int endy=(int)(ht*.80);
		int startx1=(int)(wd*.30);
		int starty1=(int)(ht*.80);
		int endx1=(int)(wd*.80);
		int endy1=(int)(ht*.80);
		driver.swipe(startx, starty, endx, endy, 1000);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);	
		
		
     }
}
