package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseSJ;
import pages.HomepageSJ;
import pages.Signup;

public class TC_001_SJ_Valid_Signup extends BaseSJ {

	@BeforeTest
	public void setup() {
		
		excelfile="ValidSignupData";
	}
	
	@Test( dataProvider ="getData",priority=2 )
	public void TC_001_SJ_Valid_Signup (String Firstname, String Lastname,String Mobile, String Email,String Password,String ConfirmPassword) throws IOException, InterruptedException {
		
		HomepageSJ hp= new HomepageSJ(driver);	
		hp.clicksignup();
	Signup su= new Signup(driver);
	su.Title("Mr");
	su.firstname(Firstname);
	su.lastname(Lastname);
	su.country("India");
	su.dob();
	su.dobmonth("July");
	su.dobyear("1998");
	su.Selectday();
	su.mobile(Mobile);
	su.email(Email);
	su.password(Password);
	su.conpassword(ConfirmPassword);
	su.termsCheckbox();
	su.SignupClick();
	hp.getscreenshot("TC_001_SJ_Valid_Signup");
	}
	
}
  
