package com.qualizeal;
 
import com.qualizeal.javaapp03.operation.TwoNonDecimalNumbersSubtraction;
 
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSubtraction twoNonDecimalNumbersSubtraction = new TwoNonDecimalNumbersSubtraction();
		int result1 = twoNonDecimalNumbersSubtraction.subtract(10,2);
		System.out.println(result1);
	}
}
