package com.atmecs.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.helper.CommonUtility;



public class ValidateBlog 
{
	
	
	ValidatingData data = new ValidatingData();
	public static  void validateContent(WebDriver driver,FindLocator loc) {
	String text = CommonUtility.getText(driver,loc.getlocator("content"));
	Assert.assertEquals(text, (ValidatingData.getValidatingData("content")), "Content is not present");
	}
	
	

public static void validateDateDifference(FindLocator loc , WebDriver  driver) {
	int dateDifference = BlogPages.getDate(driver, loc);
	Assert.assertFalse(dateDifference < 3);

}





public static void validateBlogTitle(FindLocator loc,WebDriver driver) {

	String title = CommonUtility.getText(driver, loc.getlocator("blogtitle"));

	Assert.assertEquals(title, ValidatingData.getValidatingData("Blog_Title"), "Not landed on a right page");
}

public static void validateBreadcrumb(FindLocator loc,WebDriver driver) {
	String breadCrumb1 = CommonUtility.getText(driver,loc.getlocator("breadcumb1"));
	Assert.assertEquals(breadCrumb1, ValidatingData.getValidatingData("breadcrumb1"),
			"Incorrect order of the breadcrumb");
	String breadCrumb2 = CommonUtility.getText(driver, loc.getlocator("breadcumb2"));
	Assert.assertEquals(breadCrumb2, ValidatingData.getValidatingData("breadcrumb2"),
			"Incorrect order of the breadcrumb");
	String breadCrumb3 = CommonUtility.getText(driver, loc.getlocator("breadcumb3"));
	Assert.assertEquals(breadCrumb3, ValidatingData.getValidatingData("breadcrumb3"),
			"Incorrect order of the breadcrumb");
}


}
