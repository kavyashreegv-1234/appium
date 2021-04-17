//package com.andriod.appium.practice;


package com.appium.practicepooja;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemoControls {

	@Test
	public void apidemoElements() throws Throwable
	{
		
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("devicename", "vivo 1819");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("automationVersion", "10");
	cap.setCapability("UDID", "NBDIVWSW5PCEKV4D");
//	cap.setCapability("app", "E:\\APK\\ApiDemos.apk");
    cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", ".ApiDemos");
	
	cap.setCapability("noReset", true);
	
	URL url=new URL("http://localhost:4723/wd/hub");
	
	 AndroidDriver driver=new AndroidDriver(url,cap);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementByAccessibilityId("Views").click();
	
	driver.findElementByAccessibilityId("Controls").click();
	driver.findElementByAccessibilityId("2. Dark Theme").click();
	driver.hideKeyboard();
	driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Padmashree");
	driver.findElementById("io.appium.android.apis:id/check1").click();
	driver.findElementById("io.appium.android.apis:id/radio1").click();
	driver.findElementById("android:id/text1").click();
	
	       List<MobileElement> options = driver.findElementsByClassName("android.widget.CheckedTextView");
	    System.out.println("Number of options present " +options.size());
	    
	    String expected="Jupiter";
	    for (MobileElement me : options) {
			String actual = me.getText();
			if(actual.equals(expected))
			{
				me.click();
			}
		} 
	}
	

}
