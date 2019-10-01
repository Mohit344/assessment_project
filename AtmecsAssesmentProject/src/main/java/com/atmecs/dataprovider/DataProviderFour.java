package com.atmecs.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.constant.FileConstant;
import com.atmecs.util.ProviderData;

public class DataProviderFour {

	
	/**
	 * Data provider to bookcartwo
	 * @return
	 */
		@DataProvider(name = "testdata4")
		public Object[][] getData() {
			ProviderData provideData = new ProviderData(FileConstant.testdata4);
			Object[][] getData = provideData.provideData();
			return getData;
		}
	
	
	
	
}
