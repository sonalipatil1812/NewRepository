package com.techno.collections.setprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;


public class LinkedHsahSetDemo {
    public static void main(String[] args) {
		LinkedHashSet<Integer> hashSet=new LinkedHashSet<Integer>();
		hashSet.add(700);
		hashSet.add(200);
		hashSet.add(300);
		hashSet.add(400);
		boolean add = hashSet.add(100);
		System.out.println(add);
		System.out.println(hashSet);
		
		Iterator it=hashSet.iterator();
		while (it.hasNext()) {
            System.out.println("Iterator: "+it.next());			
		}
		
		//To sort values first convert set to list
	      List<Integer> list=new ArrayList<Integer>(hashSet);
	      Collections.sort(list);
	      System.out.println(list);
	      
	      Collections.reverse(list);
	      System.out.println(list);
	      
	   //uniuqe value from two set   
	   LinkedHashSet<Integer> hashSet2=new LinkedHashSet<Integer>(Arrays.asList(304,200,54,67));
	   boolean retainAll = hashSet2.retainAll(hashSet);
	   System.out.println(retainAll);
	   System.out.println("Unique value from two set: "+hashSet2);
	   
	   //difference value
	   hashSet.removeAll(hashSet2);
	   System.out.println("Different value from two set "+hashSet);
	      
	      
	}
}
