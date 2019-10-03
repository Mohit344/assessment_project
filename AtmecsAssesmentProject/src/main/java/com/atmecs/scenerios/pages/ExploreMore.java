package com.atmecs.scenerios.pages;

import org.openqa.selenium.WebDriver;

import com.atmecs.constant.FileConstant;
import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.helper.CommonUtility;
import com.atmecs.validation.ValidationMethod;

public class ExploreMore {

	
public static void  clickOnExplore(FindLocator loc, WebDriver driver)
{
	
	CommonUtility.clickElement(driver,loc.getlocator("exploremore"));	
	
}
public static void validateExplorePageUrl(WebDriver driver, FindLocator loc) {
	String URL = driver.getCurrentUrl();
	//Assert.assertEquals(URL, FileConstant.urlexplore );
	//
	ValidationMethod.verify(URL, FileConstant.urlexplore, "not correct");
	System.out.println("enter into the explore ");
	
}
public static void validateExploreInside(WebDriver driver,FindLocator loc)
{
		String title = CommonUtility.getText(driver, loc.getlocator("servicetitle"));
    System.out.println(title);
		//Assert.assertEquals(title, (ValidatingData.getValidatingData("service")),"not presnt");
    ValidationMethod.verify(title, (ValidatingData.getValidatingData("service")), "not correct");
	}	
	
public static void validateExploreBreadcrumbHome(WebDriver driver,FindLocator loc)
{
		String homebread = CommonUtility.getText(driver, loc.getlocator("homebreadex"));
    System.out.println(homebread);
		//Assert.assertEquals(title, (ValidatingData.getValidatingData("home")),"not presnt");
	ValidationMethod.verify(homebread, (ValidatingData.getValidatingData("home")), "not correct");
}	


public static void validateExploreBreadcrumbServices(WebDriver driver,FindLocator loc)
{
		String servicesbread = CommonUtility.getText(driver, loc.getlocator("serviecsberadex"));
    System.out.println(servicesbread);
		//Assert.assertEquals(title, (ValidatingData.getValidatingData("service")),"not presnt");
    
   ValidationMethod.verify(servicesbread,(ValidatingData.getValidatingData("service")) , "not correct");    
   
	}	


	


}





