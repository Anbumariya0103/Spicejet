package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.UtilitySJ;



public class BaseSJ extends UtilitySJ {
	
	  @Parameters({"browser","url"})
	  @BeforeMethod
	  public void browserLaunch(String browser, String url) {
		  
		  launchbrowser(browser, url);
		  
	  }
		
	  @DataProvider(name = "getData")
		public Object[][] getData() throws IOException {
		  Object[][] data = readExcel(excelfile);
			return data;
		}
	  
	 @AfterMethod  
	  public void closeBrowser() { 
		 driver.close();
		 driver.quit();
		  
	  }
}
