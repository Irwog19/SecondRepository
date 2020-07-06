package com.mercury.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_Passengers extends Basedriver {
	public void passengersinfo() throws IOException, InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'passFirst0')]")).sendKeys(getdata("firstname1"));
		driver.findElement(By.xpath(".//*[contains(@name,'passLast0')]")).sendKeys(getdata("lastname1"));
		WebElement meal1 = driver.findElement(By.xpath(".//*[contains(@name,'pass.0.meal')]"));
		Select dd_meal1 = new Select(meal1);
		dd_meal1.selectByVisibleText(getdata("meal1"));

		driver.findElement(By.xpath(".//*[contains(@name,'passFirst1')]")).sendKeys(getdata("firstname2"));
		driver.findElement(By.xpath(".//*[contains(@name,'passLast1')]")).sendKeys(getdata("lastname2"));
		WebElement meal2 = driver.findElement(By.xpath(".//*[contains(@name,'pass.1.meal')]"));
		Select dd_meal2 = new Select(meal2);
		dd_meal2.selectByVisibleText(getdata("meal2"));

		System.out.println("Passengers (2) details furnished.");
		Reporter.log("Passengers (2) details furnished.");

	}
}
