package com.atmecs.script;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.DataProviderTwo;
import com.atmecs.dataprovider.DataProviderthird;
import com.atmecs.driver.Driver_Class;
import com.atmecs.pages.HomeFooterValidateMethod;
import com.atmecs.pages.ServiceContextpages;

public class ServicesContextMenu extends Driver_Class  {
	
	FindLocator loc = new  FindLocator();
@Test(priority =17)	
public void hoverOnServices()
{Logger log = Logger.getLogger(ServicesContextMenu.class);
log.info("hover on the services  and digital life");
	ServiceContextpages.mouseHover(driver, loc);	
}
@Test(priority = 18, dataProvider = "testdata2", dataProviderClass = DataProviderTwo.class)
public void validateSubmenu(String subserviecs)
{
	HomeFooterValidateMethod.validatesubserviecs(subserviecs, loc, driver);
	Logger log = Logger.getLogger(ServicesContextMenu.class);
	log.info("validated the submenu didgitallife ");
	
}

@Test(priority = 19)
public void infrastructureservice()
{Logger log = Logger.getLogger(ServicesContextMenu.class);
log.info("HoverOnInfra ");
	ServiceContextpages.mouseHoverOnInfra(driver, loc);
}

@Test(priority = 20, dataProvider = "testdata3", dataProviderClass = DataProviderthird.class)

	public void validateInfraServices(String subserviecs)
	{	
		HomeFooterValidateMethod.validatesubserviecs(subserviecs, loc, driver);
		Logger log = Logger.getLogger(ServicesContextMenu.class);
		log.info("validated the submenu infra Services ");
	}
}








