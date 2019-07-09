package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cc")//alternative to <bean id=".." class="..">
public class CurrencyConvertor {
	
	
	@Autowired
	private CurrencyDI cdi;

	public double convertDollarsToRuppees(double dollars) {
		return dollars*cdi.actualDollar();
	}
	public double convertRuppeesToDollars(double ruppee) {
		return ruppee/cdi.actualDollar();
	}
	
}
