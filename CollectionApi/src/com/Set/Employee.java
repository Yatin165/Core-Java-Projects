package com.Set;

import java.util.Objects;

public class Employee {
	
	private String name;
	private int id;
	
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return this.name.equals(other.name);
	}


	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	

}
