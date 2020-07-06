package com.mercury.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_CreditCard extends Basedriver {
	public void creditcardinfo() throws InterruptedException, IOException {
		Thread.sleep(1000);
		//card type
		WebElement cardtype = driver.findElement(By.xpath(".//*[contains(@name,'creditCard')]"));
		Select dd_cardtype = new Select(cardtype);
		dd_cardtype.selectByVisibleText(getdata("cardtype"));
		
		//card number
		driver.findElement(By.xpath(".//*[contains(@name,'creditnumber')]")).sendKeys(getdata("cardnumber"));
		
		//expiry month
		WebElement expirymonth = driver.findElement(By.xpath(".//*[contains(@name,'cc_exp_dt_mn')]"));
		Select dd_expirymonth = new Select(expirymonth);
		dd_expirymonth.selectByVisibleText(getdata("expirymonth"));
		
		//expiry year
		WebElement expiryyear = driver.findElement(By.xpath(".//*[contains(@name,'cc_exp_dt_yr')]"));
		Select dd_expiryyear = new Select(expiryyear);
		dd_expiryyear.selectByValue(getdata("expiryyear"));
		
		//card holder details
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'cc_frst_name')]")).sendKeys(getdata("firstname"));
		driver.findElement(By.xpath(".//*[contains(@name,'cc_mid_name')]")).sendKeys(getdata("middlename"));
		driver.findElement(By.xpath(".//*[contains(@name,'cc_last_name')]")).sendKeys(getdata("lastname"));
		
		
		System.out.println("credit card details furnished.");
		Reporter.log("credit card details furnished.");
		
	
	
	}
	
	

}
