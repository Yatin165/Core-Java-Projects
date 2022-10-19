package com.oops;

public class Animal extends LivingBeing {
	
	String name;
	
	Animal(){
		super(12);
		System.out.println("Animal object is created");
	}
	
	void setNameOfAnimal(String name) {
		this.name = name;
	}

}
