package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_Login extends Basedriver {
	
	public void login() throws IOException, InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'userName')]")).sendKeys(getdata("username"));
		driver.findElement(By.xpath(".//*[contains(@name,'password')]")).sendKeys(getdata("password"));
		driver.findElement(By.xpath(".//*[contains(@value,'Login')]")).click();
		
		System.out.println("Logged in succesfully.");
		Reporter.log("Logged in succdesfully.");		
	}
	
	public void loginScreenshot() throws IOException {
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//images//login.png"));
		
		System.out.println("Sign-in screenshot taken/saved.");
		Reporter.log("Sign-in screenshot taken/saved.");
	}
}
