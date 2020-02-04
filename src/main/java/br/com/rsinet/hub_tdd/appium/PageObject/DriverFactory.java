package br.com.rsinet.hub_tdd.appium.PageObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {
	
	
	public static AndroidDriver<MobileElement> CreateDriver() throws MalformedURLException {
		
	     AndroidDriver<MobileElement> driver;
		 
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	
		 capabilities.setCapability("deviceName", "Androidsdk");
		 //capabilities.setCapability("platformVersion", "9.0");
		 capabilities.setCapability("platformName", "Android");

		 capabilities.setCapability("appPackage", "com.Advantage.aShopping");
		 capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		 
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 return driver;
		 
}

	
}