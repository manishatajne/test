package com.seleniumtraining;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][]= {{7,9,0,7},{6,10,13,4},{3,2,7,9},{6,9,15,27}};
	
		//System.out.println(num[3][3]);
		
		for (int row = 0; row < num.length; row++) {
			
			System.out.println();
			for (int col = 0; col < num[row].length; col++) {
				
				System.out.print(num[row][col]+"\t");
			}
		}
	
	}
	

}
