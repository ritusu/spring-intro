package com.lti.component;

import org.springframework.stereotype.Component;

@Component("calc")
public class CalculatorImpl implements Calculator {
	
	public int add(int x,int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	public int sub(int x,int y) {
		// TODO Auto-generated method stub
		return x-y;
	}
	public int multiply(int x,int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
	
	}

