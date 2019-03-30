package com.seleniumtraining;

public class LoopingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 4;
		switch (month) {
		case 1:
		case 3:
		case 5:	
		 	System.out.println("31 Days in a month");
			break;
		case 2:	
		case 4:	
		case 6:
			System.out.println("30 Days in a Month");
			break;
		default:
			System.out.println("Invalid Month");
			break;
		}
	}

}
