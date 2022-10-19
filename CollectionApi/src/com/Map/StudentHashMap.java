package com.Map;

import java.util.HashMap;

public class StudentHashMap {

	public static void main(String[] args) {

		Student s1 = new Student(11, "Rahul", 92);
		Student s2 = new Student(12, "Ankit", 94);
		Student s3 = new Student(13, "Yatin", 96);
		Student s4 = new Student(14, "Pankaj", 99);
		Student s5 = new Student(15, "Kartik", 92);
		
		
		HashMap<Student,String> hmap = new HashMap<>();
		hmap.put(s1, "ABC");
		hmap.put(s2, "LMN");
		hmap.put(s3, "PQR");
		hmap.put(s4, "XYZ");
		hmap.put(s5, "GHI");
		
		
		System.out.println(hmap);
	}

}
