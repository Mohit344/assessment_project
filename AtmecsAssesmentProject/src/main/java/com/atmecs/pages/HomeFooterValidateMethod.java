package com.atmecs.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecs.constant.FindLocator;
import com.atmecs.helper.CommonUtility;

public class HomeFooterValidateMethod {
	
	
	public  static  void isFooterPresent(String footer,FindLocator loc,WebDriver driver) {
		if (footer != null) {
			String text = CommonUtility.getText(driver,loc.getlocator("footer").replace("[xxxx]", footer));
			System.out.println(text);
			Assert.assertEquals(text, footer, "footer is not present");
		}
	
		
		
	}
	
		public static  void validatesubserviecs(String subserviecs,FindLocator loc,WebDriver driver)
		{
			if (subserviecs != null) {
				String text = CommonUtility.getText(driver,loc.getlocator("footer").replace("[xxxx]",subserviecs));
				System.out.println(text);
				Assert.assertEquals(text, subserviecs, "service is not present");
			}
		}
//
//		public static void validateInfraSubMenu(String subserviecs,FindLocator loc,WebDriver driver)
//		{
//			if (subserviecs != null) {
//				String text = CommonUtility.getText(driver,loc.getlocator("subserviecs").replace("[xxxx]", subserviecs));
//				System.out.println(text);
//				Assert.assertEquals(text, subserviecs, "service is not present");
//			
//		}
		
		
		
		}
