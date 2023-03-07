package com.techno.collections.mapprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A implements Comparator<A> {

	String name;
	int age;

	@Override
	public int compare(A a, A b) {

		return a.name.compareTo(b.name);
	}

	public A() {
		super();
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}

	public A(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		ArrayList al = new ArrayList<A>();
		al.add(new A("R", 1));
		al.add(new A("A", 2));
		al.add(new A("F", 2));
		al.add(new A("X", 2));

		Collections.sort(al, new A());

		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));
	}

}