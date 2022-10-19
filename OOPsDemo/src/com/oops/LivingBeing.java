package com.oops;

public class LivingBeing {
	
	String type;
	LivingBeing(int x){
		System.out.println("parameter const ");
	}
	
	LivingBeing(){
		System.out.println("LivingBeing object is created");
	}
	
	
	void setTypeofLivingBeing(String type){
		
		this.type = type;
	}

}
