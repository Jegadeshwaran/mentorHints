package com.OOPs;

public class CalculatePerimeter {
	static int findPerimeter(int oneSide) {
		return 4*oneSide;
	}
	static int findPerimeter(int width,int height) {
		return 2 * (width+height);
	}
	

	public static void main(String[] args) {
		int width=10;
		int height =8;
		if(width==height)
			System.out.println(findPerimeter(width));
		else
			System.out.println(findPerimeter(width,height));
	}

}
