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

public class Page_Flight extends Basedriver {
	public void triptype() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@value,'oneway')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@value,'roundtrip')]")).click();		
	}
	public void noofpassengers() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement passengers = driver.findElement(By.xpath(".//*[contains(@name,'passCount')]"));
		Select dd_passengers = new Select(passengers);
		dd_passengers.selectByValue(getdata("noofpassengers"));		
	}
	public void departfrom() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement departfrom = driver.findElement(By.xpath(".//*[contains(@name,'fromPort')]"));
		Select dd_departfrom = new Select(departfrom);
		dd_departfrom.selectByValue(getdata("departfrom"));
	}
	public void departmonth() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement departmonth = driver.findElement(By.xpath(".//*[contains(@name,'fromMonth')]"));
		Select dd_departmonth = new Select(departmonth);
		dd_departmonth.selectByValue(getdata("departmonth"));
	}
	public void departday() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement departday = driver.findElement(By.xpath(".//*[contains(@name,'fromDay')]"));
		Select dd_departday = new Select(departday);
		dd_departday.selectByValue(getdata("departday"));		
	}
	public void arrivein() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement arrivein = driver.findElement(By.xpath(".//*[contains(@name,'toPort')]"));
		Select dd_arrivein = new Select(arrivein);
		dd_arrivein.selectByValue(getdata("arrivein"));
	}
	public void returnmonth() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement returnmonth = driver.findElement(By.xpath(".//*[contains(@name,'toMonth')]"));
		Select dd_returnmonth = new Select(returnmonth);
		dd_returnmonth.selectByValue(getdata("returnmonth"));
	}
	public void returnday() throws InterruptedException, IOException {
		Thread.sleep(1000);
		WebElement returnday = driver.findElement(By.xpath(".//*[contains(@name,'toDay')]"));
		Select dd_returnday = new Select(returnday);
		dd_returnday.selectByVisibleText(getdata("returnday")); 	
	}
	public void preferences() throws InterruptedException, IOException {		
		//serviceclass
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@value,'First')]")).click();
		
		//airlines
		Thread.sleep(1000);WebElement airline= driver.findElement(By.xpath(".//*[contains(@name,'airline')]"));
		Select dd_airline = new Select(airline);
		dd_airline.selectByVisibleText(getdata("airline"));
		
		System.out.println("Flight details selected.");
		Reporter.log("Flight details selected.");
			
	}
	public void flightscreenshot() throws IOException, InterruptedException {
		Thread.sleep(1000);
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//images//flight.png"));
		
		System.out.println("Flight screenshot taken/saved.");
		Reporter.log("Flight screenshot taken/saved.");	
		
	}















}

