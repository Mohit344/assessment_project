package com.atmecs.script;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.driver.Driver_Class;
import com.atmecs.pages.BlogPages;
import com.atmecs.pages.ValidateBlog;

public class FinalBlogScript extends Driver_Class{

	
	
	FindLocator loc = new  FindLocator();
ValidatingData data = new ValidatingData();
	@Test(priority=21)
	public void  hoverOnSight()
	{
		Logger log = Logger.getLogger(FinalBlogScript.class);
		
		BlogPages.blog(driver, loc);
		log.info("hoverOnInsight and click on blog ");

	}
	@Test(priority = 22)
	public void validateBlog()
	{		Logger log = Logger.getLogger(FinalBlogScript.class);
             log.info("blog open ");
		
		ValidateBlog.validateBlogTitle(loc, driver);
		 log.info("validate the blogtitle ,");
		ValidateBlog.validateBreadcrumb(loc, driver);
		 log.info("validate the breadcrumb");
		ValidateBlog.validateDateDifference(loc, driver);
		 log.info("validate the datedifference");
		ValidateBlog.validateContent(driver, loc);
	log.info("validate the content the contentpresent");
	}
	@Test(priority = 23)
	public void  clickSumit()
	{
		Logger log = Logger.getLogger(FinalBlogScript.class);
		BlogPages.clickSubmit(loc, driver);
		log.info("click on submitbtn and show the alert message");
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
