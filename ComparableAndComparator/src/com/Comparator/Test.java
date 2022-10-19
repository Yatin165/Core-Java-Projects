package com.Comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee(117,30000,"Krishna");
		Employee e2 = new Employee(154,50000,"XYZ");
		
		Comparator<Employee> comp = (x,y) -> x.getName().compareTo(y.getName());
		
		System.out.println(comp.compare(e1, e2));
	}

}
