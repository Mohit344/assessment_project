package com.atmecs.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.atmecs.constant.FindLocator;
import com.atmecs.helper.CommonUtility;

public class HomePages {
	
	public static void home(WebDriver driver,FindLocator loc) {
		
	CommonUtility.clickElement(driver,loc.getlocator("home"));	
	((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
	
	

	
	
	
	
		
		
		
	}
	
	
	

}
