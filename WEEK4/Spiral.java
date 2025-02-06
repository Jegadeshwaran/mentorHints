package WEEK4;

public class Spiral {
	static void printSpiralElement(int[][] array) {
		int n=array[0].length;
		int top=0;
		int down = n-1;
		int left =0;
		int right =n-1;
		int dir=0;
		while(top<=down && left<=right) {
			if(dir==0) {
				for(int i=left;i<=right;i++) {
					System.out.println(array[top][i]);
				}
				top +=1;
			}
			else if(dir==1) {
				for(int i=top;i<=down;i++) {
					System.out.println(array[i][right]);
				}
				right -=1;
			}
			else if(dir==3) {
				for(int i=right;i>=left;i--) {
					System.out.println(array[down][i]);
				}
				down -=1;
			}
			else if(dir==4) {
				for(int i=down;i>=top;i--) {
					System.out.println(array[i][left]);
				}
				left +=1;
			}
			dir = (dir+1)%4;
		}
	}
	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		printSpiralElement(array);
	}

}
