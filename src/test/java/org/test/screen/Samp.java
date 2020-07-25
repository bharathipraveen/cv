package org.test.screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samp {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse\\A\\diver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Praveen\\eclipse\\A\\screenshot\\fb.png");
		FileUtils.copyFile(scr, des);
	}

}
