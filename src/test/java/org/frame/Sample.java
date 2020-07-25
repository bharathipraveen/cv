package org.frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse\\A\\diver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
	WebElement con = driver.findElement(By.xpath("(//img[@alt='continue'][1])"));
	con.click();
	Alert a=driver.switchTo().alert();
	a.accept();
	driver.quit();
	}

}
