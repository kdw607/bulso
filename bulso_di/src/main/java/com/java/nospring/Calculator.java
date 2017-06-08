package com.java.nospring;

public class Calculator {
	
	private MyCalculator myCalculator;
	
	public Calculator(MyCalculator myCalculator) {
		this.myCalculator = myCalculator;
	}

	public void addition(int firstNum, int secondNum) {
		System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
	}

	public void substraction(int firstNum, int secondNum) {
		System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));	
	}

	public void multiplication(int firstNum, int secondNum) {
		System.out.println(firstNum + "*" + secondNum + "=" + (firstNum * secondNum));			
	}

	public void division(int firstNum, int secondNum) {
		System.out.println(firstNum + "/" + secondNum + "=" + (firstNum / secondNum));	
	}

}