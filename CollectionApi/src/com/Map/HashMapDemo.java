package com.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Employee, String> employeeMap = new HashMap<>();
		Employee e1 = new Employee();
		e1.setId(124);
		e1.setName("ABC");
		
		Employee e2 = new Employee();
		e2.setId(124);
		e2.setName("XYZ");
		
		
		employeeMap.put(e1, e1.getName());
		employeeMap.put(e2, e2.getName());
		System.out.println(e1.hashCode());
		
		
		System.out.println(employeeMap);
		System.out.println(e1.hashCode()&15);
		System.out.println(e2.hashCode()&15);
	}

}
