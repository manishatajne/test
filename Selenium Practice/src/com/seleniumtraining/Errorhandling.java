package com.seleniumtraining;

public class Errorhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			/*int num1 = 5;
			int num2 = 0;
			
			System.out.println(num1/num2);*/
			
			//int num[] = {1, 2, 3,4};
			//System.out.println(num[4]);
			
			String name = null;
			System.out.println(name.length());
			
		
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("This is error.");
			e.printStackTrace();
			e.getMessage();
		}
		
		catch (ArrayIndexOutOfBoundsException  a) {
			// TODO: handle exception
			
			System.out.println("Invalid Input");
		}
		
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Invalid String");
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("This is by default");
		}
		
		finally {
			
			System.out.println("Try later");
		}
	}

}
