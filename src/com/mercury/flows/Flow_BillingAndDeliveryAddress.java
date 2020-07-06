package com.mercury.flows;

import java.io.IOException;

import com.mercury.pages.Page_BillingAndDeliveryAddress;

public class Flow_BillingAndDeliveryAddress {
	Page_BillingAndDeliveryAddress pbd= new Page_BillingAndDeliveryAddress();
	public void Address_flow() throws InterruptedException, IOException {
		pbd.billingaddress();
		pbd.deliveryaddress();
		pbd.bookflightscreesnhot();
	}

}
