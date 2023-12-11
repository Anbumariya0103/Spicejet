package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseSJ;

public class FieldsAvailableonBookingpage  extends BaseSJ{
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkin;
	@FindBy(xpath="//div[text()='flight status']")
	WebElement flight;
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement managebk;
	public FieldsAvailableonBookingpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public FieldsAvailableonBookingpage checkin1() {
		fields(checkin);
		click(checkin);
		return this;}
	public FieldsAvailableonBookingpage flight() {
		fields(flight);
		click(flight);
		return this;}
	
	public FieldsAvailableonBookingpage book() {
		fields(managebk);
		click(managebk);
		return this;
		}
	}