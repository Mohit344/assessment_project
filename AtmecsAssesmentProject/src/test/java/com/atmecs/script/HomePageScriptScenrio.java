package com.atmecs.script;

import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.driver.DriverClass;
import com.atmecs.scenerios.pages.ExploreMore;
import com.atmecs.scenerios.pages.MoreInfoOne;

public class HomePageScriptScenrio extends DriverClass {
FindLocator loc = new FindLocator();

	
	@Test(priority = 1)
	public void ClickOnExplore()
	{
	 ExploreMore.clickOnExplore(loc, driver);
	  
	}
}
