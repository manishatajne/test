package com.seleniumtraining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linklistprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new LinkedList<String>();
		names.add("manisha");
		names.add("trusha");
		names.add("jama");
		System.out.println(names.size());
		System.out.println(names);
		System.out.println(names.get(1));
		names.remove(1);
		System.out.println(names.size());
		System.out.println("------");
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}

	}

}
