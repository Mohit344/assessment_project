package com.atmecs.script;

import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.driver.Driver_Class;
import com.atmecs.pages.BlogPages;
import com.atmecs.pages.ValidateBlog;

public class FinalBlogScript  extends Driver_Class{
FindLocator loc = new  FindLocator();
ValidatingData data = new ValidatingData();
	@Test(priority=21)
	public void  hoverOnSight()
	{
		BlogPages.blog(driver, loc);
		
	}
	@Test(priority = 22)
	public void validateBlog()
	{
		ValidateBlog.validateBlogTitle(loc, driver);
		ValidateBlog.validateBreadcrumb(loc, driver);
		ValidateBlog.validateDateDifference(loc, driver);
		ValidateBlog.validateContent(driver, loc);
	}
	
	@Test(priority = 23)
	public void  clickSumit()
	
	
	{
	
		BlogPages.clickSubmit(loc, driver);
		
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
