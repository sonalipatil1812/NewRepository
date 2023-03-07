package com.techno.collections.mapprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "sonali", 25));
		list.add(new Student(2, "sona", 25));
		list.add(new Student(3, "sonu", 25));

//		Student student=new Student(1, "sonali", 26);

		Map<Integer, String> map = new HashMap<Integer, String>();
		for (Student student : list) {
			map.put(student.getId(), student.getName());
//	     map.put(1, student);
		}
		System.out.println(map);
		
		Map<Integer, Student> collect = list.stream().collect(Collectors.toMap(Student::getId, Function.identity()));
		System.out.println(collect);

	}

}
