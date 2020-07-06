package com.mercury.basedriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Basedriver {

	public static WebDriver driver = null;

	@BeforeTest
	public void launchbrowserandurl() throws IOException {
		
		// Initialise chrome browser
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		System.out.println("Browser opened.");
		Reporter.log("Browser opened.");

		// Open mercury website
		driver.get(getdata("url"));
		
		String actualLocator=driver.findElement(By.xpath(".//*[text()='SUPPORT']")).getText();
		Assert.assertEquals("SUPPORT", actualLocator);
		
		
		System.out.println("Mercury site opened and validation-done:'SUPPORT'.");
		Reporter.log("Mercury site opened and validation-done:'SUPPORT'.");

	}

	@AfterTest
	//close browser
	public void closebrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
		System.out.println("Browser closed.");
		Reporter.log("Browser closed.");
		
	}

	//read data from properties file
	public static String getdata(String data) throws IOException {
		FileReader path = new FileReader(".//driver//Mercury.properties");
		Properties prop = new Properties();
		prop.load(path);
		String value =prop.getProperty(data);
		return value;
	}

}
