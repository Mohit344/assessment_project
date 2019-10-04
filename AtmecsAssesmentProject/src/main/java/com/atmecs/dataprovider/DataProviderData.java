package com.atmecs.dataprovider;



import org.testng.annotations.DataProvider;

import com.atmecs.constant.FileConstant;
import com.atmecs.util.ProviderData;

public class DataProviderData {

	
	/**
	 * Data provider 1
	 * @return
	 */
		@DataProvider(name ="moreinfotestdata" )
		public Object[][] getDataOne() {
			ProviderData provideData = new ProviderData(FileConstant.infotestdata);
			Object[][] getData = provideData.provideData();
			return getData;
		}
	
		
		/**moreinfotestdata
		 * data provider 2
		 * @return
		 */
		@DataProvider(name = "exploretestdata")
		public Object[][] getDataSecond() {
			ProviderData provideData = new ProviderData(FileConstant.exploretestdata);
			Object[][] getData = provideData.provideData();
			return getData;
		}
		
		/**
		 * Data provider 3
		 * @return
		 */
//			@DataProvider(name = "testdata")
//			public Object[][] getDataThird() {
//				//ProviderData provideData = new ProviderData(FileConstant.infotestdata);
//				Object[][] getData = provideData.provideData();
//				return getData;
//			}
//		
//			/**
//			 * Data provider 4
//			 * @return
//			 */
//				@DataProvider(name = "testdata4")
//				public Object[][] getDataForth() {
//					ProviderData provideData = new ProviderData(FileConstant.testdata4);
//					Object[][] getData = provideData.provideData();
//					return getData;
//				}
//		
//		
//		
		
}
