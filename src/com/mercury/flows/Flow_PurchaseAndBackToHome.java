package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_PurchaseAndBackToHome;

public class Flow_PurchaseAndBackToHome extends Basedriver {
	Page_PurchaseAndBackToHome ppb = new Page_PurchaseAndBackToHome();
	public void purchaseandbackhome() throws InterruptedException, IOException {
		ppb.purchaseticket();
		ppb.backtohomescreen();
		ppb.screenshothome();
	}

}
