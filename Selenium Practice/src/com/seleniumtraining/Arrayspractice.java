package com.seleniumtraining;

public class Arrayspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= new int[4];
		
		String name[]= new String[2];
		 
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		
		name[0] = "Manisha";
		name[1] = "Tajne";
		
		//System.out.println(numbers[0]);
		
		for (int i =0; i<=3; i++) 
		{
			System.out.println(numbers[i]);
		}
		for (int n = 0; n<=1; n++)
		{
			System.out.println(name[n]);
		}	
	}
	
}
