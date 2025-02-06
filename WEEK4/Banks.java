package WEEK4;

import java.util.Scanner;

public class Banks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many banks you want to create");
		int totalBank = sc.nextInt();
		int banks[][] = new int[totalBank][];
		for(int i=0;i<totalBank;i++) {
			System.out.println("enter how many branch for"+(i+1)+" bank");
			int totalBranches = sc.nextInt();
			banks[i] = new int[totalBranches];
			
			for(int j=0;j<totalBranches;j++) {
				System.out.println("enter the number of customer for "+(j+1)+" branch");
				banks[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0;i<totalBank;i++) {
			for(int j=0;j<banks[i].length;j++) {
				System.out.println((i+1)+" bank "+(j+1)+"st branch has "+banks[i][j]);
			}
		}
		
	}

}
