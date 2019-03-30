package com.seleniumtraining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
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
			String name = (String) iterator.next();
			System.out.println(name);
		}

	}

}
