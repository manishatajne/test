package com.seleniumtraining;

public class InterestCalculation {

	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
		int R,T;
		double P;
		
		P= 1000;
		R= 10;
		T= 5; 
		
		double si = P*R*T/100; 
		double ci = P*(Math.pow(1+R/100,T));
		
		System.out.println("Simple Interest is "+si);
		System.out.println("Compound Interest is "+ci);
			
	}

}
