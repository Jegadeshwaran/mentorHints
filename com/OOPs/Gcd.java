package com.OOPs;

public class Gcd {

	public static void main(String[] args) {
		int n1=3;
		int n2=6;
		int min = n1<n2? n1:n2;
		int gcd=min;
		while(min>1) {
		if((n1%min==0)&&(n2%min==0)) {
			gcd = min;
		}
		min--;
		}
		System.out.println(gcd);
	}

}
