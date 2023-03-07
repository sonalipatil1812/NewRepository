package com.techno.collections.listprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPrograms {
    public static void main(String[] args) {
		 ArrayList al=new ArrayList(); //For Heterogeneous value
		 al.add(10);
		 al.add("sonali");
		 al.add(10.00);
		 al.add('S');
		 System.out.println(al);
		 
		 ArrayList<String> arrayList=new ArrayList<String>();
		 
		 //Add the elements
		 arrayList.add("Apple");
		 arrayList.add("Oranges");
		 arrayList.add("Banana");
		 
		 //Add elements using index
		 arrayList.add(1, "Grapes");
		 
		 //Add a List using index value
		 arrayList.addAll(2, al);
		 System.out.println(arrayList);
		 
		 
		 //check size
		 System.out.println("Size of ArrrayList : "+arrayList.size());
		 
		 //remove the elements using index
		 arrayList.remove(5);
		 System.out.println("After the removing the elements using index: "+arrayList);
		 System.out.println("Size of ArrrayList : "+arrayList.size());
		 
		 
		 //remove the elements using value
		 arrayList.remove("Grapes");
		 System.out.println("After the removing the elements using value: "+arrayList);
		 
		 System.out.println(arrayList);
		 //retrive the specific elements
		 System.out.println("Retrive the specific elements: "+ arrayList.get(2));
		 
		 //update the specific elements
		 System.out.println("Update the element: "+arrayList.set(2, "sona"));
		 System.out.println(arrayList);

		 //search the value
		 System.out.println("the "+arrayList.get(2)+" is prensent is "+arrayList.contains("sona"));
		 
		 //remove the elements
		 System.out.println(arrayList.removeAll(arrayList));
		 
		 //check empty or not
		 System.out.println(arrayList.isEmpty());
		 
		 arrayList.add("sonali");
		 arrayList.add("nita");
		 arrayList.add("priyanka");
		 arrayList.add("pooja");
		 System.out.println("New Array List: "+arrayList);
		 Collections.sort(arrayList);
		 System.out.println("Sorted ArrayList: "+arrayList);
		 
		 Collections.sort(arrayList,Collections.reverseOrder());
		 System.out.println("Array List of reverse order: "+arrayList);
		 
		 //For loop
//		 for(int i=0;i<arrayList.size();i++) {
//			 System.out.println(arrayList.get(i));
//		 }
		 
		 
		 //For Each
//		 for (String string : arrayList) {
//			 System.out.println(string);
//		}
		 
		 
		 //Using Iterator
		 Iterator it=arrayList.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		 
		 Collections.shuffle(arrayList);
		 System.out.println(arrayList);
		 
	}
}
