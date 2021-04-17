package com.appium.practicepooja1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

//import com.andriod.appium.genericUtility.FileUtility;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author kavyashree
 *
 */

public class ApiDemosDragAndDrop {
	
@Test
	
	public void apidemoDragDrop() throws Throwable
	{
		
//	DesiredCapabilities cap=new DesiredCapabilities();
//	cap.setCapability("devicename", "vivo 1819");
//	cap.setCapability("automationName", "Appium");
//	cap.setCapability("platformName", "Android");
//	cap.setCapability("automationVersion", "10");
//	cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
//    cap.setCapability("appPackage", "io.appium.android.apis");
//	cap.setCapability("appActivity", ".ApiDemos");
//	
    
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("devicename", "vivo 1819");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("automationVersion", "10");
	cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
    cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", ".ApiDemmos");
	cap.setCapability("noReset", true); 
	
	URL url=new URL("http://localhost:4723/wd/hub");
	
	 AndroidDriver driver=new AndroidDriver(url,cap);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementByAccessibilityId("Views").click();
	driver.findElementByAccessibilityId("Drag and Drop").click();
	WebElement src = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
	WebElement dest = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
	
	TouchAction ta=new TouchAction(driver);
	ta.longPress(src).waitAction(2000).moveTo(dest).release().perform();
	ta.longPress(dest).waitAction(3000).moveTo(dest).release().perform();
		
	}
}
