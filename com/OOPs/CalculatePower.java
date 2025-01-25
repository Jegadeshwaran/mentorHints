package com.OOPs;

public class CalculatePower {
	static int power(int base,int exponent) {
		int result =1;
		while(exponent>0) {
			result *=base;
			exponent--;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(power(2,3));
	}

}
