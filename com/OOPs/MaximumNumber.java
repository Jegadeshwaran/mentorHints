package com.OOPs;

public class MaximumNumber {
	static int findMax(int a,int b) {
		return a>b? a:b;
	}
	static double findMax(double a,double b) {
		return a>b? a:b;
	}
	static double findMax(int a,double b) {
		return a>b? a:b;
	}
	static double findMax(double a,int b) {
		return a>b? a:b;
	}

	public static void main(String[] args) {
		System.out.println(findMax(5.5,5.1));
	}

}
