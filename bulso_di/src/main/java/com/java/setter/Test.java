package com.java.setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Test {	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
			
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();

	}
}