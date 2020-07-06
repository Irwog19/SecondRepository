package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Passengers;

public class Flow_Passengers extends Basedriver {
	Page_Passengers ppi = new Page_Passengers();
	public void passengerinfo_flow() throws IOException, InterruptedException {
		ppi.passengersinfo();
	}

}
