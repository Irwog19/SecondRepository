package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_BillingAndDeliveryAddress;

public class TC6 extends Basedriver {
	Flow_BillingAndDeliveryAddress fbd=new Flow_BillingAndDeliveryAddress();
	
	@Test
	public void testaddress() throws InterruptedException, IOException {
		fbd.Address_flow();
	}

}
