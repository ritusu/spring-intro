package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("icici")
public class IciciBank implements Bank {
	
	
	
	public void communicate() {
		
	System.out.println("success");
		
	}

}
