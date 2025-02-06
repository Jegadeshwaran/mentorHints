package WEEK4;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find the index");
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				System.out.println(i);
			}
		}
	}

}
