package com.qualizeal.javaapp03;
import com.qualizeal.javaapp03.operation.TwoNonDecimalNumbersSubtraction;
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSubtraction twoNonDecimalNumbersSubtraction = new TwoNonDecimalNumbersSubtraction();
		int result1 = twoNonDecimalNumbersSubtraction.subtract(10,3);
		System.out.println(result1);
		int result2 = twoNonDecimalNumbersSubtraction.subtract(10,4);
		System.out.println(result2);
	}
}