package com.checkedException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\file");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br);
	}

}
