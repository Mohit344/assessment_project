package com.atmecs.scenerios.pages;

import org.openqa.selenium.WebDriver;


import com.atmecs.constant.FileConstant;
import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.helper.CommonUtility;
import com.atmecs.validation.ValidationMethod;

public class MorreInfoForth {

	public static void clickOninfo4(WebDriver driver, FindLocator loc)
	{
		

		CommonUtility.scrollToElement(driver, loc.getlocator("moreinfo4"));
		CommonUtility.clickElement(driver, loc.getlocator("moreinfo4"));	
	}

	
	public static void validateTitle(WebDriver driver, FindLocator loc)
	{
	String title = CommonUtility.getText(driver, loc.getlocator("rpatitlevalid"));
    System.out.println(title);
	
		ValidationMethod.verify(title, (ValidatingData.getValidatingData("rpa")), "not correct");
	}
  public static void validateBreadRpa(WebDriver driver, FindLocator loc)
  {
		String title = CommonUtility.getText(driver, loc.getlocator("Automatebread"));
	    System.out.println(title);
		
			ValidationMethod.verify(title, (ValidatingData.getValidatingData("rpa")), "not correct");
	  
  }
  
  public static void validatePageUrl(WebDriver driver, FindLocator loc) {
		String homeurl = driver.getCurrentUrl();
		ValidationMethod.verify(homeurl,FileConstant.chatbot , "not correct");
		System.out.println("entered successfully ");

  }
		

}
