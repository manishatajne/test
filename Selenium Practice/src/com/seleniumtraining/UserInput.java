package com.seleniumtraining;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter text");
		Scanner myscan = new Scanner(System.in);
		String word = myscan.nextLine();
		System.out.println("My input is "+word);	
		myscan.close();
		
	}

}
   