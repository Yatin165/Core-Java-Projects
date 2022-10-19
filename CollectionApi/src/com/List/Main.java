package com.List;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student(541,95,"Keshav");
		Student s2 = new Student(123,91,"Chirag");
		Student s3 = new Student(654,96,"Mahesh");
		Student s4 = new Student(954,93,"ABC");
		Student s5 = new Student(478,94,"PQR");
		
		
		LinkedList<Student> listOfStudents = new LinkedList<>();
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		listOfStudents.add(s5);
		
		
		System.out.println(listOfStudents);
	}

}
