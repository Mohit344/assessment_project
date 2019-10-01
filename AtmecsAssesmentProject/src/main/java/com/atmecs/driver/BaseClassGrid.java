package com.atmecs.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClassGrid {
     /**
      * RemoteWebDriver getDriver function is use to upload the browser.
      * @param browser
      * @return
      * @throws MalformedURLException
      */
	public static RemoteWebDriver getDriver(String browser) throws MalformedURLException {
		return new RemoteWebDriver(new URL("http://55.55.52.215:2000/wd/hub"), getBrowserCapabilities(browser));
		}

		private static DesiredCapabilities getBrowserCapabilities(String browserType) {
		switch (browserType) {
		case "firefox":
		System.out.println(" Ready  in firefox driver");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		return cap;
		case "chrome":
		System.out.println("ready in chrome ");
		DesiredCapabilities capC= new DesiredCapabilities();
		capC.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		return capC;
		default:
		System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
		DesiredCapabilities capfirefox= new DesiredCapabilities();
		capfirefox.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		return capfirefox;

		}

		}

	
	
	
}
