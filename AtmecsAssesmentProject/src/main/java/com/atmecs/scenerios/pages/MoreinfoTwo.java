package com.atmecs.scenerios.pages;

import org.openqa.selenium.WebDriver;


import com.atmecs.constant.FileConstant;
import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.helper.CommonUtility;
import com.atmecs.validation.ValidationMethod;

public class MoreinfoTwo {
	
	public static void clickOninfo2(FindLocator loc,WebDriver driver)
	{
		CommonUtility.scrollToElement(driver, loc.getlocator("informore2"));
		CommonUtility.clickElement(driver, loc.getlocator("informore2"));	
		
		
	}
public static void validateTitle(FindLocator loc,WebDriver driver)
{

	String title = CommonUtility.getText(driver, loc.getlocator("virtualreality"));
System.out.println(title);

	ValidationMethod.verify(title, (ValidatingData.getValidatingData("Arvreality")), "not present");
}
	



public static void validateVirtual(FindLocator loc,WebDriver driver)
{

	String virtual = CommonUtility.getText(driver, loc.getlocator("virtualbread"));
	System.out.println(virtual);
	ValidationMethod.verify(virtual, (ValidatingData.getValidatingData("Arvreality")), "not present");
		
}
	

public static void validatePageUrl(WebDriver driver, FindLocator loc) {
	String homeurl = driver.getCurrentUrl();
	
	ValidationMethod.verify(homeurl,FileConstant.virtualreality , "not correct");
	
	
	System.out.println("entered successfully ");

	
}
}
