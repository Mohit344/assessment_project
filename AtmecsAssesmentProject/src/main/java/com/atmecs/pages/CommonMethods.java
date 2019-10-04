package com.atmecs.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecs.constant.FindLocator;
import com.atmecs.helper.CommonUtility;
import com.atmecs.validation.ValidationMethod;

public class CommonMethods {
	/**
	 * 
	 * @param expectedtitle
	 * @param driver
	 */
		 public static void pageTitleValidation(String expectedtitle,WebDriver driver) {
			 String actualtitle=driver.getTitle();// get title of page.
			 System.out.println(actualtitle);
			
		ValidationMethod.verify(actualtitle, expectedtitle, "Redirection of page is not landed successfully");// validate the title of each pages
			 }

			 public static void validateBreadCrumb(String expectedbreadcrumb, FindLocator loc,WebDriver driver) {
			 String actualbreadcrumb=CommonUtility.getText(driver, loc.getlocator("breadcrumb"));
			 System.out.println(actualbreadcrumb);
			 ValidationMethod.verify(actualbreadcrumb, expectedbreadcrumb, "Breadcrumb is not matched successfully");// validate the breadcrumb of each pages
			 
			 //log.info("Breadcrumb validate properly");
			 }
			 
		
			 
			 
			 
		
		
		
}
