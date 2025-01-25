package com.OOPs;

public class HallowSquarePattern {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(j==0 || j==n-1) {
				System.out.print("* ");
			}
			else if(i==0 || i==n-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}

	}

}
