package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseSJ;
import pages.HomepageSJ;
import pages.Login;

public class TC_002_SJ_Login extends BaseSJ {
	@BeforeTest
	public void setup() {
		
		excelfile="InvalidLoginData";
	}
	
	@Test( dataProvider ="getData",priority=3 )	
public void TC_002_SJ_Login (String Email, String Password ) throws IOException, InterruptedException {
		
		HomepageSJ hp = new HomepageSJ(driver);
		hp.clicklogin();
		Login lg= new Login(driver);
		lg.emailradio();
		lg.emailbox(Email);
		lg.password1(Password);
		lg.LoginClick();
		hp.getscreenshot("InvalidLoginpage");
		
	}

}