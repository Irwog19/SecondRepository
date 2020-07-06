package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Flight;

public class TC2 extends Basedriver {
	Flow_Flight ff= new Flow_Flight();
	
	@Test
	public void testflight() throws InterruptedException, IOException {
		Thread.sleep(1000);
		ff.flight_flow();
	}
}
