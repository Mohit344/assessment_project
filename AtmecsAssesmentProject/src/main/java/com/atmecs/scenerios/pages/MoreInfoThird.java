package com.atmecs.scenerios.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecs.constant.FileConstant;
import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.helper.CommonUtility;
import com.atmecs.validation.ValidationMethod;

public class MoreInfoThird {
	
	
	public static void clickOninfo3(WebDriver driver, FindLocator loc)
	{
		

		CommonUtility.scrollToElement(driver, loc.getlocator("informore3"));
		CommonUtility.clickElement(driver, loc.getlocator("informore3"));	
	}

	
	public static void validateTitle(WebDriver driver, FindLocator loc)
	{

		String title = CommonUtility.getText(driver, loc.getlocator("iottitle"));
    System.out.println(title);
	//	Assert.assertEquals(title, (ValidatingData.getValidatingData("iot")),"not presnt");
    ValidationMethod.verify(title, (ValidatingData.getValidatingData("iot")), "not correct");
		
	}
	

    public static void validateIotBrud(WebDriver driver, FindLocator loc)
    {
    	String iotbread = CommonUtility.getText(driver, loc.getlocator("iotbread"));
        System.out.println(iotbread);
    		//Assert.assertEquals(iotbread, (ValidatingData.getValidatingData("iot")),"not presnt");
        ValidationMethod.verify(iotbread, (ValidatingData.getValidatingData("iot")), "not correct");
    			
    	
    }
    
    public static void validatePageUrl(WebDriver driver, FindLocator loc) {
    	String homeurl = driver.getCurrentUrl();
    	Assert.assertEquals(homeurl, FileConstant.ioturl );
    	
    ValidationMethod.verify(homeurl, FileConstant.ioturl, "not correct");	
    	
    	System.out.println("entered successfully ");

    	
    	
    


}


}
