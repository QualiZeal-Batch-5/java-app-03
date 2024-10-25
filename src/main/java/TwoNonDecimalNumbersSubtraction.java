package com.qualizeal.javaapp03.operation;

public class TwoNonDecimalNumbersSubtraction {
	int res = 0;
	public int subtract(int a, int b) {
		if(a < 0 || b < 0) {
			res = -1;
		} else if(a == 0 || b == 0) {
			res = -2;
		}else {
		res = a - b;
		}
	return res;
}
}
		