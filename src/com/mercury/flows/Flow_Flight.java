package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Flight;

public class Flow_Flight extends Basedriver {
	Page_Flight pf = new Page_Flight();
	
	public void flight_flow() throws InterruptedException, IOException {
		pf.triptype();
		pf.noofpassengers();
		pf.departfrom();
		pf.departmonth();
		pf.departday();
		pf.arrivein();
		pf.returnmonth();
		pf.returnday();
		pf.preferences();
		pf.flightscreenshot();
	}

}
