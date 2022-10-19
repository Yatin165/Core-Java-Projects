package com.List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> nameOftheStudent = new LinkedList<>();
		nameOftheStudent.add("ABC");
		nameOftheStudent.add("fdsdf");
		nameOftheStudent.add("dfsd");
		
		List<Integer> list = List.of(1,2,3,4);
		List<Integer> list2 = Arrays.asList(1,5,7,6);
		
		System.out.println(list.getClass());
	}

}
