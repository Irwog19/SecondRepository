package com.mercury.flows;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_ContinueReservation;

public class Flow_ContinueReservation extends Basedriver {
	Page_ContinueReservation pcr= new Page_ContinueReservation();
	public void continuetoreservation() throws InterruptedException {
		pcr.continuefindflight();
		pcr.selectunifiedflight();
		pcr.continueReservation();
	}

}
