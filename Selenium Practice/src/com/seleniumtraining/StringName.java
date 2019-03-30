package com.seleniumtraining;

public class StringName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstname = "Manisha is my name";
		String lastname = "Tajne";
				
		String fullname = firstname+lastname ;
		//System.out.println(fullname);
		//System.out.println(fullname.length());
		//System.out.println(fullname.charAt(2));
		//System.out.println(fullname.equalsIgnoreCase(lastname));
		//System.out.println(fullname.startsWith("M"));
		//System.out.println(fullname.endsWith("e"));
		//System.out.println(fullname.toLowerCase());
		//System.out.println(fullname.toUpperCase());
		//System.out.println(fullname.trim());
		//System.out.println(fullname.substring(2));
		//System.out.println(fullname.substring(2,5));
		//System.out.println(fullname.subSequence(5,7));
		//System.out.println(fullname.replace("a","S"));
		System.out.println(firstname.split(" ")[3]);
	}
}