package com.calculator.utility;

import java.util.Scanner;

public class UScanner {

	private static final Scanner SCANNER = new Scanner(System.in);
	
	private UScanner() {}

	public static int getInt() {
		return SCANNER.nextInt();
	}

}
