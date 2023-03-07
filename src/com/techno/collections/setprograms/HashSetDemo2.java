package com.techno.collections.setprograms;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(5);
		System.out.println(hashSet);

		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(0);
		hashSet2.add(8);
		hashSet2.add(9);
//		System.out.println(hashSet2);
//		
//		hashSet.addAll(hashSet2);
//		System.out.println(hashSet);
//		
//		hashSet.retainAll(hashSet2);
//		System.out.println(hashSet);

		System.out.println(hashSet.containsAll(hashSet2));
        System.out.println(hashSet);

	}

}
