package com.List;

public class Student {
	
	private int id, marks;
	private String name;
	
	
	
	
	public Student(int id, int marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}




	@Override
	public String toString() {
		return "Strudent [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
	
	

}
