package com.atmecs.scenerios.pages;

import org.openqa.selenium.WebDriver;


import com.atmecs.constant.FileConstant;
import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.helper.CommonUtility;
import com.atmecs.validation.ValidationMethod;

public class MoreInfoFifth {
	
	public static void clickOninfo5(WebDriver driver, FindLocator loc)
	{
		

		CommonUtility.scrollToElement(driver, loc.getlocator("moreinfo5"));
		CommonUtility.clickElement(driver, loc.getlocator("moreinfo5"));	
	}
	
	
	public static void valitateTitleFive(WebDriver driver, FindLocator loc)
	{

		String title = CommonUtility.getText(driver, loc.getlocator("blockchntitle"));
    System.out.println(title);
	
		ValidationMethod.verify(title, (ValidatingData.getValidatingData("blockchn")), "not correct");
	}
	
	public static void validatebreadblock(WebDriver driver, FindLocator loc)
	{
		String title = CommonUtility.getText(driver, loc.getlocator("blockchainbread"));
    System.out.println(title);
	
		ValidationMethod.verify(title, (ValidatingData.getValidatingData("blockchn")), "not correcct");
		
	}

	public static void validatePageUrl(WebDriver driver, FindLocator loc) {
		String homeurl = driver.getCurrentUrl();
	
		ValidationMethod.verify(homeurl, FileConstant.bloxkchain, "not correct");
		System.out.println("entered successfully ");

	}
		
	
	
		  
	
	
}
