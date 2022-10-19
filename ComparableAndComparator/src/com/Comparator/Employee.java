package com.Comparator;

public class Employee {
	
	private int id;
	private Integer salary;
	private String name;
	
	
	
	
	public Employee(int id, Integer salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Integer getSalary() {
		return salary;
	}




	public void setSalary(Integer salary) {
		this.salary = salary;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
