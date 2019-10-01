package com.atmecs.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.helper.CommonUtility;

public class BlogPages {
	
    
	public static void blog(WebDriver driver,FindLocator loc)
	{
		
		Actions action = new Actions(driver);
		WebElement wb1 = driver.findElement(By.xpath(loc.getlocator("Insight")));
		System.out.println(wb1.getText());
		action.moveToElement(wb1).build().perform();
		CommonUtility.clickElement(driver,loc.getlocator("blogs"));
		CommonUtility.clickElement(driver, loc.getlocator("clickonread"));
	}
		
	public static void getDate(FindLocator loc,WebDriver driver) {
		String date = CommonUtility.getText(driver, loc.getlocator("blogdate"));//(Locators.getLocators("loc.btn.date"));
		DateFormat originalFormat = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
		DateFormat targetFormat = new SimpleDateFormat("yyyyMMdd");
		date = targetFormat.format(originalFormat);
		String month[] = date.split(",");
	}
	public static void clickSubmit(FindLocator loc,WebDriver driver) {
		CommonUtility.scrollToElement(driver,loc.getlocator("clickcomment"));
        
		CommonUtility.clickElement(driver,loc.getlocator("submitbtn") );
		
//		String required = CommonUtility.getText(driver,"//textarea[@id='comment']");
//		Assert.assertEquals(required, ValidatingData.getValidatingData("commentAlert"),
//				"Error msg functionality not correct");
	}
	
	
	
	
	
	@SuppressWarnings("deprecation")
	public static int getDate(WebDriver driver,FindLocator loc) {

		String string = CommonUtility.getText(driver,loc.getlocator("Blogdate1"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate localDate = LocalDate.parse(string, formatter);
		System.out.println(localDate); // 2010-01-02

		String local[] = (localDate + "").split("-");

		String day = Calendar.getInstance().getTime() + "";
		Date date = new Date();
		int month = date.getMonth() + 1;
//		System.out.println(day);// 5 2 1 Fri Sep 27 14:28:35 IST 2019
		String[] date1 = day.split(" ");
		String systemDate = date1[5] + month + date1[2];
		System.out.println(systemDate);
		int monthDifference = Integer.parseInt(date1[5]) - month;
		if (monthDifference < 0) {
			monthDifference = 12 - monthDifference;
		}

		int yearDifference = Integer.parseInt(local[0]) - Integer.parseInt(date1[5]);
		if (yearDifference > 0) {
			int difference = yearDifference * 12;
			monthDifference = monthDifference + difference;
		}
		return monthDifference;
	}
	
	

		
		
//		
//		String title1= CommonUtility.getText(driver, loc.getlocator("blogtitle"));
//		String date1=CommonUtility.getText(driver, loc.getlocator("datematch"));
//		 DayConversion.monthINFormate(stringdate);
//		 ValidationMethod.verify(stringdate, date1, "not match");
//		 ValidationMethod.verify(title, title1, "not match");
//		 
//		 DayConversion.monthINFormate(stringdate);
//		 
//		 String sdate11=DayConversion.monthDifference(stringdate);
//		 System.out.println(sdate11);
//	
//		 LocalDate date = LocalDate.now();
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//			String t=date.format(formatter);
//			System.out.println(t);
//			
//           
//			
//			
//			
//		CommonUtility.clickElement(driver,loc.getlocator("clickonblog"));
//		((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
//		
//	//driver.findElement(By.xpath("(//a[contains(@class,'gitem-link vc-zone-link')])[2]")).click();
////	((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
//		CommonUtility.clickElement(driver, loc.getlocator("clickcomment"));
//		
//		CommonUtility.clickElement(driver,loc.getlocator("submitbtn"));
//		
//		
//	
//	driver.quit();
//		
//		
//		
		
	
	
	
	@AfterSuite
	public void endReport(WebDriver driver) {
		driver.quit();// quit the webdriver
		  
}
}

