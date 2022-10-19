package com.card;

public class Main {

	public static void main(String[] args) {

		CreditcardCustomer c1 = new CreditcardCustomer();
		c1.setName("ABC");
		c1.setNumber("98754541");
		c1.setcreditLimit(200000.00);
		System.out.println(c1.getName());
		System.out.println(c1.getNumber());
		
		DebitCardCustomer d1 = new DebitCardCustomer();
		d1.setName("XYZ");
		d1.setNumber("54741138");
		d1.setdebitLimit(50000.00);
		System.out.println(d1.getName());
		
	}

}
