package com.mercury.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_ContinueReservation extends Basedriver {

	// continue to flights
	public void continuefindflight() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'findFlights')]")).click();

	}

	// chose unified airlines flights To & Fro
	public void selectunifiedflight() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@value,'Unified') and contains(@name,'outFlight')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@value,'Unified') and contains(@name,'inFlight')]")).click();

	}

	// continue to reserve
	public void continueReservation() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'reserveFlights')]")).click();

		System.out.println("Continued to Reserve flights.");
		Reporter.log("Continued to Reserve flights.");

	}
}