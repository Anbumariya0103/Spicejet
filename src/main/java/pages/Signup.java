package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseSJ;

public class Signup extends BaseSJ {
	String date="2";
	@FindBy(xpath="//select[@class=\"form-control form-select \"]")
	WebElement Title;
	@FindBy(xpath="//input[@id=\"first_name\"]")
	WebElement firstname;
	@FindBy(xpath="//input[@id=\"last_name\"]")
	WebElement lastname;
	@FindBy(xpath="//select[@class=\"form-control form-select\"]")
	WebElement country;
	@FindBy(xpath="//input[@id=\"dobDate\"]")
	WebElement dob;
	@FindBy(xpath="//select[@class=\"react-datepicker__month-select\"]")
	WebElement dobmonth;
	@FindBy(xpath="//select[@class=\"react-datepicker__year-select\"]")
	WebElement dobyear;
//	@FindBy(xpath="//div[text()='15']")
//	WebElement dobday; 
	@FindBy(xpath="//input[@class=\" form-control\"]")
	WebElement mobile;
	@FindBy(xpath="//input[@id=\"email_id\"]")
	WebElement email;
	@FindBy(xpath="//input[@id=\"new-password\"]")
	WebElement password;
	@FindBy(xpath="//input[@id=\"c-password\"]")
	WebElement conpassword;
	@FindBy(xpath="//input[@id=\"defaultCheck1\"]")
	WebElement terms;
	@FindBy(xpath="//button[text()='Submit']")
 	WebElement submitbtn;
	
	public Signup (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Signup Title( String Title1) {
		click(Title);
		selectFromDropDown(Title, Title1);
		return this;
	}

 public Signup firstname(String Firstname) {

 sendKeys(firstname, Firstname);
return this;
}
public Signup lastname(String Lastname) {

sendKeys(lastname, Lastname);
return this;
}

public Signup country( String Country1) {
	//actionclass(country);
	click(country);
	selectFromDropDown(country, Country1);
	return this;
}
public Signup dob() {
    click(dob);
	return this;	
}
	public Signup dobmonth(String dobmonnth1) {
	selectFromDropDown(dobmonth, dobmonnth1);
	return this;
}
	public Signup dobyear(String dobyear1) {
	selectFromDropDown(dobyear,dobyear1);
	return this;
	}
	public Signup Selectday() throws InterruptedException {
		 WebElement date=driver.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--001\"]"));
		  date.click();
		return this;
	}
//	public Signup dobday(String dobday1) {
//	selectFromDropDown(dobday, dobday1);
//	click(dobday);
//	return this;
//}

	
public Signup mobile(String Mobile) {
sendKeys(mobile, Mobile);
return this;
}
	
public Signup email(String Email) {
sendKeys(email, Email);
return this;
}
public Signup password(String Password) {
sendKeys(password, Password);
return this;
}
public Signup conpassword(String ConfirmPassword) {

sendKeys(conpassword, ConfirmPassword);
return this;
}

public Signup termsCheckbox() {
	//actionclass(terms);
	terms.click();
	return this;
	
}

public Signup SignupClick() throws InterruptedException{
	waitExplicit(submitbtn);
	submitbtn.click();
	return this;
	
}

}

