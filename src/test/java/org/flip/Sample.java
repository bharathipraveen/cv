package org.flip;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse\\A\\diver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement close = driver.findElement(By.xpath(""));
	close.click();
	WebElement searchtext = driver.findElement(By.xpath("//input[@type='text']"));
	searchtext.sendKeys("iphone");
	WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
	search.click();
	
//	List<WebElement> li= driver.findElements(By.xpath(""));
//	li.size();
	

	}

}
