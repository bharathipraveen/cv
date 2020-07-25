package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse\\A\\diver\\chromedriver.exe");
        driver=new ChromeDriver();
	}
public static void maximize() {
	driver.manage().window().maximize();

}
public static void geturl(String url) {
	driver.get(url);

}
public static void typetext(WebElement element , String text) {
	element.sendKeys(text);
	}
public static void buttonclick(WebElement element) {
	element.click();
	}
public static void close() {
	driver.close();
}
public static void screenshot() {
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	File source=tk.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Praveen\\eclipse\\A\\screenshot\\screenshotframe"
	+generateRandomDate()+".png");
	try {
		FileUtils.copyDirectory(source, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

    public static String generateRandomDate() {
	return new SimpleDateFormat("EEE_MMM_dd_yyy_hhmmss").format(new Date());
	}
    public static void alertaccept() {
    	Alert a=driver.switchTo().alert();
    	a.accept();
    	}
    public static void mainWindow() {
		driver.switchTo().defaultContent();

	}
    public static void frameid(String name) {

     driver.switchTo().frame(name);
}
    public static void framelacator(WebElement element) {
    	driver.switchTo().frame(element);
		
	}
    
    
}
