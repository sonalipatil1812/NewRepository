package com.techno.collections.listprograms;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrograms {
	
	 public static void main(String[] args) {
		 LinkedList linkedList=new LinkedList(); //Heterogeneous data
	        
//       LinkedList<Integer> linkedList2=new LinkedList<Integer>(); //Homogeneous data
       
		 
	   //Add the element in linked list
       linkedList.add(100);
       linkedList.add("welcome");
       linkedList.add(15.00);
       linkedList.add('A');
       linkedList.add(true);
       linkedList.add(null);
       
       System.out.println("List of Linked List: "+linkedList);
       
       //Check size of linked list
       System.out.println("Size of Linked List: "+linkedList.size());
       
       
       //Remove the value from LL using value
       System.out.println("Remove element from LL using value: "+linkedList.remove("welcome"));
       System.out.println(linkedList);
       
      //Remove the value from LL using index
       System.out.println("Remove element from LL using value: "+linkedList.remove(4));
       System.out.println(linkedList);
       
       //Add value using index
       linkedList.add(1, "welcome");
       System.out.println("Add element in LL using index and value: "+linkedList);
       
       
       //retrive the element from LL
       System.out.println("Retrive the data: "+linkedList.get(1));
       
       //update the element
       System.out.println("Update the data: "+linkedList.set(2, 17.06));
       System.out.println(linkedList);
       
       //Search the element in LL
       System.out.println("Search the element: "+linkedList.contains("welcome"));
       
       
       //Check empty or not
       System.out.println("LL is empty: "+linkedList.isEmpty());
       
       System.out.println("Using Iterator:");
       Iterator it=linkedList.iterator();
       while (it.hasNext()) {
         System.out.println(it.next());		
	}
       
       LinkedList<String> linkedList2=new LinkedList<String>();
       linkedList2.add("A");
       linkedList2.add("G");
       linkedList2.add("W");
       linkedList2.add("D");
       linkedList2.add("T");
       System.out.println(linkedList2);
       Collections.sort(linkedList2);
       System.out.println(linkedList2);
       
       //Reverse Order
       Collections.sort(linkedList2,Collections.reverseOrder());
       System.out.println(linkedList2);
       
       //Shuffle elements
       Collections.shuffle(linkedList2);
       System.out.println(linkedList2);
       
       
	}
        
        
}
