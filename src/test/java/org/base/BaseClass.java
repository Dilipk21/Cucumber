package org.base;

import java.awt.Robot;

//import org.openqa.selenium.JavascriptExecutor;
/*
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
		
	}
		public static void loadUrl(String url) {
		driver.get(url);
		
		}
		public static void maxBrowser() {
			driver.manage().window().maximize();
		} 
		public static void pageTitle()
		{
	   String title = driver.getTitle();
	   System.out.println(title);
	   	
       String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
		}
		
		public static void fill(WebElement element,String Usertext)
		{
			element.sendKeys(Usertext);
			
		}
		public static void btnclick(WebElement element) {
			element.click();
		}
		public static String toGetText(WebElement element)
		{
			String text = element.getText();
			return text;
			
					}
		public static void toQuit() {
			driver.quit();
		}
		public static String toGetAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
		

		}
}
	/*	public static String excelRead(int rowNo,int cellNo) throws IOException {
			File f=new File("C:\\Users\\PC 721\\eclipse-workspace\\Maven\\Excel\\Fblogin.xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fin);
			Sheet sht = book.getSheet("Sheet1");
			Row r = sht.getRow(rowNo);
			Cell c = r.getCell(cellNo);
			int value = c.getCellType();
			String type="";
			if (value==1) {
				type=c.getStringCellValue();
			} else if (DateUtil.isCellDateFormatted(c)){
				Date dd = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
				type = sim.format(dd);

			}
			else {
				double d = c.getNumericCellValue();
				System.out.println(d);
		      long l=(long)d;
		      System.out.println(l);
		      type = String.valueOf(1);
			}
			return type;
		}
		}
*/

