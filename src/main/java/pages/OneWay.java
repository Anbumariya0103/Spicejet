package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseSJ;

public class OneWay extends BaseSJ {
	@FindBy(xpath="//div[text()='one way']")
	WebElement onewayradio;
	@FindBy(xpath="//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"][1]")
	WebElement fromtxt;
	@FindBy(xpath="//div[@data-testid=\"to-testID-destination\"]")
	WebElement totxt;
	@FindBy(xpath="//div[text()='AMD']")
	WebElement ahmedabad;
	@FindBy(xpath="//div[text()='BLR']")
	WebElement bengaluru;
	@FindBy(xpath="//div[text()='Departure Date']")
	WebElement datetxtclick;
	@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c\"]")
	WebElement nextbtn;
//	@FindBy(xpath="//div[text()='15'][1]")
//	WebElement selectdate;
	@FindBy(xpath="//div[text()='Passengers']")
	WebElement passengerclick;
	@FindBy(xpath="//div[@data-testid=\"Adult-testID-plus-one-cta\"]")
	WebElement addpassenger;
	@FindBy(xpath="//div[@data-testid=\"home-page-flight-cta\"]")
	WebElement searchflightbtn;
	@FindBy(xpath="//div[@data-testid=\"continue-search-page-cta\"]")
	WebElement continuebtn1;
	@FindBy(xpath="//div[text()='I am flying as the primary passenger']")
WebElement pripassenger;
	@FindBy(xpath="//div[text()='Passenger 2']")
	WebElement passenger2;
		@FindBy(xpath="//input[@data-testid=\"traveller-1-first-traveller-info-input-box\"]")
		WebElement p2fn;
		@FindBy(xpath="//input[@data-testid=\"traveller-1-last-traveller-info-input-box\"]")
	    WebElement p2ln;
		@FindBy(xpath="//input[@data-testid=\"sc-member-mobile-number-input-box\"]")
		WebElement p2mobile;
		@FindBy(xpath="//div[@data-testid=\"traveller-info-continue-cta\"]")
		WebElement continuebtn2;
		@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73\"][3]")
		WebElement continuebtn3;
		@FindBy(xpath="//div[@id=\"at_addon_close_icon\"]")
		WebElement adclose;
		@FindBy(xpath="//span[@id=\"skipfrompopup\"][1]")
		WebElement skip;
		@FindBy(xpath="//div[@data-testid=\"application-id\"]")
		WebElement application;
		@FindBy(xpath="//iframe[@class=\"card_number_iframe\"]")
		WebElement frame;
		@FindBy(xpath="//iframe[@name=\"name_on_card_iframe_R2AkdLS3tRGD1C0S\"]")
		WebElement frame1;
		@FindBy(xpath="//iframe[@class=\"card_exp_month_iframe\"]")
		WebElement frame2;
		@FindBy(xpath="class=\"card_exp_year_iframe\"")
		WebElement frame3;
		@FindBy(xpath="//iframe[@class=\"security_code_iframe\"]")
		WebElement frame4;
		@FindBy(xpath="//input[@id=\"card_number\"]")
		WebElement cardnumber;
		@FindBy(xpath="//input[@id=\"name_on_card\"]")
		WebElement cardholdername;
		@FindBy(xpath="//input[@id=\"card_exp_month\"]")
		WebElement cexmonth;
		@FindBy(xpath="//input[@id=\"card_exp_year\"]")
		WebElement cexyear;
		@FindBy(xpath="//input[@id=\"security_code\"]")
		WebElement cardsec;
		@FindBy(xpath="//div[text()='Proceed to pay']")
		WebElement ptpay;
		
	//start from login
public OneWay(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

public OneWay clickoneway1() throws InterruptedException {
	//click(onewayradio);
	Thread.sleep(3000);
click(fromtxt);
	actionclass(ahmedabad);
	click(ahmedabad);
	click(totxt);
	actionclass(bengaluru);
	click(bengaluru);
	return this;
}
//public OneWay clickoneway11() throws InterruptedException {
//	
//click(datetxtclick);
//Thread.sleep(3000);
//return this;
//}

public OneWay Selectday() throws InterruptedException {
	//click(nextbtn); 
	WebElement date=driver.findElement(By.xpath("//div[text()='17'][1]"));
	  date.click();
	return this;
}


	public OneWay clickoneway111() throws InterruptedException {
	Thread.sleep(3000);
	click(passengerclick);
	click(addpassenger);
	click(searchflightbtn);
	return this;
}
public OneWay clickoneway2() throws InterruptedException {
	Thread.sleep(3000);
	click(continuebtn1);
	actionclass(pripassenger);
	click(pripassenger);
	return this;
}
	public OneWay clickoneway3(String firstname,String lastname,String mobile) {
	click(passenger2);
	type(p2fn, firstname);
	type(p2ln, lastname);
	type(p2mobile, mobile);
	return this;
}
	public OneWay clickoneway4() throws InterruptedException {
		click(continuebtn2);
		Thread.sleep(3000);
//		click(application);
//		click(application);
		//click(adclose);
	    //Thread.sleep(3000);
		if(skip.isDisplayed()){
			click(skip);
			Thread.sleep(3000);
			click(continuebtn3);
		}
		else {
			Thread.sleep(3000);
			click(continuebtn3);
		}
		return this;
	}
	public OneWay clickoneway5(String cardno) throws InterruptedException {
		driver.switchTo().frame(frame);
		type(cardnumber, cardno);
		actionclass(ptpay);
		click(ptpay);
		Thread.sleep(3000);
		//System.out.println(ptpay.getText());
		return this;
		
	}
	
}

