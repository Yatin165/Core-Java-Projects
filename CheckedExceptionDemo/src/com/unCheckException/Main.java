package com.unCheckException;

public class Main {
	
	public static void main(String[] args) {
		
		
		System.out.println(print());
	}
		
	
	public static int print() {
		try {
			int x = 100/0;
			return 1;
		}catch(Exception e) {
			return 2;
		}finally {
			return 3;
		}
		
		
	}
		

}
