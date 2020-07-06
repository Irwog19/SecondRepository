package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_BillingAndDeliveryAddress extends Basedriver {
	public void billingaddress() throws InterruptedException, IOException {
		Thread.sleep(1000);
		
		//Billing address
		driver.findElement(By.xpath(".//*[contains(@name,'billAddress1')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'billAddress1')]")).sendKeys(getdata("billaddress1"));
		
		driver.findElement(By.xpath(".//*[contains(@name,'billAddress2')]")).sendKeys(getdata("billaddress2"));
		
		driver.findElement(By.xpath(".//*[contains(@name,'billCity')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'billCity')]")).sendKeys(getdata("billcity"));
		
		driver.findElement(By.xpath(".//*[contains(@name,'billState')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'billState')]")).sendKeys(getdata("billstate"));
		
		driver.findElement(By.xpath(".//*[contains(@name,'billZip')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'billZip')]")).sendKeys(getdata("billzipcode"));
		
		WebElement billcountry=driver.findElement(By.xpath(".//*[contains(@name,'billCountry')]"));
		Select dd_billcountry = new Select(billcountry);
		dd_billcountry.selectByVisibleText(getdata("billcountry"));
		
			
		//Ticketless travel
		driver.findElement(By.xpath(".//*[contains(@name,'billAddress1')]//preceding::td[@align='right']//input[@name='ticketLess']")).click();
		System.out.println("Billing address provided and 'ticket less travel' clicked.");
		Reporter.log("Billing address provided and 'ticket less travel' clicked.");
		
	}
	
	public void deliveryaddress() throws InterruptedException, IOException {
		Thread.sleep(1000);
		
		//Deliver address
		driver.findElement(By.xpath(".//*[contains(@name,'delAddress1')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delAddress1')]")).sendKeys(getdata("deladdress1"));
		
		driver.findElement(By.xpath(".//*[contains(@name,'delAddress2')]")).sendKeys(getdata("deladdress2"));
		
		driver.findElement(By.xpath(".//*[contains(@name,'delCity')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delCity')]")).sendKeys(getdata("delcity"));
		
		driver.findElement(By.xpath(".//*[contains(@name,'delState')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delState')]")).sendKeys(getdata("delstate"));
		
		driver.findElement(By.xpath(".//*[contains(@name,'delZip')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delZip')]")).sendKeys(getdata("delzipcode"));
		
		WebElement delcountry=driver.findElement(By.xpath(".//*[contains(@name,'delCountry')]"));
		Select dd_delcountry = new Select(delcountry);
		dd_delcountry.selectByVisibleText(getdata("delcountry"));
		
		
		
		//Alert screenshot
//		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File(".//images//alert.png"));
//		System.out.println("Alert screenshot taken/saved.");
//		Reporter.log("Alert screenshot taken/saved.");
		
		
		//accept: alert message for out of country delivery.
		driver.switchTo().alert().accept();
		
		//Same as billing address
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'billCountry')]//following::td[@align='right']//input[@type='checkbox']")).click();
		
		System.out.println("Delvery address provided and 'same as billing address' clicked.");
		Reporter.log("Billing address provided and 'same as billing address' clicked.");
		
	}
	
	//screenshot
		public void bookflightscreesnhot() throws IOException {
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//images//bookflight.png"));
		
		System.out.println("Book a flight screenshot taken/saved.");
		Reporter.log("Book a flight screenshot taken/saved.");
		
	}
	
	

}
