package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseSJ;
import pages.HomepageSJ;
import pages.Login;
import pages.OneWay;


public class TC_003_SJ_OneWay extends BaseSJ {
	@BeforeTest
	public void setup() {
		excelfile="ValidLoginData";
	}

	@Test(dataProvider ="getData",priority=4)
	public void TC_003_SJ_OneWay(String Email,String Password) throws Exception {
		HomepageSJ hp = new HomepageSJ(driver);
		hp.clicklogin();
		Login lg= new Login(driver);
		lg.emailradio();
		lg.emailbox(Email);
		lg.password1(Password);
		lg.LoginClick();
		Thread.sleep(3000);
		OneWay ow= new OneWay(driver);
		ow.clickoneway1();
		//ow.clickoneway11();
		ow.Selectday();
		ow.clickoneway111();
		ow.clickoneway2();
		ow.clickoneway3("Rajappan", "R", "9080546548");
		ow.clickoneway4();
		ow.clickoneway5("7894578478213658");
		hp.getscreenshot("oneway");
		
		
	}
}