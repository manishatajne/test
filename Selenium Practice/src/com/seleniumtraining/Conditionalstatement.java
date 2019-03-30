package com.seleniumtraining;

public class Conditionalstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark = 100;
		
		if(mark >= 75) {
			System.out.println("Excellent");
		}
		else if (mark< 75 && mark >=60) {
			System.out.println("Good");
		}
		else {
			System.out.println("Need Improvement");
		}	
			
	}

}
