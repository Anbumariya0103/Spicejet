package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseSJ;
import pages.FieldsAvailableonBookingpage;
import pages.HomepageSJ;


public class TC_005_SJ_FieldsAvailable  extends BaseSJ{
	@BeforeTest
	public void setup() {
	}

	@Test(priority=6)
	public void TC_005_SJ_FieldsAvailable() throws Exception {
		HomepageSJ hp = new HomepageSJ(driver);
		FieldsAvailableonBookingpage fabp= new FieldsAvailableonBookingpage(driver);
		fabp.checkin1();
		hp.getscreenshot("Validating checkin");
		fabp.flight();
		hp.getscreenshot("Validating flight status");
		fabp.book();
		hp.getscreenshot("Validating manage  booking");
}
}