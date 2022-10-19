package com.List;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		list.add("Object1");
		list.add("Object2");
		list.add("Object3");
		list.add("Object4");
		list.add("Object5");
		
		
		
		System.out.println(list);
		
		
		
		list2.add("Object6");
		list2.add("Object7");
		list2.add("Object8");
		list2.add("Object9");
		
		System.out.println(list.addAll(5, list2));
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
	}

}
