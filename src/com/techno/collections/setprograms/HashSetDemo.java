package com.techno.collections.setprograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();

		hashSet.add(58);
		hashSet.add("sonali");
		hashSet.add('S');
		hashSet.add(12.00);
		hashSet.add(true);
		hashSet.add(null);
		System.out.println(hashSet);

		hashSet.remove('S');
		System.out.println(hashSet);

		System.out.println(hashSet.contains(58));
		System.out.println(hashSet.containsAll(hashSet));

		Iterator it = hashSet.iterator();
		while (it.hasNext()) {
			it.next();
		}
		System.out.println(hashSet);
		
//		for(int i=0;i<hashSet.size();i++) {
//			System.out.println(hashSet);
//		}
	}
}
