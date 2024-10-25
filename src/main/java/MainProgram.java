package com.qualizeal;

import com.qualizeal.javaapp03.operation.TwoNonDecimalNumbersSubtraction;

public class MainProgram {
	
	public static void main(String[] args){
		
		TwoNonDecimalNumbersSubtraction twoNonDecimalNumbersSubtraction = new TwoNonDecimalNumbersSubtraction();
		int result = twoNonDecimalNumbersSubtraction.subtract(10,2);
		
		System.out.println(result);
	}
}