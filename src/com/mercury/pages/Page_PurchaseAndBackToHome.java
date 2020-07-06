package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_PurchaseAndBackToHome extends Basedriver {
	public void purchaseticket() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'buyFlights')]")).click();
	}
	public void backtohomescreen() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@src,'home')]")).click();
		
		System.out.println("Purchased tickets and returned to Home screen.");
		Reporter.log("Purchased tickets and returned to Home screen.");
	}
	public void screenshothome() throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//images//home.png"));
		
		System.out.println("'Home' screenshot taken/saved.");
		Reporter.log("'Home' screenshot taken/saved.");
		
		
	}

}
