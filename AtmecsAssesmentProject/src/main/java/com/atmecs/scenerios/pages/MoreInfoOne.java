package com.atmecs.scenerios.pages;

import org.openqa.selenium.WebDriver;

import com.atmecs.constant.FileConstant;
import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.helper.CommonUtility;
import com.atmecs.validation.ValidationMethod;

public class MoreInfoOne {
	

	public static void clickOnInfoMore1(FindLocator loc,WebDriver driver) 
	{
		
		CommonUtility.scrollToElement(driver, loc.getlocator("infomore1"));
	CommonUtility.clickElement(driver, loc.getlocator("infomore1"));	
	}

	
	
	
public static  void validateBreadCrumbTitle(WebDriver driver, FindLocator loc)
{	
	
			String title = CommonUtility.getText(driver, loc.getlocator("Atrifi"));
	    System.out.println(title);
	    ValidationMethod.verify(title, (ValidatingData.getValidatingData("AI")), "not correct");
	    
		}	
public static void 	validateBrund1(WebDriver driver,FindLocator loc)
{
	String homebred = CommonUtility.getText(driver, loc.getlocator("homeinfo1"));
System.out.println(homebred);
	
ValidationMethod.verify(homebred, (ValidatingData.getValidatingData("home")), "not correct");
	
}
public static void validatebrud2(WebDriver driver,FindLocator loc)
{
	String servicesbred = CommonUtility.getText(driver, loc.getlocator("servicebrud"));
	System.out.println(servicesbred);
	
	ValidationMethod.verify(servicesbred,  (ValidatingData.getValidatingData("service")), "not correct");
	
}

public static void validbrud3(WebDriver driver,FindLocator loc)
{
	String digitalbread = CommonUtility.getText(driver, loc.getlocator("digital"));
	System.out.println(digitalbread);
		
		ValidationMethod.verify(digitalbread, (ValidatingData.getValidatingData("Digitallyf")), "not present");
}

public static void validbrud4(WebDriver driver, FindLocator loc)
{

	String aibred = CommonUtility.getText(driver, loc.getlocator("AIbrud"));
	System.out.println(aibred);
	ValidationMethod.verify(aibred, (ValidatingData.getValidatingData("AI")), "not correct");
		
	
}

	
public static void clickAgainHome( FindLocator loc,WebDriver driver)
{
	CommonUtility.clickElement(driver,loc.getlocator("againClickinfo") );
	
	
}

public static void validatePageUrl(WebDriver driver, FindLocator loc) {
	String homeurl = driver.getCurrentUrl();

	ValidationMethod.verify(homeurl, FileConstant.aiurl, "not correct");
	System.out.println("entered successfully ");

	
	
	
	
	
	
	
	
}
	
}
	
	
	


