package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseSJ;

public class Login extends BaseSJ {
@FindBy(xpath="//div[text()='Email']")
WebElement emailradio;
@FindBy(xpath="//input[@type=\"email\"]")
WebElement emailbox;
@FindBy(xpath="//input[@type=\"password\"]")
WebElement password1;
@FindBy(xpath="//div[@data-testid=\"login-cta\"]")
WebElement loginbtn;

	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Login emailradio()
	{
		click(emailradio);
		return this;
	}
public Login  emailbox(String Email) {
		
		sendKeys(emailbox,Email);
		return this;
	}
	public Login password1 (String Password) {
		
		sendKeys(password1,Password);
		return this;
	}	
	public Login LoginClick() throws InterruptedException{
		//Thread.sleep(3000);
		click(loginbtn);	
		return this;
	}
	
	}

