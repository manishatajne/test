package com.seleniumtraining;

public class MathsCalculation {

	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		
		ArithmaticOperations calculation = new ArithmaticOperations(); 
		
		System.out.println("Addition="+calculation.addtion(num1, num2));
		System.out.println("Multipy="+calculation.multipy(num1, num2));
		System.out.println("Divide="+calculation.division(num1, num2));
		System.out.println("Subtraction="+calculation.subtraction(num1, num2));
		
	}
	
}
