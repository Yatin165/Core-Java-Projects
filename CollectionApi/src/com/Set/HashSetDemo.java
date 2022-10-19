package com.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("ABC",45);
		Employee e2 = new Employee("ABC",41);
		
		Set<Employee> hset = new HashSet();
		
		hset.add(e1);
		hset.add(e2);
		
		System.out.println(hset);
	}

}
