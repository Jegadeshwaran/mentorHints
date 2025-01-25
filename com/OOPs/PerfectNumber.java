package com.OOPs;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=6;
		int totalFactor=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				totalFactor +=i;
		}
		if(totalFactor == n)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
