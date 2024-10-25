package com.qualizeal;

import com.qualizeal.javaapp03.operation.TwoNonDecimalNumbersSubtraction;
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSubtraction twoNonDecimalNumbersSubtraction = new TwoNonDecimalNumbersSubtraction();
		double result1 = twoNonDecimalNumbersSubtraction.subtract(40,20);
		System.out.println(result1);
	}
}