package com.qualizeal.javaapp03.operation;

public class TwoNonDecimalNumbersSubtraction {
	public long subtract(int num1, int num2){
		long result = 0;

		if (num1 <0 || num2 < 0){
			result = -1;
		} else if(num1 == 0 || num2 ==0){
			result = -2;
		}
		else{
			result  = (long)num1 - num2;
		}
		return (long)result;
	}
}