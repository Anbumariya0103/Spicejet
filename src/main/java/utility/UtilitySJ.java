package utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilitySJ {
	public static WebDriver driver;
	 public String excelfile; 
	public void launchbrowser(String browser, String url) {
	 ChromeOptions option=new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver(option);}
	  else if(browser.equalsIgnoreCase("edge")){
		  driver=new EdgeDriver();}
	  else if(browser.equalsIgnoreCase("Firefox")){
		  driver=new FirefoxDriver();
	  }
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		}
	public  Object[][] readExcel(String excelfile) throws IOException {
		  XSSFWorkbook book=new XSSFWorkbook("./dataSJ/"+excelfile+".xlsx");
			XSSFSheet sheet = book.getSheetAt(0);
			int rowcount = sheet.getLastRowNum(); 
			short columnCount = sheet.getRow(0).getLastCellNum(); 
			 Object[][]data= new Object[rowcount][columnCount]; 
			for (int i = 1; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < columnCount; j++) {
					XSSFCell cell = row.getCell(j);
					data[i-1][j]=cell.getStringCellValue();
					
				}
			}
			book.close();
			return data;
	  
	}
	
public void actionclass(WebElement actele) {
	 Actions builder = new Actions(driver);
	 builder.moveToElement(actele).perform();
}
	
	public void windowhandles() {
		Set<String> windowhandles= driver.getWindowHandles();
		List<String> listwindow= new ArrayList<String>(windowhandles);
		driver.switchTo().window(listwindow.get(1));
		System.out.println(driver.getTitle());
	}
	
	public static void javaexe( WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("aruguments[0].ScrollIntoView();", element);
	}

	public static void waitExplicit(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public static void waitExplicitUntillTitle(String titleToWait) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.titleIs(titleToWait));
	}
	public static void click (WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	
	public void sendKeys(WebElement ele, String value) {
		
		ele.sendKeys(value);
	}
	public  static void Window()
	{
		Set<String> Windowhandles=driver.getWindowHandles();
	List<String> listwindow= new ArrayList<String>(Windowhandles);
	driver.switchTo().window(listwindow.get(1));
	System.out.println(driver.getTitle());
	}
	public static void jsScrollUntillElement(WebElement element) {
		click(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void jsClickOn(WebElement element) {
		click(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	public static void type(WebElement element, String text) {
		click(element);
		element.clear();
		element.sendKeys(text);
	}
	public static void fields(WebElement ele1) {
		if(ele1.isDisplayed()) {
			System.out.println(ele1+"is available");
		}
		else {
			System.out.println(ele1+"is not available");
		}
	}
	public static void actions(WebElement ele) {
		Actions builder= new Actions(driver);
		builder.moveToElement(ele).perform();
		
//	
//			ele1= driver.findElement(By.className(ele1));
//			 driver.switchTo().frame(ele1);
//			
//		}
	}
	public boolean isAlertPresent(WebElement alert) {
		try {
			driver.switchTo().alert().dismiss();
			return true;
			}catch(NoAlertPresentException e) {
		return false;
			}
	}
	
	public static void selectFromDropDown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	public String getscreenshot(String testmethodname) throws IOException {
		String path ="./ScreenshotSJ/"+testmethodname+".png";
		TakesScreenshot srcshot = ((TakesScreenshot) driver);
		 File source =srcshot.getScreenshotAs(OutputType.FILE);
		 File dest= new File(path);
		 FileUtils.copyFile(source, dest);
		 return path;
	}
	public void alert() {
	driver.switchTo().alert().accept();
	}
	
	public void closebrowser() {
		driver.close();

	}}

