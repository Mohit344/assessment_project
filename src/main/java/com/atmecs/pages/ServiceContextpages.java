package com.atmecs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.atmecs.constant.FindLocator;

public class ServiceContextpages {

	public  static void mouseHover(WebDriver driver,FindLocator loc)
	{
		
		Actions action = new Actions( driver);

		WebElement wb2 = driver.findElement(By.xpath(loc.getlocator("services")));
		System.out.println(wb2.getText());
		action.moveToElement(wb2).build().perform();

		WebElement wb = driver.findElement(By.xpath(loc.getlocator("digitalife")));
		System.out.println(wb.getText());
		action.moveToElement(wb).build().perform();
		
		
	}
	
	
	public static void mouseHoverOnInfra(WebDriver driver,FindLocator loc)
	{
		
		Actions action = new Actions( driver);
		WebElement wb = driver.findElement(By.xpath(loc.getlocator("infrastructureservice")));
		System.out.println(wb.getText());
		action.moveToElement(wb).build().perform();
		
	}

	
	 


}


