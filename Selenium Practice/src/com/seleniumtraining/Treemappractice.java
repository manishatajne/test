package com.seleniumtraining;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemappractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<Integer, String> m = new HashMap<Integer, String>();
		
		Map<Integer, String> m = new TreeMap<Integer, String>();
		
		m.put(564, "Rajneesh");
		m.put(111, "Manisha");
		m.put(267, "Sharad");
		m.put(302, "Shahin");
		System.out.println(m);
		m.remove(3);
		System.out.println(m);
		System.out.println(m.get(1));
		
		Set<Integer> Keys = m.keySet();
		
		for (Iterator iterator = Keys.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			
			System.out.println(key);
			System.out.println(m.get(key));
			
		}
		
	}

}
