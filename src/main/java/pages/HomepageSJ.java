package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseSJ;



public class HomepageSJ extends BaseSJ {
	@FindBy(xpath="//a//div[text()='Signup']")
	WebElement signup;
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	public HomepageSJ (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public Signup clicksignup() {
		click(signup);
		windowhandles();
		return new Signup(driver);
		}

	public Login clicklogin() {
		click(login);
		return new Login(driver);
	}
}
