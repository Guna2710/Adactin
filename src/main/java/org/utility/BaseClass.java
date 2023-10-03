package org.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String brows) {
		if(brows.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(brows.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(brows.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		return driver;
	}
	public static WebDriver browserLaunch1(String brows) {
		if(brows.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(brows.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(brows.equals("edge")) {
			driver=new EdgeDriver();
		}
		return driver;
	}
	
public static WebDriver chromeDriver() {
	   driver=new ChromeDriver();
	   return driver;
}
public static void urlLaunch(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}
public static void implicityWait(int a) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
}
public static void close() {
	driver.close();
}
public static void quit() {
	driver.quit();
}
//Webelement 
public static String currentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
}
public static String getTitle() {
	String title = driver.getTitle();
	return title;
}
public static void sendKeys(WebElement e,String value) {
	e.sendKeys(value);
}
public static void click(WebElement e) {
	e.click();
}
public static String getText(WebElement e) {
	String text = e.getText();
	return text;
}
public static String getAttributevalue(WebElement e) {
	String attribute = e.getAttribute("value");
	return attribute;
}
public static String getAttributeInnerValue(WebElement e) {
	String attribute = e.getAttribute("innertext");
	return attribute;
}
public static boolean enabled(WebElement e) {
	boolean enabled = e.isEnabled();
	return enabled;
}
public static boolean displayed(WebElement e) {
	boolean displayed = e.isDisplayed();
	return displayed;
}
public static boolean selected(WebElement e) {
	boolean selected = e.isSelected();
	return selected;
}
public static void clear(WebElement e) {
	e.clear();
}

public static void getScreenShot(WebElement e) throws IOException {
	File srcFile = e.getScreenshotAs(OutputType.FILE);
	long filename=System.currentTimeMillis();
	File destFile=new File("C:\\Users\\MR\\eclipse-workspace\\Maven_11am_sep_2023\\src\\test\\resources\\Screenshot\\"+filename+".png");
	FileUtils.copyFile(srcFile, destFile);
}

// Action class
public static void moveToElements(WebElement e) {
	Actions action=new Actions(driver);
	action.moveToElement(e).perform();
}
public static void dragAndDrop(WebElement src,WebElement dest) {
	Actions action=new Actions(driver);
	action.dragAndDrop(src, dest).perform();
}
public static void clickAndHold(WebElement e) {
	Actions action=new Actions(driver);
	action.clickAndHold(e).perform();
}
public static void actionClick(WebElement e) {
	Actions action=new Actions(driver);
	action.click(e).perform();
}
public static void contextClick(WebElement e) {
	Actions action=new Actions(driver);
	action.contextClick(e).perform();
}
public static void doubleclick(WebElement e) {
	Actions action=new Actions(driver);
	action.doubleClick(e).perform();
}


//Alert
public static void accept() {
	Alert a=driver.switchTo().alert();
	a.accept();
}
public static void dismiss() {
	Alert a=driver.switchTo().alert();
	a.dismiss();
}
public static void alertSendkeys(String value) {
	Alert a=driver.switchTo().alert();
	a.sendKeys(value);
}
public static String alertGetText() {
	Alert a=driver.switchTo().alert();
	String text = a.getText();
	return text;
}


//Select class
public static void selectByIndex(WebElement e,int a) {
	Select s=new Select(e);
	s.selectByIndex(a);
}
public static void selectByValue(WebElement e,String value) {
	Select s=new Select(e);
	s.selectByValue(value);
}
public static void selectByVisibletext(WebElement e,String value) {
	Select s=new Select(e);
	s.selectByVisibleText(value);
}
public static void deSelectByIndex(WebElement e,int a) {
	Select s=new Select(e);
	s.deselectByIndex(a);
}
public static void deSelectByValue(WebElement e,String value) {
	Select s=new Select(e);
	s.deselectByValue(value);
}
public static void deSelectByVisibletext(WebElement e,String value) {
	Select s=new Select(e);
	s.deselectByVisibleText(value);
}
public static void deSelectAll(WebElement e) {
	Select s=new Select(e);
	s.deselectAll();
}
public static List<String> getOptions(WebElement e) {
	Select s=new Select(e);
	List<WebElement> options = s.getOptions();
	List<String> li=new ArrayList<String>();
	for(WebElement x:options) {
		String text = x.getText();
		li.add(text);
	}
	return li;
}

public static List<WebElement> getAllSelectedOptions(WebElement e) {
	Select s=new Select(e);
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//	List<String> li=new ArrayList<String>();
//	 for(WebElement x:allSelectedOptions) {
//		 String text = x.getText();
//		 li.add(text);
//	 }
	return allSelectedOptions;
	
	//return text;
}
public static boolean isMultiple(WebElement e) {
	Select s=new Select(e);
	boolean multiple = s.isMultiple();
	return multiple;
}
public static String getFirstSelectedOptions(WebElement e) {
	Select s=new Select(e);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	String text = firstSelectedOption.getText();
	return text;
}
public static void getScreenshot() throws IOException {
	TakesScreenshot take=(TakesScreenshot)driver;
	File sourceFile = take.getScreenshotAs(OutputType.FILE);
	long filename2=System.currentTimeMillis();
	File destinationFile=new File("C:\\Users\\MR\\eclipse-workspace\\Maven_11am_sep_2023\\src\\test\\resources\\Screenshot"+filename2+".png");
	FileUtils.copyFile(sourceFile, destinationFile);
}
//window handles
public static void getWindowHandles(int a) {
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> li=new ArrayList<String>();
	li.addAll(windowHandles);
	driver.switchTo().window(li.get(a));
}
public static String getWindowHandle() {
	String windowHandle = driver.getWindowHandle();
	return windowHandle;

}
//javaScriptexecutor
public static void clickJs(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",e);
}
public static void scrollUp(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)",e);
}
public static void scrollDown(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",e);
}
//frame
public static void frameElement(WebElement e) {
	driver.switchTo().frame(e);
}
public static void frameIndex(int a) {
	driver.switchTo().frame(a);
}
public static void frameName(String value) {
	driver.switchTo().frame(value);
}
public static void defaultContent() {
	driver.switchTo().defaultContent();
}
public static void parentFrame() {
	driver.switchTo().parentFrame();
}
//Navigation
public static void navigateTo(String url) {
	driver.navigate().to(url);
}
public static void refresh() {
	driver.navigate().refresh();
}
public static void back() {
	driver.navigate().back();
}
public static void forward() {
	driver.navigate().forward();
}

//Data Driven values
//type=1-->String
//type=0-->number
public static String excelRead(String filename,String sheet,int row,int column) throws IOException {
	File f=new File("C:\\Users\\MR\\eclipse-workspace\\Testng_sep_2023\\src\\test\\resources\\ExcelSheet\\"+filename+".xlsx");
	FileInputStream fs=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fs);
	Sheet s = w.getSheet(sheet);
	Row r = s.getRow(row);
	Cell cell = r.getCell(column);
	int type = cell.getCellType();
	String value=null;
	if(type==1) {
		  value = cell.getStringCellValue();
	}
	else {
		if(DateUtil.isCellDateFormatted(cell)){
			  Date dateCellValue = cell.getDateCellValue();
			  SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
			   value = sd.format(dateCellValue);
			
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long num=(long)numericCellValue;
			 value = String.valueOf(num);
		}
	}
	return value;
}
//get all values in excel
public static Cell excelData(String filename,String sheet,int row,int column) throws IOException {
	File f=new File("C:\\Users\\MR\\eclipse-workspace\\Testng_sep_2023\\src\\test\\resources\\ExcelSheet\\"+filename+".xlsx");
	FileInputStream fs=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fs);
	Sheet s = w.getSheet(sheet);
	Row r = s.getRow(row);
	Cell cell = r.getCell(column);
	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
		Row r2 = s.getRow(i);
		for(int j=0;j<r2.getPhysicalNumberOfCells();j++) {
			 cell = r2.getCell(j);
		}
	}
	return cell;	
}

}



