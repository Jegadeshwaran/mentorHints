package com.OOPs;

public class PolygonArea {
	
	static int findArea(int sides,int length,int apothem) {
		
		return (sides*length*apothem)/2;
	}
	static int findArea(int sides,int length) {
		double radian = 3.14/sides;
		double tan = Math.tan(radian);
		return (int)((sides*(length*length))/(4*tan));
	}
	
	public static void main(String[] args) {
		System.out.println(findArea(8,8,6));
	}

}
