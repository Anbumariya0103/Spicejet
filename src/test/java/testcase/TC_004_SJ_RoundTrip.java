package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseSJ;
import pages.HomepageSJ;
import pages.Login;
import pages.RoundTrip;


public class TC_004_SJ_RoundTrip extends BaseSJ {
	@BeforeTest
	public void setup() {
		excelfile="ValidLoginData";
	}

	@Test(dataProvider ="getData",priority=5)
	public void TC_004_SJ_RoundTrip(String Email,String Password) throws Exception {
		HomepageSJ hp = new HomepageSJ(driver);
		hp.clicklogin();
		Login lg= new Login(driver);
		lg.emailradio();
		lg.emailbox(Email);
		lg.password1(Password);
		lg.LoginClick();
		Thread.sleep(3000);
		RoundTrip rt= new RoundTrip(driver);
		rt.clickroundtrip1();
		rt.Selectdepature();
		rt.Selectreturn();
		rt.clickroundtrip111();
		rt.clickroundtrip2();
		rt.clickroundtrip3("Rajappan", "R", "9080546548");
		rt.clickroundtrip4();
		rt.clickroundtrip5("7894578478213658");
		hp.getscreenshot("roundtrip");
		
	}
}

