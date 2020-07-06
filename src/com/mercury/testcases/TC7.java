package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_PurchaseAndBackToHome;

public class TC7 extends Basedriver {
	Flow_PurchaseAndBackToHome fpb = new Flow_PurchaseAndBackToHome();
	
	@Test
	public void purchaseandbackhome() throws InterruptedException, IOException {
		fpb.purchaseandbackhome();
	}

}
