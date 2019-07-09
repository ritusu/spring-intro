package com.lti.component;



public class HelloWorld implements Hello {
  
	public HelloWorld() {
		System.out.println("const of hello world");
	}
	public String sayHello(String name) {
		return "Hello " + name + "!";
	}
}
