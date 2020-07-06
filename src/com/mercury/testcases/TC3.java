package com.mercury.testcases;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_ContinueReservation;

public class TC3 extends Basedriver {
	Flow_ContinueReservation fcr= new Flow_ContinueReservation();
	
	@Test
	public void testcontinuetoreserve() throws InterruptedException {
		fcr.continuetoreservation();
	}
}
