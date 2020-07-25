package org.alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse\\A\\diver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" http://demo.automationtesting.in/Alerts.html");
	
	
	}

}
