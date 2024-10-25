package com.qualizeal.javaapp03;
 
import com.qualizeal.javaapp03.operation.TwoNonDecimalNumbersSubtraction;
 
public class App {

	public static void main(String[] args) {

		TwoNonDecimalNumbersSubtraction subtraction = new TwoNonDecimalNumbersSubtraction();

		int result1 = subtraction.subtract(13,19);

		System.out.println(result1);

	}

}
 