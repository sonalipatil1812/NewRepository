package com.techno.collections.listprograms;

import java.util.LinkedList;

public class LinkedListStackDequeueDemo {

	public static void main(String[] args) {
            LinkedList linkedList=new LinkedList();
            linkedList.add("Dog");
            linkedList.add("Hourse");
            linkedList.add("Deer");
            linkedList.add("Monkey");
            System.out.println(linkedList);
            
            //Specific method in LinkedList
            linkedList.addFirst("Cat");
            linkedList.addLast("Rabbit");
            System.out.println(linkedList);
            
            //Retrive first and last element
            System.out.println(linkedList.getFirst());
            System.out.println(linkedList.getLast());
            
            
	}

}
