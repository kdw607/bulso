package com.java.construct;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX2.xml");
		studentInfo Info = ctx.getBean("studentInfo", studentInfo.class);
		
		Student student2 = ctx.getBean("student", Student.class);
		Info.setStudent(student2);
		Info.getStudentInfo();
		
		ctx.close();
		
	}
}
