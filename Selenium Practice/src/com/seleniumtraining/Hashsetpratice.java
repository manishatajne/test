package com.seleniumtraining;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Hashsetpratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet<String> names = new HashSet<String>();
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("Manisha");
		names.add("Trusha");
		names.add("Jama");
		names.add("Jama");
		System.out.println(names.size());
		System.out.println(names);
		names.remove("Manisha");
		System.out.println(names.size());
		System.out.println(names);
		
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
	
	}

}
