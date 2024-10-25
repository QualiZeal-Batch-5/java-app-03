package com.qualizeal.javaapp03.operation;
public class TwoNonDecimalNumbersSubtraction {
	public int subtract(int number1,int number2) {
		if (number1 <0 || number2 < 0){
			return -1;
		} else if(number1 == 0 || number2 ==0){
			return -2;
		}
		else{
			return (number1 - number2);
		}
	}
}