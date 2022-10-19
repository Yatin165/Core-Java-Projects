package com.Comparable;

import java.util.Comparator;

public class Student implements Comparator<Student>{
	
	private String name;
	private Integer marks;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}





	public Student(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}





	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
