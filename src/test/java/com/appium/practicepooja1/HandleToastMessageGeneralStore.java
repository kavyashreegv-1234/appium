package com.appium.practicepooja1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class HandleToastMessageGeneralStore {
	AndroidDriver driver;
	@Test
	public void generalStoreToastMessage() throws Throwable
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
//		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("pk");
//		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		//driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
//		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		WebElement ele = driver.findElementByXPath("//android.widget.Toast[1]");
		System.out.println(ele.getText());
		
		
	}


}
