package com.OOPs;

public class HourGlassPattern {

	public static void main(String[] args) {
		int n=9;
		int row = (n/2)+1;
		for(int i=0;i<row;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("  ");
			}
			for(int j=i;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=row-2;i>=0;i--) {
			for(int k=0;k<i;k++) {
				System.out.print("  ");
			}
			for(int j=i;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
