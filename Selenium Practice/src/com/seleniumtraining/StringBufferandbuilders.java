package com.seleniumtraining;

public class StringBufferandbuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer mybuffer = new StringBuffer();
		mybuffer.append("Manisha");
		mybuffer.append(" Tajne");
		System.out.println(mybuffer);
		System.out.println(mybuffer.reverse());
		System.out.println(mybuffer.delete(2, 6));
		
	}
;
}
