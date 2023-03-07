package com.techno.collections.setprograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
      public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(24);
		hashSet.add(33);
		hashSet.add(46);
		hashSet.add(58);
		System.out.println(hashSet);
		
		for (Integer integer : hashSet) {
			  if(integer<78) {
				  System.out.println(integer);
			  }
		}
		HashSet<Integer> hashSet2=new HashSet<Integer>();
		hashSet2.addAll(hashSet);
		System.out.println(hashSet2);
		
		System.out.println(hashSet2.remove(46));
		System.out.println(hashSet2);
	}
}
