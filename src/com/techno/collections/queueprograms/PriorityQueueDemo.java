package com.techno.collections.queueprograms;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> integers = new PriorityQueue<Integer>();
		integers.add(100);
		integers.add(200);
		integers.add(300);
		integers.add(100);
		integers.offer(400);
		integers.offer(400);
		System.out.println(integers);

		System.out.println(integers.element());
		System.out.println(integers.peek());

		System.out.println(integers.remove());
		System.out.println(integers);

		System.out.println(integers.poll());
		System.err.println(integers);

		Iterator it = integers.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		PriorityQueue<Integer> integers2 = new PriorityQueue<Integer>();
		integers2.add(11);
		integers2.offer(22);
		integers2.add(33);
		integers2.offer(44);
		integers2.add(22);
		integers2.offer(55);
		System.out.println();
		System.out.println(integers2);
	}
}
