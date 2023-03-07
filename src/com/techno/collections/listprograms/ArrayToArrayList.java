package com.techno.collections.listprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
   public static void main(String[] args) {
	String arr[]= {"sonali","sona","priya","Priyanka"};
	for (String string : arr) {
		System.out.println(string);
	}
	
	ArrayList<Integer> arrayList=new ArrayList(Arrays.asList(arr));
	System.out.println(arrayList);
}
}
