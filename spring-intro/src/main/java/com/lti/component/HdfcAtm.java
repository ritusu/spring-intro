package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hdfc")
public class HdfcAtm implements Atm {
	
	
	@Autowired
	@Qualifier("icici")
	private Bank bankDI;
	public void withdraw(int x) {
		
		System.out.println("i got my CASH.............!");
		bankDI.communicate();
		
	}

}
