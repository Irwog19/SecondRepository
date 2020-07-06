package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Passengers;

public class TC4 extends Basedriver {
	Flow_Passengers fpi= new Flow_Passengers();
	
	@Test
	public void testpassengerinfo() throws IOException, InterruptedException{
		fpi.passengerinfo_flow();
		
		
	}
}
