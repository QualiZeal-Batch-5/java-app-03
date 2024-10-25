package com.qualizeal.javaapp03.operation;
public class TwoNonDecimalNumbersSubtraction {
public long subtract(int a,int b) {
int result = 0;
if(a<0 || b<0) {
result = -1; }
else if(a == 0 || b == 0) {
result = -2;
} else {
result = a - b;
}
return result;
}
}