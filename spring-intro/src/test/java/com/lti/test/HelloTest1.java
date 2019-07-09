package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Atm;
import com.lti.component.Calculator;
import com.lti.component.CurrencyConvertor;
import com.lti.component.CurrencyDI;
import com.lti.component.Hello;
import com.lti.component.HelloWorld;
import com.lti.component.TextEditor;

public class HelloTest1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		for( int i=0;i<5;i++) {
		Hello hw = (Hello) context.getBean("hw");
		System.out.println(hw.sayHello("Rone")); }
		
		/*Calculator calc = (Calculator)context.getBean("calc");
		
		System.out.println("Addition is : "+calc.add(20, 10));
		System.out.println("Substraction is : "+calc.sub(20, 10));
		System.out.println("Multiplication is : "+calc.multiply(20, 10));
	
		
		/*CurrencyConvertor cc = (CurrencyConvertor)context.getBean("cc");
		System.out.println("=====Ruppees : Dollars=====");
		System.out.println("Rs." + cc.convertDollarsToRuppees(20) +" = "+"$" + cc.convertRuppeesToDollars(68));*/
		
		
		/*TextEditor txtEdtr  =  (TextEditor) context.getBean("txtEdtr");
		
		txtEdtr.load("Spring.doc"+ " ");
		
		CurrencyConvertor cc = (CurrencyConvertor) context.getBean("cc");
		
		System.out.println(cc.convertDollarsToRuppees(7.0));*/
		
		
		
		//Atm atm = (Atm) context.getBean("hdfc");
	//	atm.withdraw(10000) ;
		
		
		
		
		
	}
	
}
